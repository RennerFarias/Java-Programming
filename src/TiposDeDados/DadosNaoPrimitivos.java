package TiposDeDados;
public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Renner Farias";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println("Esse texto está em CAPSLOCK = " + nomeUpperCase);//capslock
        System.out.println(nome);//normal

        String casasbahia = "Casas bahia";
        String casasbahiaUpperCase =casasbahia.toUpperCase();
        System.out.println(casasbahiaUpperCase);


    }
}
/*
Dados não primitivos: String, Array, Class, enum
String: Tipo para armazenar texto:  ("texto")
Arry: Estrutura para armazenar vários valores do mesmo tipo.
Class: Para criar objetos (define atributos e métodos).
enum: Lista de valores fixos e pré-definidos

exeplos: String: "Olá, mundo!"	Textos, mensagens
         Array: int[] nums = {1, 2, 3};	Listas de valores
         Class: class Pessoa { ... }	Modelar objetos complexos
         enum: enum Dia { SEG, TER, QUA }	Opções fixas (menus, estados)
 */