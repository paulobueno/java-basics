import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FileInputFun {
    public static void main(String[] args) {
        printFileData("file-doesnt-exist.txt");
        printFileData("input-with-text.txt");
        System.out.println("----------");
        printFileData("input.txt");
        System.out.println("The sum of the file is: " + fileSum("input.txt"));
    }

    public static void printFileData(String fileName) {
        Scanner infile;
        int input;

        try {
            infile = new Scanner(new File(fileName));
            while(infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            }
            infile.close();
        }
        catch(FileNotFoundException ex) {   
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex) {   
            System.out.println("Line is not a number!");
        }
    }

    public static int fileSum(String fileName) {
        Scanner infile;
        int totalSum = 0;
        try {
            infile = new Scanner(new File(fileName));
            while(infile.hasNext()) {
                totalSum += infile.nextInt();
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }
        return totalSum;
    }
}
