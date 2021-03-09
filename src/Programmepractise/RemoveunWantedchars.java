package Programmepractise;

public class RemoveunWantedchars {

	public static void main(String[] args) {
      String s="#@!$%^ Kamlesh ";
      String rep=s.replaceAll("[^a-zA-Z0-9]","");
      System.out.println(rep);

	}

}
