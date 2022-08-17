import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int n1=kb.nextInt();
		System.out.println("Enter a second number: ");
		int n2=kb.nextInt();
		System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Division");
		System.out.println("Enter the number of the transaction you want to do: ");
		int select=kb.nextInt();
		switch(select) {
			case 1:
				System.out.println("Addition:"+(n1+n2));
				break;
			case 2:
				System.out.println("Extraction:"+(n1-n2));
				break;	
			case 3:
				System.out.println("Multiplication:"+(n1*n2));
				break;
			case 4:				
				switch(n2) {
					case 0:
						System.out.println("A number can not be divided by 0");
						break;
					default:
						System.out.println("Division:"+(n1/n2));
						break;						
				}
				break;
			default:
				System.out.println("You choose the wrong number.Try again. ");
			
		}
	}

}
