import java.util.Scanner;
class Employee {
	int empid;
	String name;
	double salary;
	String address;
	employee(int no,String na,double sal,String add){
		this.empid=no;
		this.name=na;
		this.salary=sal;
		this.address=add;
	}
}
class Teacher extends employee{
	String dept;
	String subject;
	Teacher(int no,String na,double sal,String add,String add,String dep,String sub){
		super(no,na,sal,add);
		this.dept=dep;
		this.subject=sub;
		}
	void display(){
		System.out.println("employee id:"+empid);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
		System.out.println("address:"+addres);
		System.out.println("department:"+dept);
		System.out.println("Subject:"+subject);
		}
	public static void main(String[] args){
		System.out.println("\nenter the no. of employees");
		Scanner  