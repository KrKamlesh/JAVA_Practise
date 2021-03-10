package Programmepractise;

public class StringManipulation {

	public static void main(String[] args) {
		String name="Kamlesh Kumar";
		
		String s=" Hello ";
		
		String sp="Hello_Kamlesh_Kumar";
		
		//find length of string
		System.out.println(name.length());
		
		//Find the char at particular index
		System.out.println(name.charAt(2));
		
		//Find the index of the particular char
		System.out.println(name.indexOf('l'));
		
		//Find the index of the particular string
	     System.out.println(name.indexOf("Kumar"));	
	     
	     //Output of string which is not available
	     
	     System.out.println(name.indexOf("Hello"));	
	     
	     //Find the substring 
	     System.out.println(name.substring(2, 5));	
	     
	     //Remove space from start and end position
	     System.out.println(s.trim());
	     
	     //Remove space from in between the string
	     System.out.println(name.replace(" ",""));
	     
	    
	    
	     
	}

}
