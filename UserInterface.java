import java.util.Scanner;

public class UserInterface {

	private Scanner sc = new Scanner(System.in);

	public int promptforInt1(){

		System.out.println("What is the length of the first side (cm): ");
	
		int userInput = sc.nextInt();
		
		return userInput;
	
	}

	public int promptforInt2(){

		System.out.println("What is the length of the second side (cm): ");
	
		int userInput2 = sc.nextInt();
		
		return userInput2;
	
	}

	public double promptforDouble1(){
		System.out.println("What is the length of the first side (cm): ");
	
		double userInput = sc.nextDouble();
		
		return userInput;

	}

	public double promptforDouble2(){

		System.out.println("What is the length of the second side (cm): ");
	
		double userInput2 = sc.nextDouble();

		
		return userInput2;


	}

	public String promptforString1(){

		System.out.println("What is the length of the first side (cm): ");
	
		String userInput = sc.nextLine();
		
		return userInput;
	
	}

	public String promptforString2(){

		System.out.println("What is the length of the second side (cm): ");
	
		String userInput2 = sc.nextLine();
		
		return userInput2;
	
	}

}
