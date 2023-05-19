package practice.hello;

import java.util.Scanner;

public class HelloWolrd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your project name: ");
		String projectName = scanner.nextLine();
		System.out.println("Your project name is: " + projectName);
		
		scanner.close();
	}
}
