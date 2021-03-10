package Programmepractise;

public class FindLargestandSmallestNum {

	public static void main(String[] args) {
		int num[]={-89,45,7,8,5,6,15};
		int smallest=num[0];
		int largest=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<smallest)
			{
				smallest=num[i];
			}
			
			else if(num[i]>largest)
				{
					largest=num[i];
					
				}
				
			}
		System.out.println("The largest value is "+largest);
		System.out.println("The smallest value is"+smallest);
		}
	}


