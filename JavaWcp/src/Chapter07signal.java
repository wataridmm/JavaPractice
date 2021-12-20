
public class Chapter07signal {
	public static void main(String... args) {
		String signal = "red";
		switch (signal) {
		case "red":
			System.out.println("信号の色は赤です");
			break;
		case "yellow":
			System.out.println("信号の色は黄色です");
			break;
		case "blue":
			System.out.println("信号の色は青です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}

}
