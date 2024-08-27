package fundamentosPoo;

public class Carro extends Veiculo {
	
	
	public void ligar() {
		conferindoCombustivel();
		confereCambio();
		System.out.println("CARRO LIGADO");

	}
	private void conferindoCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio em P");
	}
}
