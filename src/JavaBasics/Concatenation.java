package JavaBasics;

public class Concatenation {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		String stt="hellow";
		String st="world";
		double d=120.33;
		double d1=12.33;
		
		System.out.println(i+j);
		
		System.out.println(stt+st);
		System.out.println(stt+st+i+j);
		System.out.println(stt+st+(i+j));
		System.out.println(i+j+stt+st+i+j);
		System.out.println(i+j+stt+st+i+j+d+d1);
		System.out.println(d+d1+i+j+stt+st+i+j+d+d1);
		System.out.println("Hellow world");
		System.out.println("The value of i is"+(i+j));
		System.out.print(d1+d1);
		
		
		
	}

}
