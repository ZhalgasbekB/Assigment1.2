package Assigment1;

public class Parsel {
    public  Point parselToInt( String Line){
        String [] str = Line.trim().split(",");
        int x   =  Integer.parseInt(str[0].trim());
        int y   =  Integer.parseInt(str[1].trim());
        return  new Point(x ,y);
    }
}
