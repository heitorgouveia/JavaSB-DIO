public class CondicaoTernaria {

    public static void main(String[] args) {
        
        int nota = 4;

        String resultado = nota >= 7? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação": "Reprovado"; /*Encadeado com ternário */

        System.out.println(resultado);
    }
    
}