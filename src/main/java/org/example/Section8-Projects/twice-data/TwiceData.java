import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class TwiceData {
    public static void main(String[] args) {
        Scanner inFile;
        PrintWriter pw;
        try {
            inFile = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");
            while (inFile.hasNext()) {
                pw.println(inFile.nextInt() * 2);
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found! " + ex.getMessage());
        }
    }
}
