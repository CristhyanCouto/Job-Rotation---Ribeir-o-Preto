package packagePadrao;

public class _004doisVeiculos {

	public static void main(String[] args) {
		
		float distancia = 100.00f;
		float pontoCarro, pontoCaminhao;
		float velocidadeCarro = 110.00f;
		float velocidadeCaminhao = 80.00f;
		float tempoCarro, tempoCaminhao;
		float encontro;
		float distanciaQueFaltaCaminhao;
		
		tempoCarro = (distancia / (velocidadeCarro / 60f));
		
		System.out.printf("Tempo da viagem do carro: %.2f min%n", tempoCarro);
		
		tempoCaminhao = distancia / (velocidadeCaminhao / 60f) + (2f * 5f / 60f);
		
		System.out.printf("Tempo da viagem do caminhão: %.2f min%n", tempoCaminhao);
		
		encontro = (((velocidadeCarro + velocidadeCaminhao) / 60) / distancia);
		System.out.println(encontro);
		
		System.out.println("31 min: encontro");
		
		pontoCarro = velocidadeCarro * encontro * 10;
		System.out.println(pontoCarro);
		
		pontoCaminhao = velocidadeCaminhao * encontro * 10;
		System.out.println(pontoCaminhao);
		
		distanciaQueFaltaCaminhao = 100 - pontoCaminhao;
		
		System.out.println(distanciaQueFaltaCaminhao);
		
		System.out.println("O carro está mais próximo de Ribeirão, pois no encontro que ocorre em volta dos 31 minutos, o carro percorreu 34.8 km enquanto o caminhao percorreu 25.3 saindo de Franca");

	}

}
