import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner ages;
        Scanner names;
        PrintWriter pw;
        int age;
        String name;

        try {
            ages = new Scanner(new File("student_ages.txt"));
            names = new Scanner(new File("student_names.txt"));
            pw = new PrintWriter("age_name.txt");

            while (ages.hasNextLine() && names.hasNextLine()) {
                age = ages.nextInt();
                name = names.nextLine();
                System.out.println(age + " " + name);
                pw.println(age + " " + name);
            }

            pw.close();
            ages.close();
            names.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }
}
