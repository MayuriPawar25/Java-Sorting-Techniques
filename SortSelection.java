import java.util.*;
class SortSelection
{
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length-1; i++)
		{
			int smallest=i;
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			//swapping
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}

		System.out.println("Sorted array: ");

		printArray(arr);
		
	}
}