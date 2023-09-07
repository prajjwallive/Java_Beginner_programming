// import java.io.*;
// import java.util.Scanner;

// class FileStreamsTest {
//    public static void main(String[] args) {
//       String fname;
//       Scanner scan = new Scanner(System.in);
//       System.out.println("Please Enter the file name.");
//       fname = scan.nextLine();
//       try {
//          File inputfile = new File(fname);
//          File outFile = new File("outputfile.txt");

//          FileInputStream fis = new FileInputStream(inputfile);
//          FileOutputStream fos = new FileOutputStream(outFile);

//          int c;
//          while ((c = fis.read()) != -1) {
//             System.out.println(c);
//             fos.write(c);
//          }
//          fis.close();
//          fos.close();
//       } catch (FileNotFoundException e) {
//          System.out.println(e.getMessage());
//       } catch (IOException e) {
//          System.out.println(e.getMessage());
//       }
//    }
// }