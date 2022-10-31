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
				//circle
				//read in input for radius
				if (secondChoice == 1) {
					System.out.println("Input the radius of the circle: ");
					Circle C = new Circle();
					C.setRadius(in.nextInt());
					C.printStats();
					
					//end secondChoice=1 once printStats has been printed
					System.exit(0);
				}
				//rectangle
				if (secondChoice == 2) {
					//read in length
					System.out.println("Input desired length");
					Rectangle R = new Rectangle();
					R.setLength(in.nextInt());
					//read in width
					System.out.println("input desired width");
					R.setWidth(in.nextInt());
					//printStats
					R.printStats();
					
					//end secondChoice=2 once printStats has been printed
					System.exit(0);
				}
				//triangle
				if (secondChoice == 3) {
					//read in side A
					System.out.println("Input desired height");
					Triangle T = new Triangle();
					T.setSideA(in.nextInt());
					//read in side B
					System.out.println("Input desired base");
					T.setSideB(in.nextInt());
					//read in side C
					System.out.println("Input desired hypotenuse");
					T.setSideC(in.nextInt());
					//printStats
					T.printStats();
					
					//end secondChoice=3 once printStats has been printed
					System.exit(0);
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
				//circle
				if (secondChoice == 1) {
					Circle C = new Circle();
					C.printStats();
				}
				//rectangle
				if (secondChoice == 2) {
					Rectangle R = new Rectangle();
					R.printStats();
				}
				//triangle
				if (secondChoice == 3) {
					Triangle T = new Triangle();
					T.printStats();
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
				//circle
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
