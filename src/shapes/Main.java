package shapes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userChoice;
		//choose create, be given a shape, quit
		do {
			System.out.println("what doing");
			System.out.println("1: I want to create a shape");
			System.out.println("2: I want to view a shape");
			System.out.println("3: I want to change a shape");
			System.out.println("4: I want to end the program");
			userChoice=in.nextInt();
			
			if (userChoice == 1) {
				//Create a Shape
				System.out.println("Choose a shape to create:");
				System.out.println("1: circle");
				System.out.println("2: Rectangle");
				System.out.println("3: Triangle");
				int secondChoice=in.nextInt();
				if (secondChoice == 1) {
					
				}
				
				System.exit(0);
			}
			if (userChoice ==2) {
				//View a shape
				System.out.println("Choose a shape to view:");
				System.out.println("1: circle");
				System.out.println("2: Rectangle");
				System.out.println("3: Triangle");
				int secondChoice=in.nextInt();
				if (secondChoice == 1) {
					
				}
				System.exit(0);
			}
			if (userChoice ==3) {
				//change a shape
				System.out.println("Choose a shape to change:");
				System.out.println("1: circle");
				System.out.println("2: Rectangle");
				System.out.println("3: Triangle");
				int secondChoice=in.nextInt();
				if (secondChoice == 1) {
					
				}
				
				System.exit(0);
			}
			if (userChoice ==4) {
				//end program
				System.exit(0);
			}
		}while (userChoice!=4);
		
		
		
		
	}

}
