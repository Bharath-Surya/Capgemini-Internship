import java.util.*;
public class ReverseSorted {
	public static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
		
	}
	public static int[] getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=reverse(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int newArr[]=getSorted(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
}