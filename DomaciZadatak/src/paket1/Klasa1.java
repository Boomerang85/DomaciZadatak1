package paket1;
import java.util.Scanner;
public class Klasa1 
{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char operation=sc.next().charAt(0);
		int a=24;
		int b=12;
		int c;
		if(operation=='+') {
			c=a+b;
			System.out.println("Rešenje je " + c);
		} else if(operation=='-'){
			c=b-a;
			System.out.println("Rešenje je " + c);
		} else if(operation=='*') {
			c=a*b;
			System.out.println("Rešenje je " + c);
		} else if(operation=='/') {
			c=a/b;
			System.out.println("Rešenje je " + c);
		} else {
			System.out.println("Loš unos");
		}

	}

}