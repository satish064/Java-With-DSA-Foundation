package oops;
class Triangle{
    int a,b,c;
    public double getArea(){
        double  s = (a+b+c)/2;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getPerimeter()
    {
        return (a+b+c)/2.0;
    }
}
public class areaAndperimeter {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
    }
}
