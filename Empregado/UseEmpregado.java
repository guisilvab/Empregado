package Empregado;
import java.util.Scanner;

public class UseEmpregado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do analista: ");
        String nomeAnalista = scanner.nextLine();
        System.out.print("Digite a matrícula do analista:  ");
        String matriculaAnalista = scanner.nextLine();
        System.out.print("Digite o número de projetos do analista: ");
        int numProjetos = scanner.nextInt();
        float[] valorPorProjetoAnalista = new float[numProjetos];
        for (int i = 0; i < numProjetos; i++) {
            System.out.print("Digite o valor do projeto " + (i+1) + ":");
            valorPorProjetoAnalista[i] = scanner.nextFloat();
        }
        System.out.println("-----------------------------------------------");
        Analista analista = new Analista(nomeAnalista, matriculaAnalista, valorPorProjetoAnalista);

    
        System.out.print("Digite o nome do programador: ");
        scanner.nextLine();
        String nomeProgramador = scanner.nextLine();
        System.out.print("Digite a matrícula do programador: ");
        String matriculaProgramador = scanner.nextLine();
        System.out.print("Digite a quantidade de horas trabalhadas pelo programador: ");
        float qtdeHorasProgramador = scanner.nextFloat();
        System.out.print("Digite o valor da hora do programador: ");
        float valorHoraProgramador = scanner.nextFloat();
       
        Programador programador = new Programador(nomeProgramador, matriculaProgramador, qtdeHorasProgramador, valorHoraProgramador);
        System.out.println("-----------------------------------------------");

        System.out.println("Salário do Analista: ");
        System.out.println("Nome: " + analista.getNome());
        System.out.println("Matrícula: " + analista.getMatricula());
        System.out.println("Salário: " + analista.calculaSalario());
        System.out.println("-----------------------------------------------");
        System.out.println("\nSalário do Programador: ");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Matrícula: " + programador.getMatricula());
        System.out.println("Salário: " + programador.calculaSalario());

        scanner.close();
    }
}
