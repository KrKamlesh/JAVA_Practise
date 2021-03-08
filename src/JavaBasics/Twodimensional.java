package JavaBasics;

public class Twodimensional 
{
	public static void main(String[] args) {
		String x[][]=new String[3][3];
		//length of row
		System.out.println(x.length);
		//length of col
		System.out.println(x[0].length);
		//1st row
		x[0][0]="A";
	    x[0][1]="b";
		x[0][2]="c";
		//2nd row
		x[1][0]="d";
		x[1][1]="r";
		x[1][2]="f";
		//3rd row 
		x[2][0]="g";
		x[2][1]="k";
		x[2][2]="o";
		
		System.out.println(x[0][2]);
		
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
				
			}
		}
	}

}
