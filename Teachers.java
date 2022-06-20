
//studentsclass
import java.util.Scanner;
class Teachers extends Thread{
    StuData ob=new StuData();
    String rn,i;
    int scd=75,scda=77,scdaa=90,ai=88,aia=88,aiaa=88,ccn=55,ccna=99,ccnaa=45;
    float s1=67,s2=89,s3=78,a1=77,a2=89,a3=99, c1=99,c2=77,c3=77;
    private String tid;
    private String password;
//teachers data stored
        private final String[] teachername = {"Sitwat Ashraf","Ruqqaiya Aziz","Fizza Sohail"};
        private final String[] idno={"SA-101","RA-102","FS-103"};
//username and pass
    @Override
 public void run(){ System.out.println("`````````````````````````````````````````````UNIVERSITY MANAGEMENT SYSTEM BY AMN```````````````````````````\n");
       //get username and password
        Scanner n= new Scanner(System.in);
        System.out.println("Username :");
        tid= n.next();
        System.out.println("Password :");
        password=n.next();
        //validation
        if(tid.equals(idno[0])&&"879@E".equals(password)){
            System.out.println("\n````````````````````````````Welcome "+teachername[0]
                    +" To Your DashBoard!````````````````````\n");
            //attendance percent
             System.out.println("\t\t\t\t\t\t~ STUDENT ATTENDANCE ~");
            System.out.print("`````````````````````````````````Software Construction Development Lab Attendance: ``````````````````````````````\n");
            System.out.println(ob.rollno[0]+" "+scd+"\n"+ob.rollno[1]+" "+scda+"\n"+ob.rollno[2]+" "+scdaa);
            //subject marks
            System.out.println("\t\t\t\t\t\t\t~ STUDENT MARKS ~");
            System.out.print("\n```````````````````````````````````Software Construction Development Marks out of 100:```````````````````````` \n");
            System.out.println(ob.rollno[0]+" "+scd+"\n"+ob.rollno[1]+" "+scda+"\n"+ob.rollno[2]+" "+scdaa);
            System.out.println("\nClick i to see your profile");
            i=n.next();
            Admin aob= new Admin();
            if("i".equals(i)){
            System.out.println("\nNAME: "+teachername[0]+"\nID NO: "+idno[0]+"\nSUBJECT: "+aob.subj[0]+"\nROOM NUMBER: "+aob.roomno[0]);
            if(aob.scdl<75){
            System.out.println("\nIMPORTANT NOTE!");
            System.out.println("\nYOU'VE BEEN CHARGED FOR 500 RS BECAUSE OF SOA\nATTENDANCE "+aob.scdl+"%");
            }
            else{
                System.out.println("You're Attendance is: "+aob.scdl);
            }}
            }
        else if(tid.equals(idno[1])&&"879@E".equals(password)){
            System.out.println("\n````````````````````````````Welcome "+teachername[1]+" To Your DashBoard!````````````````````\n");
            System.out.println("\t\t\t\t\t~ STUDENT ATTENDANCE \n~");
            System.out.print("\n`````````````````````````````````````````````` Artifical Intelligence Lab Attendance: ```````````````````````````\n");
            System.out.println(ob.rollno[0]+" "+ai+"\n"+ob.rollno[1]+" "+aia+"\n"+ob.rollno[2]+" "+aiaa);
            //studentmarks
            System.out.println("\t\t\t\t\t~ STUDENT MARKS \n~");
            System.out.print("\n`````````````````````````````````````Artifical Intelligence Marks out of 100: `````````````````````````` \n");
            System.out.println(ob.rollno[0]+" "+ai+"\n"+ob.rollno[1]+" "+aia+"\n"+ob.rollno[2]+" "+aiaa);
            System.out.println("\nClick i to see your profile");
            i=n.next();
            Admin aob= new Admin();
            if("i".equals(i)){
            System.out.println("\nNAME: "+teachername[1]+"\nID NO: "+idno[1]+"\nSUBJECT: "+aob.subj[1]+"\nROOM NUMBER: "+aob.roomno[1]);
            if(aob.ail<75){
            System.out.println("\nIMPORTANT NOTE!");
            System.out.println("\nYOU'VE BEEN CHARGED FOR 500 RS BECAUSE OF SOA\nATTENDANCE"+aob.ail+"%"); }
            else{
                System.out.println("You're Attendance is: "+aob.ail+"%");
            }
            }
        }
        else if(tid.equals(idno[2])&&"879@E".equals(password)){
            System.out.println("\n````````````````````````````Welcome "+teachername[2]+" To Your DashBoard!````````````````````\n");
            
            System.out.println("\t\t\t\t\t~ STUDENT ATTENDANCE \n~");
            System.out.print("\n``````````````````````````````````` Computer Communication & Networking Lab Attendance: ``````````````````````````\n");
            System.out.println(ob.rollno[0]+" "+ccn+"\n"+ob.rollno[1]+" "+ccna+"\n"+ob.rollno[2]+" "+ccnaa);
            //student marks
            
            System.out.println("\t\t\t\t\t~ STUDENT MARKS \n~");
            System.out.print("\n``````````````````````````````````````` Computer Communication & Networking Marks out of 100: ```````````````````` \n");
            System.out.println(ob.rollno[0]+" "+ccn+"\n"+ob.rollno[1]+" "+ccna+"\n"+ob.rollno[2]+" "+ccnaa);
        //profile
        i=n.next();
            Admin aob= new Admin();
            if("i".equals(i)){
            System.out.println("\nNAME: "+teachername[2]+"\nID NO: "+idno[2]+"\nSUBJECT: "+aob.subj[2]+"\nROOM NUMBER: "+aob.roomno[2]);
            if(aob.ail<75){
            System.out.println("\nIMPORTANT NOTE!");
            System.out.println("\nYOU'VE BEEN CHARGED FOR 500 RS BECAUSE OF SOA\nATTENDANCE"+aob.ccnl+"%"); }
            else{
                System.out.println("You're Attendance is: "+aob.ccnl+"%");
            }
            }
        } 
        else{
            System.out.println("Sorry Wrong Credentials!");
        } 
 }   
 
 }
