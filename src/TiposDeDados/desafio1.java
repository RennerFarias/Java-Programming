package TiposDeDados;

public class desafio1 {
    public static void main(String[] args) {


        int idade1 = 20;
        int idade2 = 19;
        int idade3 = 18;

        String nivel2 = "B";
        String nivel1 = "A";

        String missao1 = "Pescar 3 peixes";
        String missao2 = "Colocar o lixo pra fora";
        String missao3 = "Guardar as frutas";

        boolean feito = true;
        boolean naofeito = false;


        String vila = "Universidade Dos Malucos";
        String vilacapslock = vila.toUpperCase();
        String pessoa1 = "Renner Farias";
        String pessoa1UpperCase =pessoa1.toUpperCase();
        System.out.println(vilacapslock);
        System.out.println(pessoa1UpperCase);
        System.out.println("idade dele é = " + idade1);
        System.out.println("Atividade de hoje = " + missao1);
        System.out.println("Nivel de dificuldade é Level = " + nivel2);
        System.out.println("Atividade foi realizada: = " + feito);
        System.out.println("--------------------------------------");

        String pessoa2= "arthur josé";
        String pessoa2UpperCase=pessoa2.toUpperCase();
        System.out.println(pessoa2UpperCase);
        System.out.println("idade dele é = " + idade2);
        System.out.println(missao2);
        System.out.println("Nivel de dificuldade é level = " + nivel1);
        System.out.println("Atividade foi realizada: = " + naofeito);
        System.out.println("--------------------------------------");

        String pessoa3= "Igor Lima";
        String pessoa3UpperCase= pessoa3.toUpperCase();
        System.out.println(pessoa3UpperCase);
        System.out.println("Idade dele é = " + idade3);
        System.out.println(missao3);
        System.out.println("Nivel de dificuldade é level = " + nivel2);
        System.out.println("Atividade foi realizada = " + feito);
    }


}
