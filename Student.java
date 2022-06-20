//student class
import java.util.Scanner;
interface Studnets{
     public void idPass();
}
class StuData implements Studnets{ 
     Scanner in= new Scanner(System.in);
     String sid;
     float marks,marks1,marks2;
     private String pass;
         //student data stored 
       final String[] studentname= {"Mukadus Jawaid","Abdullah Khan","Muhammad Nofil"};
       final String[] rollno={"SE20-104","SE20-135","SE20-140"};
       final double[] cgpa= {3.78, 3.87,3.85};
       final String[] sem={"5th","5th","5th"};
       final String[] sec={"C","D","D"};
       final String passexam="is elgible to give exam";
       final String fail="is not elgible to give exam";
    @Override
    public void idPass() {
         //teacher class object
        Teachers obj= new Teachers();
        System.out.println("`````````````````````````````````````````````UNIVERSITY MANAGEMENT SYSTEM BY AMN```````````````````````````\n");
       //get username and password
        System.out.println("Username :");
        sid=in.next();
        System.out.println("Password :");
        pass= in.next();
        
    try{
        //validations
        if (sid.equals(rollno[0])&&"45@E56".equals(pass)){
            System.out.println("\nSTUDENT NAME\t\t  ROLL NUMBER\t\t CGPA\t\t SEMESTER\t\t SECTION\n");
            System.out.println(studentname[0]+"\t\t   "+rollno[0]+"\t\t "+cgpa[0]+"\t\t    "+sem[0]+"\t\t\t   "+sec[0]);
            System.out.println("\nAssessment Result: \n");
            //getting marks
            try{   
                marks=((obj.a1+obj.s1+obj.c1)/300)*100;
                if(marks>=90&&marks<=100){
               System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
               System.out.println("\nGrade: A+");
           }
           else if(marks>=80&&marks<=89){
                System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
                System.out.println("\nGrade: A");
           }
           else if(marks>=70&&marks<=79){
                System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
                System.out.println("\nGrade: B");
           }
           else if(marks>=60&&marks<=69){
                System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
                System.out.println("\nGrade: B");
           }
           else if(marks>=50&&marks<59){
                System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
                System.out.println("\nGrade: C");
           }
            else if(marks>=40&&marks<49){
                System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
                System.out.println("\nGrade: D");
           }
            else if(marks<39){
                System.out.println("Marks of SC&D : "+obj.s1+"\nMarks of AI :"+obj.a1+"\nMarks of CCN: "+obj.c1+"\n Percentage: "+marks);
                System.out.println("\nGrade: F");
           }
            else{
             System.out.println("SUCH GRADE DOESN'T EXIST");
            }
            System.out.println("\nAttendance: \n");
            if(obj.scd>=75){
               System.out.println("The Student "+studentname[0]+" Roll number: "+rollno[0]+" "+passexam+" OF SCD, Attendance: "+obj.scd);   
            }
            if(obj.ai>=75){
                System.out.println("The Student "+studentname[0]+" Roll number: "+rollno[0]+" "+passexam+" OF AI, Attendance: "+obj.ai);   
            }
            if(obj.ccn>=75){
            System.out.println("The Student "+studentname[0]+" Roll number: "+rollno[0]+" "+passexam+" OF CCN, Attendance: "+obj.ccn);   
            }
            else if(obj.ai<75){System.out.println("The Student "+studentname[0]+" Roll number: "+rollno[0]+" "+fail+" OF CCN, Attendance: "+obj.ai);}
            else if(obj.scd<75){System.out.println("The Student "+studentname[0]+" Roll number: "+rollno[0]+" "+fail+" OF CCN, Attendance: "+obj.scd);}
            else if(obj.ccn<75){System.out.println("The Student "+studentname[0]+" Roll number: "+rollno[0]+" "+fail+" OF CCN, Attendance: "+obj.ccn);}
            else{System.out.println("SEEMS LIKE YOUR ATTENDANCE HAVEN'T BEEN UPDATED"); } }
            catch(ArithmeticException e){
                System.out.println("THE DIVIS0R CAN'T BE ZERO!");
            }
      }     //student data rollno 135
        
        else if(sid.equals(rollno[1])&&"45@E56".equals(pass)){
            System.out.println("\nSTUDENT NAME\t\t  ROLL NUMBER\t\t CGPA\t\t SEMESTER\t\t SECTION\n");
            System.out.println(studentname[1]+"\t\t   "+rollno[1]+"\t\t "+cgpa[1]+"\t\t    "+sem[1]+"\t\t\t   "+sec[1]);
            System.out.println("\nAssessment Result: \n");
            //getting marks
            try{
                marks1=((obj.a2+obj.s2+obj.c2)/300)*100;
           if(marks1>=90&&marks1<=100){
               System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\nPercentage: "+marks);
               System.out.println("\nGrade: A+");
           }
           else if(marks1>=80&&marks1<=89){
                System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\n Percentage: "+marks1);
                System.out.println("\nGrade: A");
           }
           else if(marks1>=70&&marks1<=79){
                System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\n Percentage: "+marks1);
                System.out.println("\nGrade: B");
           }
           else if(marks1>=60&&marks1<=69){
                System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\n Percentage: "+marks1);
                System.out.println("\nGrade: B");
           }
           else if(marks1>=50&&marks1<59){
                System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\n Percentage: "+marks1);
                System.out.println("\nGrade: C");
           }
            else if(marks1>=40&&marks1<49){
                System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\n Percentage: "+marks1);
                System.out.println("\nGrade: D");
           }
            else if(marks1<39){
                System.out.println("Marks of SC&D : "+obj.s2+"\nMarks of AI :"+obj.a2+"\nMarks of CCN: "+obj.c2+"\n Percentage: "+marks1);
                System.out.println("\nGrade: F");
           }
            else{
             System.out.println("SUCH GRADE DOESN'T EXIST");
            }
            System.out.println("\nAttendance: \n");
           if(obj.scd>=75){
               System.out.println("The Student "+studentname[1]+" Roll number: "+rollno[1]+" "+passexam+" OF SCD, Attendance: "+obj.scd);   
            }
            if(obj.ai>=75){
                System.out.println("The Student "+studentname[1]+" Roll number: "+rollno[1]+" "+passexam+" OF AI, Attendance: "+obj.ai);   
            }
            if(obj.ccn>=75){
            System.out.println("The Student "+studentname[1]+" Roll number: "+rollno[1]+" "+passexam+" OF CCN, Attendance: "+obj.ccn);   
            }
            else if(obj.ai<75){System.out.println("The Student "+studentname[1]+" Roll number: "+rollno[1]+" "+fail+" OF CCN, Attendance: "+obj.ai);}
            else if(obj.scd<75){System.out.println("The Student "+studentname[1]+" Roll number: "+rollno[1]+" "+fail+" OF CCN, Attendance: "+obj.scd);}
            else if(obj.ccn<75){System.out.println("The Student "+studentname[1]+" Roll number: "+rollno[1]+" "+fail+" OF CCN, Attendance: "+obj.ccn);}
            else{System.out.println("SEEMS LIKE YOUR ATTENDANCE HAVEN'T BEEN UPDATED"); } }
            catch(ArithmeticException e){
                System.out.println("THE DIVIS0R CAN'T BE ZERO!");
            }
        }
        //student data rollno 140
        else if (sid.equals(rollno[2])&&"45@E56".equals(pass)){
            System.out.println("\nSTUDENT NAME\t\t  ROLL NUMBER\t\t CGPA\t\t SEMESTER\t\t SECTION\n");
            System.out.println(studentname[2]+"\t\t   "+rollno[2]+"\t\t "+cgpa[2]+"\t\t    "+sem[2]+"\t\t\t   "+sec[2]);
            System.out.println("\nAssessment Result: \n");
            try{
             marks2=((obj.a3+obj.s3+obj.c3)/300)*100;
           if(marks2>=90&&marks2<=100){
               System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
               System.out.println("\nGrade: A+");
           }
           else if(marks2>=80&&marks2<=89){
                System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
                System.out.println("\nGrade: A");
           }
           else if(marks2>=70&&marks2<=79){
                 System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
                System.out.println("\nGrade: B");
           }
           else if(marks2>=60&&marks2<=69){
                 System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
                System.out.println("\nGrade: B");
           }
           else if(marks2>=50&&marks2<59){
                 System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
                System.out.println("\nGrade: C");
           }
            else if(marks2>=40&&marks2<49){
                 System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
                System.out.println("\nGrade: D");
           }
            else if(marks2<39){
                 System.out.println("Marks of SC&D : "+obj.s3+"\nMarks of AI :"+obj.a3+"\nMarks of CCN: "+obj.c3+"\n Percentage: "+marks2);
                System.out.println("\nGrade: F");
           }
            else{
             System.out.println("SUCH GRADE DOESN'T EXIST");
            }
            System.out.println("\nAttendance: \n");
            if(obj.scd>=75){
               System.out.println("The Student "+studentname[2]+" Roll number: "+rollno[2]+" "+passexam+" OF SCD, Attendance: "+obj.scd);   
            }
            if(obj.ai>=75){
                System.out.println("The Student "+studentname[2]+" Roll number: "+rollno[2]+" "+passexam+" OF AI, Attendance: "+obj.ai);   
            }
            if(obj.ccn>=75){
            System.out.println("The Student "+studentname[2]+" Roll number: "+rollno[2]+" "+passexam+" OF CCN, Attendance: "+obj.ccn);   
            }
            else if(obj.ai<75){System.out.println("The Student "+studentname[2]+" Roll number: "+rollno[2]+" "+fail+" OF CCN, Attendance: "+obj.ai);}
            else if(obj.scd<75){System.out.println("The Student "+studentname[2]+" Roll number: "+rollno[2]+" "+fail+" OF CCN, Attendance: "+obj.scd);}
            else if(obj.ccn<75){System.out.println("The Student "+studentname[2]+" Roll number: "+rollno[2]+" "+fail+" OF CCN, Attendance: "+obj.ccn);}
            else{System.out.println("SEEMS LIKE YOUR ATTENDANCE HAVEN'T BEEN UPDATED"); } }
            catch(ArithmeticException e){
                System.out.println("THE DIVIS0R CAN'T BE ZERO!");}}
        else{
            System.out.println("Sorry Wrong Credentials!");}}
    catch(Exception e){
        System.out.println("SEEMS LIKE ERROR HAS OCCURED! PLEASE WAIT WHILE WE FIX IT!");
    }   }
}

    
