import java.util.*;
public class StringSort {
	public static String[] sortStrings(String str[])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		int n=sc.nextInt();sc.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		String sortedStr[]=sortStrings(str);
		if(n%2==1)
		{
			for(int i=0;i<=n/2;i++)
			{
				System.out.print(sortedStr[i]+" ");
			}
			System.out.print("\n");
			for(int i=((n/2)+1);i<n;i++)
			{
				System.out.print(sortedStr[i]+" ");
			}
		}
		else
		{
			for(int i=0;i<n/2;i++)
			{
				System.out.print(sortedStr[i]+" ");
			}
			System.out.print("\n");
			for(int i=n/2;i<n;i++)
			{
				System.out.print(sortedStr[i]+" ");
			}
		}
	}
}