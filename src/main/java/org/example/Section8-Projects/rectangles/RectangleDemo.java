import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class RectangleDemo {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        insertRectanglesFrom("rectangle_data.txt", rectangles);
        insertRectanglesIntoFile("rectangles_output.txt", rectangles);
    }
    
    public static void printRectangleInfos(Rectangle rectangle, PrintWriter pw) {
        pw.println("---------------");
        pw.println("Length: " + rectangle.getLength());
        pw.println("Width: " + rectangle.getWidth());
        pw.println("Area: " + rectangle.area());
        pw.println("Perimeter: " + rectangle.perimeter());
        pw.println();
    }

    public static void insertRectanglesFrom(String fileName, ArrayList<Rectangle> array) {
        int tempLength;
        int tempWidth;
        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNext()) {
                tempLength = file.nextInt();
                tempWidth = file.nextInt();
                array.add(new Rectangle(tempLength, tempWidth));
            }
            file.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found - " + ex.getMessage());
        }
    }

    public static void insertRectanglesIntoFile(String fileName, ArrayList<Rectangle> rectangles) {
        PrintWriter pw;
        try {
            pw = new PrintWriter(fileName);
            for (Rectangle rectangle : rectangles) {
                printRectangleInfos(rectangle, pw);
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found - " + ex.getMessage());
        }
    }
}
