package Assigment1;

import java.util.ArrayList;

public class Shape {
    private ArrayList <Point > points ;
    //private ArrayList <Point> point;

    public  Shape (){
        points =  new ArrayList<>();
      }
   public  void addPoint (Point p ){
     points.add(p);
 }
    public void getPoints(){
        for (int i = 0; i < points.size(); i++) {
            System.out.println(points.get(i).getX()  + " " +   points.get(i).getY());
         }
    }
    public  double  calculatePerimeter (){
        double  Perimetr = 0 ;
        for (int i = 0; i < points.size()-1; i++) {
           Perimetr += Math.sqrt(Math.pow(points.get(i).getX() - points.get(i+1).getX(), 2 ) + Math.pow(points.get(i).getY() - points.get(i+1).getY(), 2 ) );
        }
        return  Perimetr;
     }
    public  void longestSide (){
        int max  = Integer.MIN_VALUE;
        for (int i = 0; i < points.size()-1; i++) {
            max  = Math.max(max , (int) Math.sqrt(Math.pow(points.get(i).getX() + points.get(i+1).getX(), 2 ) + Math.pow(points.get(i).getY() + points.get(i+1).getY(), 2 ) ) );
        }
        System.out.println(max);
    }
    public  void averageOfAllSides(){
       double p =  calculatePerimeter();
       // get perimetr
       double average = p/points.size();
        System.out.println(average);
    }
}
