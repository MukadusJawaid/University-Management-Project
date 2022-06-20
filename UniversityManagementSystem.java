
import java.util.Scanner;
//Main class
public class UniversityManagementSystem {
    public static void main(String[]args){
       Scanner in = new Scanner(System.in);
      
           System.out.println("""
                               For Admin Dashboard press A
                               For Teacher Dashboard press T
                               For Student Dashboard press S: 
                                """);
       char ch = in.next().charAt(0);
        switch(ch){
               case 'a', 'A' -> {    
                   Admin a=new Admin();
                   a.start();
               }
               case 'T', 't' -> {
                   Teachers t=new Teachers();
                   t.start();
               }
               case'S', 's' -> {
                   StuData s=new StuData();
                   s.idPass();
               }
               default -> System.out.println("Please Enter Correct Input");
}
    }}
        
      


      



 
  

