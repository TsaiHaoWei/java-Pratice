package guest;
import java.util.*;
import static java.lang.System.out;

public class Guest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names =new ArrayList<>();
		collectNameTo(names);
		out.println("訪客名單: ");
		printUpperCase(names);
	}

	static void printUpperCase(List<String> names) {
		// TODO Auto-generated method stub
		for(int i=0 ;i<names.size();i++) 
		{
			String name=names.get(i);
			out.println(name.toString());
		}
	}

	 static void collectNameTo(List<String> names) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		String name;
		while(true) 
		{
			out.print("訪客名稱:");
			name=scanner.next();
			if(name.equals("quit")) break;
			
			names.add(name);
		}
	}

}
