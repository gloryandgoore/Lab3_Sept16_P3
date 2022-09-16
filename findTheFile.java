import java.util.Scanner;
import java.io.*;

public class findTheFile {

    public static void main(String args[])
    {
    //filename from scanner
    Scanner input = new Scanner(System.in);
    String fileName;
        System.out.println("Enter the name of the file: ");
    fileName = input.nextLine();
    //getting the file
    File targetFile = new File(fileName);
//checking if it exist or not
        if(targetFile.exists())
    {
        //if it exists print
        System.out.println("File exists!");
        System.out.println("File path is: " + targetFile.getAbsolutePath());
    }
        else
            //if it does not exist print
                System.out.println("File does not exist!");
}

}
