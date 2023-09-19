import java.io.*;
public class fileio {

    public static void main(String[] args) {
      int i;
     try {
      File f=new File("f2.txt");
      // boolean r=f.createNewFile();
      boolean r=true;
      if(r){
         System.out.println("hwlo");
         FileReader fileReader = new FileReader("f1.txt");
         FileWriter f1 = new FileWriter("f2.txt");
         while ((i = fileReader.read()) != -1) {   //reading
            System.out.println((char)i);
               //  f1.write((char)i);
            }
            f1.close();
            fileReader.close();

      }
       
 
     } catch (Exception e) {
        // TODO: handle exception
     }
        
    }
}
