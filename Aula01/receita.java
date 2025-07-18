package Aula01;

public class receita {
    public static void main(String[] args) {
        //declarando e inicializando variáveis
        int idade = 18;
        double preco = 5.99;
        boolean isJavaFun = true;
        String saudacao = "Olá, Programador";
        char primeiraLetra = 'J';
        String nome = "Paulo";
        System.out.println(idade);
        // Imprimindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Preço: " + preco);
        System.out.println("Java é divertido? " + isJavaFun);
        System.out.println("Primeira letra: " + primeiraLetra);
        System.out.println("Saudação: " + saudacao);

        // Modificando uma variável
        idade = 21;
        System.out.println("Nova idade: " + idade);

    }
}

