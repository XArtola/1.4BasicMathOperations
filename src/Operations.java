
import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);


		int Number1;
		int Number2;
		
		
		int Result1;
		int Result2;
		int Result3;
		int Result4;
		
		
		
		System.out.println("Enter two numbers");
		
		Number1 = scan.nextInt();
		Number2 = scan.nextInt();
		
		Result1 = Number1 + Number2;
		Result2 = Number1 - Number2;
		Result3 = Number1 * Number2;
		Result4 = Number1 / Number2;
		
		
		System.out.println(Number1+" + "+Number2+" = "+Result1);
		System.out.println(Number1+" - "+Number2+" = "+Result2);
		System.out.println(Number1+" x "+Number2+" = "+Result3);
		System.out.println(Number1+" / "+Number2+" = "+Result4);
		
	
	}

}
