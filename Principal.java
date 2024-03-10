import java.util.Scanner;

public class Principal {

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de controle de naves espaciais!");

		

        System.out.println("Digite o nome da nave:");
        String nome = scanner.nextLine();

        System.out.println("Digite a velocidade máxima da nave (em km/h):");
        double velocidadeMaxima = scanner.nextDouble();

        System.out.println("Digite o número máximo de tripulantes:");
        int numeroTripulantes = scanner.nextInt();

        System.out.println("Digite a quantidade de combustível disponível (em litros):");
        double combustivel = scanner.nextDouble();
        

        System.out.println("Escolha o tipo de nave (1 - Carga, 2 - Passageiros, 3 - Combate):");
        int tipoNave = scanner.nextInt();

        switch (tipoNave) {
            case 1:
                System.out.println("Digite a capacidade de carga da nave (em toneladas):");
                double capacidadeCarga = scanner.nextDouble();
                NaveCarga naveCarga = new NaveCarga(nome, velocidadeMaxima, numeroTripulantes, combustivel, capacidadeCarga);
                System.out.println(naveCarga);
                break;
            case 2:
                System.out.println("Digite o número atual de passageiros na nave:");
                int numeroPassageiros = scanner.nextInt();
                NavePassageiros navePassageiros = new NavePassageiros(nome, velocidadeMaxima, numeroTripulantes, combustivel, numeroPassageiros);
                System.out.println(navePassageiros);
                break;
            case 3:
                System.out.println("Digite o armamento da nave:");
                scanner.nextLine(); 
                String armamento = scanner.nextLine();
                NaveCombate naveCombate = new NaveCombate(nome, velocidadeMaxima, numeroTripulantes, combustivel, armamento);
                System.out.println(naveCombate);
                break;
            default:
                System.out.println("Tipo de nave inválido!");
                break;
        }

        scanner.close();
    }
}
