//Admin class
import java.util.Scanner;
public class Admin extends Thread {
     //attendance update of teachers!
     private String id;
    private String pass;
       int scdl=74,ail=74,ccnl=94;
       Scanner in = new Scanner(System.in);
       float per;
       String name,sem,sec,rollno,idno,tname,tsec,dep,sub;
       private final String[] teachername = {"Sitwat Ashraf","Ruqqaiya Aziz","Fizza Sohail"};
        private final String[] idnum={"SA-101","RA-102","FS-103"};
        String[] subj={"SC&D LAB","AI LAB","CCN LAB"};
        String[] roomno={"AF-06","AF-06","AF-06"};
        //pass
    @Override
    public void run(){
    Scanner idata=new Scanner(System.in);
     System.out.println("```````````````````````````````````````````"
             + "``UNIVERSITY MANAGEMENT SYSTEM BY AMN```````````````````````````\n");
     System.out.println("Username :");
        id= idata.next();
        System.out.println("Password :");
        pass=idata.next();
        Scanner s = new Scanner(System.in); 
          char ch;
        if("mukadus".equals(id)&&"adminamn".equals(pass)){
           
        do{
             System.out.println("""
                                To see student data press a
                                To see Teacher's data press b
                                To add Student's Data press c
                                To add Teacher's Data press d""");
              char c=in.next().charAt(0);
            switch (c) {
                case 'a', 'A' -> shStudentData();
                case 'B', 'b' -> shTeachersData();
                case 'c', 'C' -> AddStudent();
                case 'd', 'D' -> AddTeachers();
                default -> System.out.println("Please Enter Correct Input");
            }
             System.out.println("\nDo You Want To Continue(Y/N)");
              ch=s.next().charAt(0);
       }while(ch=='Y'||ch=='y');
                 }
           else{
            System.out.println("Wrong Credentials");
        } }
 
    
     public void shStudentData(){
     StuData sob=new StuData();
     Teachers tob=new Teachers();
     System.out.println("\nSTUDENT NAME\t  ROLL NUMBER\t CGPA\t SEMESTER    SECTION\tPERCENTAGE\n");
     try{
     float marks=((tob.a1+tob.s1+tob.c1)/300)*100;
     float marks1=((tob.a2+tob.s2+tob.c2)/300)*100;
     float marks2=((tob.a3+tob.s3+tob.c3)/300)*100;
     System.out.println(sob.studentname[0]+"\t   "+sob.rollno[0]+"\t "+sob.cgpa[0]+"\t   "+sob.sem[0]+"\t\t"+sob.sec[0]+"\t  "+marks);
     System.out.println(sob.studentname[1]+"\t   "+sob.rollno[1]+"\t "+sob.cgpa[1]+"\t   "+sob.sem[1]+"\t\t"+sob.sec[1]+"\t  "+marks1);
     System.out.println(sob.studentname[2]+"\t   "+sob.rollno[2]+"\t "+sob.cgpa[2]+"\t   "+sob.sem[2]+"\t\t"+sob.sec[2]+"\t  "+marks2);
    }
     catch(ArithmeticException e){
    System.out.println("THE DIVIS0R CAN'T BE ZERO!");}}
    //method append student data
    public void AddStudent(){
        char choice;
        do {
            try{        
            System.out.println("\nRoll Number: ");
            rollno=in.next();
            System.out.println("\nName: ");
            name=in.next();
            System.out.println("\nSemester: ");
            sem=in.next();
            System.out.println("\nLast GPA or Percentage: ");
            per=in.nextFloat();
            System.out.println("\nSection ");
            sec=in.next();
             System.out.print("\nNEW STUDENT DETAILS:");
             System.out.println("\nROLL NUMBER\t\t NAME\t\t SEMESTER\t PERCENTAGE\t SECTION\n");
             System.out.println(rollno+"\t\t"+name+"\t\t    "+sem+"\t\t"+per+"\t\t"+sec);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("SEEMS LIKE AN ERROR! LET ME FIX IT....");
        }
      System.out.println("\nDo You Want To add more Student data(Y/N)");
      choice = in.next().charAt(0); }
      while (choice == 'Y' || choice == 'y'); 
       
    }
     public void shTeachersData(){
       
        System.out.println("\nTEACHER NAME\t  ID NUMBER\t SUBJECT\n");
        System.out.println(teachername[0]+"\t   "+idnum[0]+"\t "+subj[0]+"\t  "+roomno[0]);
        System.out.println(teachername[1]+"\t   "+idnum[1]+"\t "+subj[1]+"\t\t  "+roomno[1]);
        System.out.println(teachername[2]+"\t   "+idnum[2]+"\t "+subj[2]+"\t  "+roomno[2]);
    } 
    public void AddTeachers(){
     char choice;
        do {
            try{        
            System.out.println("\nID Number: ");
            idno=in.next();
            System.out.println("\nName: ");
            tname=in.next();
            System.out.println("\nDepartment: ");
            dep=in.next();
            System.out.println("\nSubject: ");
            sub=in.next();
            System.out.println("\nSection ");
            tsec=in.next();
             System.out.print("\nNEW STUDENT DETAILS:");
             System.out.println("\nID NUMBER\t\t NAME\t\t DEPARTMENT\t SUBJECT\t SECTION\n");
             System.out.println(idno+"\t\t"+tname+"\t\t    "+dep+"\t\t"+sub+"\t\t"+tsec);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("SEEMS LIKE AN ERROR! LET ME FIX IT....");
        }
      System.out.println("\nDo You Want To add more teacher's data?(Y/N) ");
      choice = in.next().charAt(0); }
      while (choice == 'Y' || choice == 'y'); 
       
    }
}
