// Sajid Ahmed
// Lab 6

package trianglehw1;


public class TriangleHW1 {

    public static void main(String[] args) {
                
        Triangle1 tr1 = new Triangle1();
        Triangle1 tr2 = new Triangle1();
        
        Triangle1 tr3 = new Triangle1(5, 11, "blue");
        Triangle1 tr4 = new Triangle1(3, 7, "yellow");
        
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);
        System.out.println(tr4);
        
        Triangle1.getCount();
    }
    
}
