package primeira.classe;

import java.util.Scanner;

public class PrimeiraClasse {

    public static void main(String[] args) {
        new PrimeiraClasse();
    }

    public PrimeiraClasse() {
        Aluno patropi = new Aluno();
        Scanner entrada = new Scanner(System.in);

        //recebendo os valores diretamente no objeto
        System.out.println("Nome do Aluno: ");
        patropi.nome = entrada.nextLine();

        System.out.println("Nota em Matemática: ");
        patropi.notaMat = entrada.nextDouble();

        System.out.println("Nota em Física: ");
        patropi.notaFis = entrada.nextDouble();

        // Calculando a média
        double media = (patropi.notaMat + patropi.notaFis) / 2;

        System.out.printf("O aluno \"%s\" tirou %.2f em matemática e %.2f em física, obtendo uma média de %.2f\n", patropi.nome, patropi.notaMat, patropi.notaFis, media);
    }
}