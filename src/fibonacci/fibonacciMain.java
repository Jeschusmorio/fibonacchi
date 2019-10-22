package fibonacci;

public class fibonacciMain {

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			int limit = i;
			int fibonacci = fibonacci(1, 0, limit, 2);
			System.out.println("Fibonacci-Folge bis Grenze "+limit+" = "+ fibonacci);
		}
	}

	public static int fibonacci(int lastNumber, int numberBeforeLastNumber, int limit, int counter) {
		if (limit == 0) {
			return 0;
		}
		if (limit == 1) {
			return 1;
		}
		if (counter >= limit) {
			return (lastNumber + numberBeforeLastNumber);
		}
		else {
			return fibonacci(lastNumber + numberBeforeLastNumber, lastNumber, limit, counter + 1);
		}
	}
}
