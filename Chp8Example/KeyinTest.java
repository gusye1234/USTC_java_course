import java.io.*;
public class KeyinTest {
  public static void main(String[] args)  {
      try(
          InputStreamReader isr=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(isr)) {
              String line=null;
              while((line=br.readLine())!=null){
                  if(line.equals("exit")){
                      System.exit(1);
                  }
                  System.out.println("input:"+line);
              }
          }catch(IOException ie){
              ie.printStackTrace();              
      }
  }
}
