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
				out.println("����ʵe");
				break;
			case RIGHT:
				out.println("�V�k�ʵe");
				break;
			case LEFT:
				out.println("�V���ʵe");
				break;
			case UP:
				out.println("�V�W�ʵe");
				break;
			case DOWN:
				out.println("�V�U�ʵe");
				break;
		}
	}

	public static void play(int ordinal) {
		// TODO Auto-generated method stub
		out.println(ordinal);
	}



}
