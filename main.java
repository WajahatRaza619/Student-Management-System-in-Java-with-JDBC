import java.util.*;

public class main {
	public static void main(String[] args){
       System.out.println("Welcome To Student Management App");
       Scanner sc=new Scanner(System.in);
	   while(true) {
		   System.out.println("Press 1 to add student");
		   System.out.println("Press 2 to delete student");
		   System.out.println("Press 3 to display student");
		   System.out.println("Press 0 to exit");
		   int c=sc.nextInt();
		   if(c==1) {
			   System.out.println("Enter student name");
			   String name=sc.next();
			   
			   System.out.println("Enter students phone number");
			   String phone=sc.next();
			   
			   System.out.println("Enter students city");
			   String city=sc.next();
			   
			   Student st=new Student(name,phone,city);
			   boolean ans=StudentDao.inertStudentToDB(st);
			   if(ans==true) {
				   System.out.println("Succesfully Added");
			   }else {
				   System.out.println("Some Internal Errr Occured");
			   }
		   }else if(c==2) {
			   //delete
			   System.out.println("Enter id to delete");
			   int id=sc.nextInt();
			   boolean f=StudentDao.deleteStudent(id);
			   if(f==true) {
				   System.out.println("Deleted Succesfully");
			   }else {
				   System.out.println("Deletion Failed !");
			   }
			   
		   }else if(c==3) {
			   StudentDao.showAll();
		   }else if(c==0){
			   break;
		   }else {
			   
		   }
	   }
	   System.out.println("Thank You For Using My Application");
	}
}
