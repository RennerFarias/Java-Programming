package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        int idade = 18;
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        long saldoBancario = 1234L;

        System.out.println(idade);
        System.out.println (altura);
        System.out.println(inicial);
        System.out.println(vivoOuMorto);
        System.out.println(saldoBancario);
        System.out.println("saldoBancario = " + saldoBancario);
    }
}

/*
DADOS PRIMITIVOS:
int: Guarda numeros inteiros
double: Guarda numero com casas decimais
char: Guarda uma unica letra/simbolo (sempre com aspas simples)
boolen: Guarda (true) ou (false)
long: Guarda numeros inteiros muito grande (usa L no final)

! public static void main(String[] args {} : é o métado principal que o java procura para iniciar o programa !
! Como printar a informação na tela: System.out.print ()

ATALHOS DO IntelliJ IDEA:
voce pode utilizar o (psvm) para fazer a função: public static void main(String[] args {}
voce pode utilizar o (sout) para fazer a função:   System.out.println();
*/



