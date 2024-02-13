// Write a program in java that handles both ‘ArrayIndexOutOfBoundsException’ and ‘ArithmeticException’
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Error
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements : ");
		for(int i =0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index position of the array you want to access : ");
		int index = sc.nextInt();
		System.out.println("Enter the numerator : ");
		int numerator = sc.nextInt();
		System.out.println("Enter the denominator : ");
		int denominator = sc.nextInt();
		try
		{
			int value = arr[index];
			System.out.println("The value of the index position is: " +value);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The index of array is out of bound of the given array!" + "\n" +e);
		}
		finally
		{
			try
			{
				int result = numerator/denominator;
				System.out.println("The value of the division is : " +result);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divison by zero not possible !" + "\n" + e);
			}
			System.out.println("Thank You!");
		}
	}
}
