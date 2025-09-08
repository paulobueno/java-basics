import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Paulo");
        names.add("Thais");
        names.add("Rafael");
        names.add("Regina");
        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for (String name : names) {
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Couldn't write to the file!");
        }
    }
}
