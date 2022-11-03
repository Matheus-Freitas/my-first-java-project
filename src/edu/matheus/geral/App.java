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
        
        nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        //Metodos 3 SmartTV

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo Status -- TV Ligada: " + smartTv.ligada);


    }

    //Aula 2
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    //Aula 3
    

}