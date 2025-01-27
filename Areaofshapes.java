public class Areaofshapes {
    float pi = (float) 3.14;
    public float Area(float length, float breadth){
        return length * breadth;
    }

    
    public float Area(float side){
        return side * side;
    }

    
    public double Area(double length, double height, boolean isTriangle){
        return  0.5 * length * height;
    }

    
    public double Area(double radius){
        return (pi * radius * radius);
    }

    public static void main(String[] args){
        Areaofshapes area = new Areaofshapes();

        System.out.println("Area of rectangle is: "+area.Area(5, 7));
        System.out.println("Area of square is: "+area.Area(10));
        System.out.println("Area of triangle is: "+area.Area(6, 7, true));
        System.out.println("Area of circle is: "+area.Area(5));
    }
}
