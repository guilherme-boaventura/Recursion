package recursion;

public class Fibonacci {

	public static void main (String[] args) {
		fibonacci(0, 1, 0);
	}

	private static void fibonacci(int x, int y, int cont) {
		System.out.print(x + " ");
		int z = x;
		x = x + y;
		y = z;
		cont++;
		if(cont < 20) {
		fibonacci(x, y, cont);
		}
	}
}