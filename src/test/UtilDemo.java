package test;

public class UtilDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"B","X","A","M","F","W","O"};
		Util.sort(words);
		for (String word : words)
		{
			System.out.println(word);
		}
	}

}
