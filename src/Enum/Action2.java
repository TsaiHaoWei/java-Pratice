package Enum;
import static java.lang.System.out;
public enum Action2 implements Command {
	STOP{
		public void execute() {
			out.println("�����");
		}
	},
	RIGHT{
		public void execute() {
			out.println("�V�k����");
		}
	},
	LEFT{
		public void execute() {
			out.println("�V������");
		}
	},
	UP{
		public void execute() {
			out.println("�V�W����");
		}
	},
	DOWN{
		public void execute() {
			out.println("�V�U����");
		}
	};

}
