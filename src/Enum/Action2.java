package Enum;
import static java.lang.System.out;
public enum Action2 implements Command {
	STOP{
		public void execute() {
			out.println("停止撥放");
		}
	},
	RIGHT{
		public void execute() {
			out.println("向右撥放");
		}
	},
	LEFT{
		public void execute() {
			out.println("向左撥放");
		}
	},
	UP{
		public void execute() {
			out.println("向上撥放");
		}
	},
	DOWN{
		public void execute() {
			out.println("向下撥放");
		}
	};

}
