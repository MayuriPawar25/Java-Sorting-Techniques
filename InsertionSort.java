import java.util.*;
public class InsertionSort
{
	public static void sorting(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			int current= arr[i];
			int j=i-1; //j will track the sorted part so it will be i-1
			while(j>=0 && j>=current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		sorting(arr);
		System.out.println("Sorted Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Sorting(arr[i]);
	}
}