import java.util.*;
public class QuickSortJava
{
	public static int partition(int arr[], int low, int high)
	{
		int pivot= arr[high];
		int i=low-1;
		for(int j=low; j<high; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				//swap
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		pivot=temp;
		return i;
	}
	public static void quickSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int pivotindex =partition(arr,low,high);
			quickSort(arr, low, pivotindex-1);
			quickSort(arr, pivotindex+1, high);
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the Elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		quickSort(arr,0,n-1);

		System.out.println("Sorted Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}