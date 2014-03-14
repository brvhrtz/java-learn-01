/*
Define a class ColorPoint that:
is a subclass of the Point class
has a (protected) field of type String called color (in addition to fields x and y)
has 3 public constructors:
0 args: x and y are set to 0; color is set to "red";
2 int args: x and y are set to the given values; color is set to "red"
2 int args and 1 String arg: x, y, and color are set to the given values
*/
public class HelloWorld{
     public static void main(String []args){
        int [] A; A = new int[10]; A[1] = 1; 
        for(int i = 0; i<A.length; i++) System.out.println(A[i]); 
     }
}
class Point {
        protected int x, y;  
        public Point() {// no-arg constructor
            x = y = 0;
        }
        public Point(int a, int b) { // constructor with 2 args
            x = a;y = b;
        }
    }
    /*
    class ColorPoint extends Point {
        protected String color; 
        public ColorPoint() {
            super(); 
            color = "red"; 
        }
        public ColorPoint(int a, int b){
            x = a; y = b; 
            color = "read"; 
        }
        public ColorPoint(int a, int b, String s){
            x = a; y = b; 
            color = s; 
        }
    }
    */
