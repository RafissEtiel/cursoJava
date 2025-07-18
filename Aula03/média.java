import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Rafaela de Jesus Leite

public class média {
    public static <Alunos> void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite  seunome: ");
       String nome = scanner.nextLine();

       double medias [] = new double[3];
        double nota1 = 10;
        double nota2 = 7;
        double nota3 = 9;
        double nota4 = 6;

        double media = (nota1 + nota2 + nota3)/3;
        double arredondada = Math.round(media * 100 ) / 100;

        System.out.print("Olá, "+ nome + " gostaria de visualizar suas notas?" + "\n") ;
        String nota = scanner.nextLine();
        System.out.print(("Sua nota do 1° bimestre é ") + nota1 + "\n") ;
        System.out.print(("Sua nota do 2° bimestre é ") + nota2 + "\n");
        System.out.print(("Sua nota do 3° bimestre é ") + nota3 + "\n");
        System.out.print(("Sua nota do 4° bimestre é ") + nota4 + "\n");

        System.out.print("Gostaria de visualizar sua média geral?" + "\n");
        String geral = scanner.nextLine();

        System.out.print(("Sua média geral é ") + arredondada + " ." + "\n");



    }
}