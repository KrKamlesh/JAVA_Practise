package JavaBasics;

public class Array 
{
	public static void main(String[] args) {
		
		int i[]=new int[8];
		       i[0]=10;
				i[1]=20;
				i[2]=30;
				i[3]=40;
				i[4]=50;
				
				System.out.println(i[3]);
				System.out.println(i[4]);
				
				System.out.println(i.length);
                for(int j=0;j<i.length;j++)
                {
                	System.out.println(i[j]);
                	
                }
				
		
	}

}
