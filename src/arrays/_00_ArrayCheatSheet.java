package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"apple", "orange", "pear", "banana", "cherry"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "kiwi";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 49;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
				
			} 
		}
		System.out.println(smallest);
		
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i ++) {
			System.out.println(numbers[i]);
		}
		//10. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]> largest) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
		
		
	}
}
