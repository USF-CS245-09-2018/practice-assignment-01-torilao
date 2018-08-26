
public class FactorialIterative implements Factorial{
	public int factorial(int num) {
		if(num == 0)
			return 1;
		int total = 1;
		for(int i =2; i <= num; i++) {
			total *= i;
		}
		return total;
	}
	
}
