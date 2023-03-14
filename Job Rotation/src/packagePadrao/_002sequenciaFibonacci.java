package packagePadrao;
import java.util.Scanner;

public class _002sequenciaFibonacci {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro: ");
        int num = scanner.nextInt();
        
        int fib1 = 0, fib2 = 1, fib3;
        boolean pertence = false;
        
        System.out.print("Sequ�ncia de Fibonacci at� " + num + ": ");
        System.out.print(fib1 + " " + fib2 + " ");
        
        while (true) {
            fib3 = fib1 + fib2;
            if (fib3 > num) {
                break;
            }
            System.out.print(fib3 + " ");
            if (fib3 == num) {
                pertence = true;
            }
            fib1 = fib2;
            fib2 = fib3;
        }
        
        if (pertence) {
            System.out.println("\n" + num + " pertence � sequ�ncia de Fibonacci.");
        } else {
            System.out.println("\n" + num + " n�o pertence � sequ�ncia de Fibonacci.");
        }
        
        scanner.close();
    }
}