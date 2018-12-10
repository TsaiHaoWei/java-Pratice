package Lambda;

import java.util.Arrays;

public class StringOrder {
	public static int byLength(String s1,String s2) 
	{
		return s1.length()-s2.length(); //長度比較
	}
	
	public static int byLexicography(String s1,String s2)
	{
		return s1.compareTo(s2);//大寫先 後排列
	}
	
	public static int byLexicographylgnaoreCase(String s1,String s2)
	{
		return s1.compareToIgnoreCase(s2);//不分大小寫
	}
	public static void Stringprint(String[] names) 
	{
		for(String name:names)
			System.out.printf("%s ",name);
			System.out.println();
	}
}
