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
		System.out.println("a) A l�gica � adicionar 2 ao n�mero anterior, mostrando n�meros �mpares, ent�o o pr�ximo n�mero � 9.");

//--------B----------------//
		
		int b = 2;
		
		System.out.print(b + " ");
		
		while (b < 128) {
			b *= 2;
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("b) A l�gica � o dobro do n�mero anterior, ent�o o pr�ximo n�mero � 128.");
		
//-------C----------//
		
		for (int i = 1; i <= 7; i++) {
            int quadrado = i * i;
            System.out.print(quadrado + " ");
        }
		System.out.println();
		System.out.println("c) A l�gica � o quadrado do n�mero anterior, ent�o o pr�ximo n�mero � 49.");
		
//-------D--------//
		
		int d1 = 2 * 2;
		int d2 = 4 * 4;
		int d3 = 6 * 6;
		int d4 = 8 * 8;
		int d5 = 10 * 10;
		
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
		System.out.println("d) A l�gica s�o os 5 primeiros quadrados perfeitos, ent�o o pr�ximo n�mero � 100.");
		
//------E--------//
		
		int num = 13;
        
        int fib1 = 0, fib2 = 1, fib3;
        
        System.out.print("Sequ�ncia de Fibonacci at� " + num + ": ");
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
        
        System.out.println("e) A l�gica � a sequ�ncia de Fibonacci, ent�o o pr�ximo n�mero � 13.");
//----------F---------//
        
        System.out.println("f) N�o achei um padr�o para o in�cio al�m dos n�meros estarem aumentando gradualmente, e como os �ltimos 3 n�meros seguem uma sequ�ncia de +1, poderia dizer que o n�mero � 20 ou como no in�cio 21012 poderia ser 19, 91.");
	}
		
}
