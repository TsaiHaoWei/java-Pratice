package Enum;

public class Game3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game3.play(Action2.RIGHT);
		Game3.play(Action2.DOWN);
	}
	
	static void play(Action2 action) {
		action.execute();
	}
}
