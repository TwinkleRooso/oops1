package Graphics;
import java.util.Scanner;
interface arithmatic{
	void addition();
	void subtraction();
	void multiplication();
	void division();
	}
public class Operations implements arithmatic{
	Scanner s=new Scanner(System.in);
	public void addition(){
		System.out.println("enter the num1:");
		int num1=s.nextInt();
		System.out.println("enter the num2:");
		int num2=s.nextInt();
		System.out.println("sum:"+(num1+num2));
	}
	public void subtraction(){
		System.out.println("enter the num1:");
		int num1=s.nextInt();
		System.out.println("enter the num2:");
		int num2=s.nextInt();
		System.out.println("subtraction:"+(num1-num2));
		}
	public void multiplication(){
		System.out.println("enter the num1:");
		int num1=s.nextInt();
		System.out.println("enter the num2:");
		int num2=s.nextInt();
		System.out.println("mul:"+(num1*num2));
		}
	public void division(){
		System.out.println("enter the num1:");
		int num1=s.nextInt();
		System.out.println("enter the num2:");
		int num2=s.nextInt();
		System.out.println("div:"+(num1/num2));
		}
}
		
