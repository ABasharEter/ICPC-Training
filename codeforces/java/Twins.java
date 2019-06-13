import java.util.*;

public class Main
{
	public static void main(String[] args)
	{


		Scanner in = new Scanner(System.in);
        int n= in.nextInt();
		int s[]= new int[n];
		int sum=0,temp=0,index=0, sub=0;double half1=0;
		for(int i=0;i<n;i++)
		{
		s[i]=in.nextInt();
		sum+=s[i];
		}
		half1=sum/2;
		for(int i=0;i<s.length-1;i++)
		{
			for(int J=1;J<s.length;J++)
			{
				if(s[J-1]<s[J])
				{
					temp=s[J-1];
					s[J-1]=s[J];
					s[J]=temp;
				}
			}
			
		}
		for(int k=0;k<n;k++)
		{
		sub+=s[k];
		
		 index++;
		if(sub>half1)
			break;
			
			}
			System.out.println(index);
			
		}
}
