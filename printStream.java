package printStreamp;
import java.io.*;
public class printStream {
 public void funcationprint(){
   try{ FileOutputStream fos = new FileOutputStream("text.txt");
    PrintStream ps = new PrintStream(fos);
    ps.println("Hello World");
    ps.println("I am sumit");
    ps.println("I am from India");
    ps.close();
    fos.close();
  }catch(Exception e){
    System.out.println(e);
  }}
  
  
}