import java.util.regex.*;

 // Compiler version JDK 11.0.2

 public class Regexdemo
 {
   public static void main(String args[])
   {     
   String hello = "world";
   String strexp = "\\w";
   if(hello.matches(strexp)) {
     System.out.println("Yes!!!");
   }
   }
 }