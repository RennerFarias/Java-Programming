package Condicoes;

public class IFeElse {
    public static void main(String[] args) {

        //Dados pessoais
        String nome = "Renner Farias";
        int idade = 20;
        boolean formado = false;
        short anosconcluidos = 1;

        if (anosconcluidos >= 8 && idade>= 24)
        {
            System.out.println("voce está pronto para vida");
        } else if (anosconcluidos == 4 && idade >= 20) {
            System.out.println("voce ta quase lá");
        } else {
            System.out.println("voce ainda não está pronto, calma");
        }

    }
}

/*
Essa pagina é pra mostrar quando Renner irá conseguir está pronto para vida utilizando
IF =(Verifica uma condição; se for verdadeira, executa o bloco de código.)
else if: Testa uma nova condição se o if anterior for falso.
else: Executa um bloco se a condição do if for falsa (sem verificar nova condição)
-----------------------------------------------------------------------------------------------
if (condicao) {resultado} se isso não acontecer
else if (condicao) {resultado}
else {resultado se nada for verdadeiro}
aula 8
 */
