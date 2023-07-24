import java.io.*;

class FileStreamsTest {
    public static void main(String[] args) {
     try{
        File inputfile = new File("text.txt");
        File outputFile = new File("output.txt");

        FileInputStream  fis = new FileInputStream(inputfile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        int collector;

        while((collector = fis.read()) != -1){
            fos.write(collector);
        }
        fis.close();
        fos.close();
     }
     catch(FileNotFoundException e){
        System.out.println(e.getMessage());
     }
     catch(IOException e){
        System.out.print(e.getMessage());
     }
    }
}