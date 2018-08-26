
public class FibonacciIterative implements Fibonacci{
	public int fibonacci (int num) {
		if(num <= 1)
			return 1;

		int temp = 1;
		int current = 1;
		int prev = 0;

		for(int i = 0; i < num; i++) {
			temp = current;
			current += prev;
			prev = temp;
		}
		return temp;
	}
}
