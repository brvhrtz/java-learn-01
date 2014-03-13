public class Point implements Cloneable {
/*
    private int x, y;     
    public String toString() {return "(" + x + ", " + y + ")";} 
    public void SetPoint(int a, int b) {x = a; y = b; }
    public Object clone() {
        try{
            return super.clone(); 
        } catch (CloneNotSupportedException ex){
            throw new InternalError(ex.toString()); 
        }
    }
*/
    private int [] coords = new int[2]; 
    public String toString(){ 
        return "(" + coords[0] + ", " + coords[1] + ")" ; 
    }
    public void SetPoint(int a, int b) {
        coords[0] = a; 
        coords[1] = b; 
    }
    public Object clone(){
        try{
            Point tmp = (Point) super.clone(); 
            tmp.coords = (int [])coords.clone();
            return tmp; 
        } catch (CloneNotSupportedException ex){
            throw new InternalError(ex.toString()); 
        }
    }
    public static void main(String [] args) {
        Point p1 = new Point(); 
        p1.SetPoint(10, 20); 
        Point p2 = p1;  // simple assignmen only aliasing
        Point p3 = (Point) p1.clone(); 
        p1.SetPoint(20, 30); 
        System.out.println(p3); 
    }
}
