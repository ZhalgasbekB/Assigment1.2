package Assigment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public  static  void main (String []  args) throws FileNotFoundException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\PracticeLectureOOP\\src\\Assigment1\\file1.txt");
         // We create  file
          Scanner sc = new Scanner(file);
          // We check a  file
           Parsel paresl = new Parsel();
         // We create because we need to  parsel from  line to int
        Shape ss  = new Shape();
        // We create a shape
        Point p   =  new Point();
        while (sc.hasNextLine()){
            String s  = sc.nextLine();
            // We add only  one  line
            System.out.println(p.distence(paresl.parselToInt(s)));
            //  We sent x  and  y  for get distance relatively x0 and y0
             ss.addPoint(paresl.parselToInt(s));
             // And the  next we put or  add from parsel
         }
        ss.getPoints();
        // At last we get all numbers from dynemic array
         System.out.println(ss.calculatePerimeter());
        // We calculate this one to get perimetr
        ss.longestSide();
        // At this  we get a longest side
        ss.averageOfAllSides();
    }
}
