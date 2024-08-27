package escola;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		Pessoas marcos = new Pessoas("123", "Heitor");
		
		marcos.setEndereco ("Rua das ameiras");
		
		
		System.out.println(marcos.getNome()+ " - " + marcos.getCpf());
	}

}
