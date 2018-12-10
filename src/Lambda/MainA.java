package Lambda;
class Hello{
	
	Runnable r1 = new Runnable(){
		public void run() {
			System.out.println(this);
		}
	};	
	Runnable r2 = new Runnable(){
		public void run() {
			System.out.println(toString());
		}
	};
	@Override
	public String toString() {
		return "Halloe word!";
	}

}
class Hello2{
	Runnable r1 =()->System.out.println(this);
	Runnable r2 =()->System.out.println(toString());
	
	@Override
	public String toString() {
		return "Hallo word!";
	}
}
public class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello().r1.run();
		new Hello().r2.run();
		new Hello2().r1.run();
		new Hello2().r2.run();
	}

}
