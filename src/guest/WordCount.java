package guest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		String line =input("請輸入英文");
			Set<String>words = tokens(line);
		System.out.printf("不重複單字有 %d 個：%s%n", words.size(), words);
	}

	private static Set<String> tokens(String line) {
		String[] tokens=line.split(" ");
		Set<String>words = new HashSet<>();
		for(String token:tokens) words.add(token);
		return words;
	}

	static String input(String string) {
		System.out.print(string);
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}

}
