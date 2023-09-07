import java.util.Scanner;
import java.io.*;

public class filehandling {

    public static void main(String args[]){
        String fname;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file name to read!");
        fname = scan.nextLine();

        String line = null;

        try{
            FileReader filereader = new FileReader(fname);
            BufferedReader buffer = new BufferedReader(filereader);
            while((line = buffer.readLine()) != null){
                System.out.println(line);
            }
            buffer.close();
            scan.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}