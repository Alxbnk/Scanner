import java.io.*;
import java.util.*;

public class TestRun{

   public static void main(String[] args) throws FileNotFoundException{
   
      // create File object
      //File f = new File("data.txt");
      // create Scanner object
      //Scanner s = new Scanner(f);
      Scanner s = new Scanner(System.in);
      
      System.out.println("Movie: ");
      String filename = s.next();
      
      PrintStream output = new PrintStream(filename);
      
      //Scanner k = new Scanner(System.in);
      
      System.out.println("Actors: ");
      
      String actors = s.next();
      
      output.println("Actors: " + actors);
      
      System.out.println("Production Year: ");
      
      int py = s.nextInt();
      
      output.println("Production Year: " + py);
      
     
      
      
      
   }

}