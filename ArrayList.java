package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static boolean isOver = false;

	public static void main(String[] args) {

		ArrayList<Integer> theList = new ArrayList<>();

		Scanner in = new Scanner(System.in);


		while(!isOver){
			System.out.println("Enter 1 to add an intger\nEnter 2 to remove integer \nEnter -1 if you are done");
			int x = in.nextInt();


			//Will break the while loop to finish the algorithm
			if (x == -1) {
				break;
			}


			//Prints all the integers in the arrayList
			if (x == 3) {
				for (int i = 0; i < theList.size(); i++) {
					System.out.println();
					System.out.print(theList.get(i));

				}

				System.out.println();
			}


			//Since 3 was not typed, the it will add or remove the integers			
			if (x!=3) {
				System.out.println("Enter integer");
				int y = in.nextInt();


				if (x == 1) {
					theList.add(y);
				}

				if (x == 2) {

					if (theList.get(0) == y) {
						theList.remove(0);
					}

					for (int i = 0; i < theList.size(); i++) {
						if (theList.get(i) == y) {
							theList.remove(i);

						}


					}
				}


			}

		}

	}

}

