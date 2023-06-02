//Bubble Sort ... time complexity O(n^2)
import java.util.*;
class BubbleSort
{
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		return;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of elements: ");
		int n=sc.nextInt();

		int arr[]= new int[n];

		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length-1; i++)   //n-1 times outer loop 
		{
			for(int j=0; j<arr.length-i-1; j++)   //inner loop will run n, n-1, n-2, n-3 ... times 
			{
				if(arr[j]>arr[j+1])
				{
					//swap
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted elements by Bubble Sort: ");
	     printArray(arr);

	}
}
/*for inner loop, it will run n, n-1, n-2, n-3...times and in Asymtotic notations means big O we ignore constants
and both inner loop and outer loop together runs n^2 times, means if we take the sum of both the loop then the 
complexity will be n^2 times. So the time complexity of bubble sort is O(n^2).
But O(n^2) time complexity is not considered as good  */