package Generic;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Egg> eggBox = new ArrayList<Egg>(5);
		String name;
		while(true) {
			System.out.print("Please input the name of eggs: ");
			name = scanner.next();
			if (name.equals("AB")) { break; }
			eggBox.add(new Egg(name));
			System.out.println();
		}
		System.out.printf("The total number of eggs: %d",eggBox.size());
		for(int i=0;i<eggBox.size();i++) {
			System.out.printf("The name of the Egg: %s%n", eggBox.get(i));
		}
	}
}
