package shapes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userChoice;
		//choose create, be given a shape, quit
		do {
			System.out.println("Choose an option");
			System.out.println("1: Create shape");
			System.out.println("2: View shape");
			System.out.println("3: Change shape");
			System.out.println("4: End program");
			userChoice=in.nextInt();
			
			if (userChoice == 1) {
				//Create a Shape
				System.out.println("Choose a shape to create:");
				System.out.println("1: circle");
				System.out.println("2: Rectangle");
				System.out.println("3: Triangle");
				int secondChoice=in.nextInt();
				//read in input for radius
				if (secondChoice == 1) {
					System.out.println("Input the radius of the circle: ");
					Circle C = new Circle();
					C.setRadius(in.nextInt());
					C.printStats();
					
					//end secondChoice=1 once printStats has been printed
					System.exit(0);
				}
				if (secondChoice == 2){
					
				}
				
				//exit userChoice=1
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
