package Programmepractise;

public class Palidrome {

	public static void main(String[] args) {
		
	int num=121;
	int rem=0
			;
	int rev=0;
	int temp=num;
	while(num>0)
	{
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	}
	if(temp==num)
	{
		System.out.println("The number is palidrome");
	}
	else
	{
		System.out.println("The number is not palidrome");
	}
	}

}