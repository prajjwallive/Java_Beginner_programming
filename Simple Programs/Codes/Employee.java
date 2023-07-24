import java.util.Scanner;
import java.io.*;

public class Employee {
    public static void main(String args[]) {
        String fname;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name\n");
        fname = scan.nextLine();

        String line = null;
        try{
            
            FileReader fileReader = new FileReader(fname);
            BufferedReader Buffer = new BufferedReader(fileReader);
            while((line = Buffer.readLine()) != null){
                System.out.println(line);
            }
            Buffer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
