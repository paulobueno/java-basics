import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CircleDemo {

    public static void main(String[] args) {
        ArrayList<Circle> circles;
        circles = getCirclesFromFile("circle_data.txt");
        writeCirclesIntoFile(circles, "circles_info.txt");
    }

    public static void writeCirclesIntoFile(ArrayList<Circle> circles, String fileName) {
        try {
            PrintWriter pw = new PrintWriter(fileName);
            for (Circle circle : circles) {
                pw.println("--------------");
                pw.println("Radius: " + circle.getRadius());
                pw.println("Circumference: " + circle.circumference());
                pw.println("Area: " + circle.area());
                pw.println();
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found - " + ex.getMessage());
        }
    }

    public static ArrayList<Circle> getCirclesFromFile(String fileName) {
        ArrayList<Circle> circles = new ArrayList<>();
        Circle tempCircle;
        try {
            Scanner circlesData = new Scanner(new File(fileName));
            while (circlesData.hasNext()) {
                tempCircle = new Circle(circlesData.nextDouble());
                circles.add(tempCircle);
            }
            circlesData.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found - " + ex.getMessage());
        }
        return circles;
    }

}
