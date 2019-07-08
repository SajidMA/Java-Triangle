// Sajid Ahmed
// Lab 6

package trianglehw1;

import java.util.Random;
public class Triangle1 
{
    // private data section
    private int side1, side2, side3;
    private String color;
    private static int count = 0;
    
    // public methods section
    public Triangle1() // first constructor with no parameters
    {
        count++; // adds 1 to created rectangle count
        side1 = 3;
        side2 = 4;
        side3 = 5;
        color = "red";
    }
    
    public Triangle1 (int s1, int s2, String c) // second contructor to construct and initialize
    {
        count++; // adds 1 to created rectangle count
        side1 = s1;
        side2 = s2;
        color = c;
        // randomly generate side3 using the triangle inequality rule
        Random randgen = new Random();
        int max;
        int min;
        min = Math.abs(Math.abs(side1) - Math.abs(side2)) + 1;
        max = Math.abs(side1) + Math.abs(side2) - 1;
        side3 = randgen.nextInt((max - min) + 1) + min;
    }
    
    // mutators = setters
    public void setSide1(int s1)
    {
        side1 = s1;
    }
    
    public void setSide2(int s2)
    {
        side2 = s2;
    }
    
    public void setcolor(String col)
    {
        color = col;
    }
    
    // accessors = getters
    public int getSide1()
    {
        return side1;
    }
    
    public int getSide2()
    {
        return side2;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // method to calculate and return the perimeter
    public int perimeter()
    {
        int perimeter = side1 + side2 + side3;
        return perimeter;
    }
    
    // method to calculate and return the area
    public double area()
    {
        double s = ((side1 + side2 + side3)/(2.0));
        double area = Math.sqrt((s) * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    
    // method to get the number of rectangles created
    public static int getCount()
    {
        System.out.println(count);
        return count;
    }
    
    // method to print everything as a String
   public String toString()
   {
       String result = "Triangle: side1 = " 
               + Integer.toString(side1)
               + ", side2 = " 
               + Integer.toString(side2)
               + ", side3 = "
               + Integer.toString(side3)
               + ", color = "
               + color
               + ", perimeter = "
               + Integer.toString(perimeter())
               + ", area = "
               + Double.toString(area());
      
       return result;
   }
}