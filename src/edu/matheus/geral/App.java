package edu.matheus.geral;
public class App {

    public static void main(String[] args) {
        
        //Aula 2
        String meuNome = "Matheus";

        int anoFrabicacao = 2022;

        boolean simNao = true;

        anoFrabicacao = 2018;
        //---------------------------------

        String primeiroNome = "Matheus";

        String segundoNome = "Freitas";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        
        //Aula 3
        

    }

    //Aula 2
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    //Aula 3
    

}