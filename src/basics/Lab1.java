package basics;

public class Lab1 {

	public static void main(String[] args) {
		
		int n = 5;
		int[] array = new int[]{15,12,77,3,13,25,130,28,99,52};
		
		//Calling the functions we created
		System.out.println("The sum of numbers 1 to " + n + " is " + sum(5));
		System.out.println("The factorial of " + n + " is " + factorial(5));
		System.out.println("The minimun value of the array is " + minimum(array));
		System.out.println("The maximum value of the array is " + maximum(array));
		System.out.println("The average value of the array is " + average(array));
	}
	
	public static int sum(int n) {
		int i;
		int sum = 0;
		for (i=1;i<=n;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	public static int minimum(int[] array) {
		int min = array[0];
		for(int i=1;i < array.length;i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	public static int maximum(int[] array) {
		int max = array[0];
		for(int i=1;i < array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static int average(int[] array) {
		int sum = 0;
		for(int i=0;i < array.length;i++) {
			sum = sum + array[i];
		}
		
		int avg = sum / array.length;
		return avg;
	}

}
