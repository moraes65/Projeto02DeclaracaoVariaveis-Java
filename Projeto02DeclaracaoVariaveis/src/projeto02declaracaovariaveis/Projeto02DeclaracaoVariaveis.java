/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto02declaracaovariaveis;

/**
 *
 * @author aluno
 */
public class Projeto02DeclaracaoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Comentarios linha simples
        /*
        Comentarios em mais de uma
        linha
        */
        
        //definir uma variavel em java (TIPO NOME;)
        int idade; //declaracao da variavel
        idade = 30; // inicializacao da variavel
        int novaIdade = 35; // declara e inicializa
        
        // operadores + - / *
        idade = idade + 10;
        int divisao = 11 / 2;
        int modulo = 11 % 2;
        
        System.out.println("Idade: " + idade);
        // sout + tab
        System.out.println("Tecla de Atalho");
        
        // double e float
        double pi = 3.14;
        int x = 20;
        x = x / 3;
        System.out.println("Valor de X: " + x);
        
        boolean menorIdade = idade < 18; // retorna true ou false
        System.out.println("Menor Idade: " + menorIdade);
        
        char letraA = 'a';
        System.out.println("Letra A: " + letraA);
    }
    
}
