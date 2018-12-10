package Enum;
import static java.lang.System.out;



public class Game {
	public static void main(String[] args) {
		play(Action.RIGHT);
		play(Action.UP);
	}

	public static void play(Action action) {
		// TODO Auto-generated method stub
		switch(action) {
			case STOP:
				out.println("停止動畫");
				break;
			case RIGHT:
				out.println("向右動畫");
				break;
			case LEFT:
				out.println("向左動畫");
				break;
			case UP:
				out.println("向上動畫");
				break;
			case DOWN:
				out.println("向下動畫");
				break;
		}
	}

	public static void play(int ordinal) {
		// TODO Auto-generated method stub
		out.println(ordinal);
	}



}
