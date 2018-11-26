package Enum;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameDemo.play(Action.DOWN.ordinal());
		GameDemo.play(Action.UP.ordinal());
		
	}

	private static void play(int ordinal) {
		// TODO Auto-generated method stub
		switch(ordinal){
			case 0:
				System.out.println("Stop");
				break;
			case 1:
				System.out.println("Right");
				break;
			case 2:
				System.out.println("Left");
				break;
			case 3:
				System.out.println("Up");
				break;
			case 4:
				System.out.println("Down");
				break;
		}
	}

}
