import java.text.DecimalFormat;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        
        showCircleInfos(circle1);
        System.out.println();
        showCircleInfos(circle2);

    }

    public static void showCircleInfos(Circle circle) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Radius: " + df.format(circle.getRadius()));
        System.out.println("Circumference: " + df.format(circle.circumference()));
        System.out.println("Area: " + df.format(circle.area()));
    }

}
