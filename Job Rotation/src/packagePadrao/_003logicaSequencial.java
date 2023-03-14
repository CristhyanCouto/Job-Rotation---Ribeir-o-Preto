package packagePadrao;

public class _003logicaSequencial {

	public static void main(String[] args) {
//---------A-------------------//
		int a = 1;
		
		System.out.print(a + " ");
		
		while(a < 9) {
			a += 2;
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("a) A lógica é adicionar 2 ao número anterior, mostrando números ímpares, então o próximo número é 9.");

//--------B----------------//
		
		int b = 2;
		
		System.out.print(b + " ");
		
		while (b < 128) {
			b *= 2;
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("b) A lógica é o dobro do número anterior, então o próximo número é 128.");
		
//-------C----------//
		
		for (int i = 1; i <= 7; i++) {
            int quadrado = i * i;
            System.out.print(quadrado + " ");
        }
		System.out.println();
		System.out.println("c) A lógica é o quadrado do número anterior, então o próximo número é 49.");
		
//-------D--------//
		
		int d1 = 2 * 2;
		int d2 = 4 * 4;
		int d3 = 6 * 6;
		int d4 = 8 * 8;
		int d5 = 10 * 10;
		
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
		System.out.println("d) A lógica são os 5 primeiros quadrados perfeitos, então o próximo número é 100.");
		
//------E--------//
		
		int num = 13;
        
        int fib1 = 0, fib2 = 1, fib3;
        
        System.out.print("Sequência de Fibonacci até " + num + ": ");
        System.out.print(fib1 + " " + fib2 + " ");
        
        while (true) {
            fib3 = fib1 + fib2;
            if (fib3 > num) {
                break;
            }
            System.out.print(fib3 + " ");
            
            fib1 = fib2;
            fib2 = fib3;
        }
        
        System.out.println("e) A lógica é a sequência de Fibonacci, então o próximo número é 13.");
//----------F---------//
        
        System.out.println("f) Não achei um padrão para o início além dos números estarem aumentando gradualmente, e como os últimos 3 números seguem uma sequência de +1, poderia dizer que o número é 20 ou como no início 21012 poderia ser 19, 91.");
	}
		
}
