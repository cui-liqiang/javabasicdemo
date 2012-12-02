import com.tw.Calculator;

public class Sample{
	public static void main(String[] args) {
		new Sample().printSum(2, 3);
	}

	public void printSum(int a, int b) {
		Calculator cal = new Calculator();
		java.lang.System.out.println(cal.sum(a, b));
	}
}