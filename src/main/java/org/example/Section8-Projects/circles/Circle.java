public class Circle {
    private static double PI = Math.PI;
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

}
