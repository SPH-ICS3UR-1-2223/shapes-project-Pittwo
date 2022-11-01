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
					//change radius
					System.out.println("What will the new radius be: ");
					Circle C = new Circle();
					C.setRadius(in.nextInt());
					C.printStats();
				}
				//rectangle
				if (secondChoice == 2) {
					//change what
					System.out.println("what will be changed:");
					System.out.println("1: length");
					System.out.println("2: width");
					int changeSide=in.nextInt();
					//if change length
					if (changeSide == 1) {
						System.out.println("What is the new length: ");
						Rectangle R = new Rectangle();
						R.setLength(in.nextInt());
						R.printStats();
					}
					//if change width
					if (changeSide == 2) {
						System.out.println("What is the new width: ");
						Rectangle R = new Rectangle();
						R.setWidth(in.nextInt());
						R.printStats();
					}
					
				}
				//triangle
				if (secondChoice == 3) {
					//change side
					System.out.println("what will be changed:");
					System.out.println("1: hight");
					System.out.println("2: base");
					System.out.println("3: hypotenuse");
					int changeSide=in.nextInt();
					//change side A
					if (changeSide == 1) {
						System.out.println("What is the new hight: ");
						Triangle T = new Triangle();
						T.setSideA(in.nextInt());
						T.printStats();
					}
					//change side B
					if (changeSide == 2) {
						System.out.println("What is the new base: ");
						Triangle T = new Triangle();
						T.setSideB(in.nextInt());
						T.printStats();
					}
					//change side C
					if (changeSide == 3) {
						System.out.println("What is the new hypotenuse: ");
						Triangle T = new Triangle();
						T.setSideC(in.nextInt());
						T.printStats();
					}
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
