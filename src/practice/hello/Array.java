package practice.hello;

public class Array {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 10;
		numbers[2] = 100;
		numbers[3] = 1000;
		numbers[4] = 10000;
		
		for (int num : numbers) {
			System.out.println("Numbers: " + num);
		}
	}
}
