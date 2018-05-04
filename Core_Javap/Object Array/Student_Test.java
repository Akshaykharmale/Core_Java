package object_array;

import java.util.Scanner;

class Student
{
	private int studId,rollNo;
	private String studName,email;
	private int marks;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int studId, int rollNo, String studName, String email, int marks) {
		super();
		this.studId = studId;
		this.rollNo = rollNo;
		this.studName = studName;
		this.email = email;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", rollNo=" + rollNo + ", studName=" + studName + ", email=" + email
				+ ", marks=" + marks + "]";
	}
	
}


public class Student_Test 
{
	
	public static void main(String[] args) 
	{
		Student s[]=new Student[5];
		int studId,rollNo,marks,choice=0,count=0;
		String studName,email;
		Scanner scn=new Scanner(System.in);
		
		do{
			System.out.println(" 1.Add Data \n 2.Update Data \n 3.Delete Data \n 4.Search Data \n 5.View All \n 6.Exit");
			System.out.println("Enter your choice : ");
			choice=scn.nextInt();
			
			switch (choice) {
			case 1:System.out.println("Enter the student id : ");
					studId=scn.nextInt();
					System.out.println("Enter the student roll No : ");
					rollNo=scn.nextInt();
					System.out.println("Enter the student name : ");
					studName=scn.next();
					System.out.println("Enter the email : ");
					email=scn.next();
					System.out.println("Enter the marks : ");
					marks=scn.nextInt();
					
					s[count]=new Student(studId, rollNo, studName, email, marks);
					count++;
					System.out.println("Student data added successfully\n");
					break;
					
			case 2:System.out.println("Enter student id want to be updated : ");
					studId=scn.nextInt();
					
					for(int i=0;i<count;i++)
					{
						if(s[i]!=null && s[i].getStudId()==studId)
						{
							System.out.println("Enter the student roll No : ");
							rollNo=scn.nextInt();
							s[i].setRollNo(rollNo);
							System.out.println("Enter the student name : ");
							studName=scn.next();
							s[i].setStudName(studName);
							System.out.println("Enter the email : ");
							email=scn.next();
							s[i].setEmail(email);
							System.out.println("Enter the marks : ");
							marks=scn.nextInt();
							s[i].setMarks(marks);
						}
					}
					break;
					
			case 3:System.out.println("Enter student id want to be delete : ");
					studId=scn.nextInt();
			
					for(int i=0;i<count;i++)
					{
						if(s[i]!=null && s[i].getStudId()==studId)
						{
							s[i]=null;
						}
					}
					System.out.println();
					break;
					
			case 4:System.out.println("Enter student id want to be search : ");
					studId=scn.nextInt();
			
					for(int i=0;i<count;i++)
					{
						if(s[i]!=null && s[i].getStudId()==studId)
						{
							System.out.println(s[i]);
						}
					}
					System.out.println();
					break;
					
			case 5:System.out.println("***** All Students Data *****");
			
					for(int i=0;i<count;i++)
					{
						if(s[i]!=null)
						{
							System.out.println(s[i]);
						}
					}
					System.out.println();
					break;
					
			case 6:System.out.println("Exited successfully");
					System.exit(0);
			
			default:System.out.println("Invalid choice");
					break;
			}
		}while(choice != 6);
		scn.close();
	}

}
