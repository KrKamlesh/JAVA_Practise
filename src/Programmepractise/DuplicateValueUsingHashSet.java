package Programmepractise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateValueUsingHashSet {

	public static void main(String[] args) {
		String names[] = { "Java", "Selenium", "Java", "Pyhton", "DotNet" };
		HashSet st=new HashSet();
		for(String name:names)
		{
			if(st.add(name)==false)
			{
				System.out.println("The missing string is "+name);
			}
		}

	}}
