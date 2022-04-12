package recursion;

public class RecursaoDecimalBinario {
	
	public static void main(String[] args) {
		RecursaoDecimalBinario.DecimalParaBinario(10);
	}
	
	public static void DecimalParaBinario (int n) {
		if(n > 0) {
			DecimalParaBinario(n/2);
			System.out.print(n%2);
		}
	}
}