public class Circle {
    private int pi;
    private int radius;

    public Circle(int pi, int radius) {
        this.pi = pi;
        this.radius = radius;
    }

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void area(){
        area();
    }
    public void circumference (){
        circumference();
    }
    public static void area(Circle circle){
        int area = circle.pi * (circle.radius * circle.radius);
        System.out.println("область = "+area);
    }
    public static void circumference(Circle circle){
        int circumference = circle.pi * 2 * circle.radius;
        System.out.println("площадь окружности = "+circumference);

    }

    @Override
    public String toString() {
        return "Circle " +
                "pi = " + pi +
                ", radius = " + radius + "\n";
    }
}
