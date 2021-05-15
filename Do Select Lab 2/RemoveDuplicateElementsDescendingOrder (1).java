import java.util.Scanner;

public class RemoveDuplicateElementsDescendingOrder {
	public static int[] modifyArray(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int arr2[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr2[j]=arr[i];
				j++;
			}
		}
		arr2[j++]=arr[arr.length-1];
		int temp[]=new int[j];
		for(int i=0;i<j;i++)
		{
			temp[i]=arr2[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of array elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int newArr[]=modifyArray(arr);
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
}