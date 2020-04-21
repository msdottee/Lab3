package lab3;

import java.util.Scanner;

public class Decisions {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num;
		String name;
		boolean decision = true;
		
		while (decision) {
			System.out.println("New number. who dis?");
			name = scnr.nextLine();
			
			System.out.println("Since I lost my number can I have yours, " + name + "? (1 - 100)");
			num = scnr.nextInt();
			
			if (num < 1 || num > 100) {
				System.out.println("Come on " + name + ". Can I get your number?!?!?");
			} else if((num % 2) != 0 && num > 60) {
				System.out.println(num + " Odd and over 60");
			} else if ((num % 2) != 0) {
				System.out.println(num + " Odd");
			} else if ((num % 2) == 0 && num >= 2 && num <= 25) {
				System.out.println("Even and less than 25");
			} else if ((num % 2) == 0 && num >= 26 && num <= 60) {
				System.out.println("Even");
			} else if ((num % 2) == 0 && num > 60) {
				System.out.println(num + " Even");
			}
		
			System.out.println("Continue? (y/n):");
			
			String answer = scnr.next();
		
			if (answer.equals("n")) {
				decision = false;
				System.out.println("Bye " + name + "! Thanks for your number! ;)");
				}
			}
		scnr.close();
	}
}