// Write a program in java that sorts half of element in ascending and rest half of the elements in descending order. 
import java.util.Scanner;
import java.lang.*;
class Sort
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the array elements : ");
	for(int i =0; i<size; i++)
	{
		arr[i] = sc.nextInt();
	}
	int half = size / 2;
	//Ascending order
	for(int i =0;  i<half; i++)
	{
		for(int j =i+1; j<half; j++)
		{
			if(arr[i] > arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("After sorting half of elements in ascending order the array will be : ");
	for(int i =0; i<half; i++)
	{
		System.out.print(arr[i] + " ");
	}
	System.out.println("\n");
	//Descending order
	for(int i=half ; i<size-1; i++)
	{
		for(int j =i+1; j<size; j++)
		{
			if(arr[i] < arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("After sorting half of elements in descending order the array will be : ");
	for(int i =half; i<size; i++)
	{
		System.out.print(arr[i] + " ");
	}
	}
}
	
