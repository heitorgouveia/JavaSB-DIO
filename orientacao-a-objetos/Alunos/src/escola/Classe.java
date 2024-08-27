package escola;



public class Classe {
	
	public static void main(String[] args) {
		Alunos felipe= new Alunos();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		
		System.out.println("O Aluno "+ felipe.getNome() + " tem "+ felipe.getIdade() + " anos ");
	}
}
