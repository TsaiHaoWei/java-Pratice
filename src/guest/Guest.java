package guest;
import java.util.*;
import static java.lang.System.out;

public class Guest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names =new ArrayList<>();
		collectNameTo(names);
		out.println("�X�ȦW��: ");
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
			out.print("�X�ȦW��:");
			name=scanner.next();
			if(name.equals("quit")) break;
			
			names.add(name);
		}
	}

}
