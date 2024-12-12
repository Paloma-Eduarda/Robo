
import java.util.Scanner;

public class Main {

    private static final int maxLinhas = 20;
    private static final int maxColunas = 40;

    public static void main(String[] args) {
        Robo robo = new Robo(0, 1, 0); // Robô começa na posição (0,0) com passo 1
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            mostrarSala(robo);
            System.out.println(robo.mostrarPosicaoAtual());
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Andar para Frente");
            System.out.println("2 - Andar para Trás");
            System.out.println("3 - Andar para Direita");
            System.out.println("4 - Andar para Esquerda");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    robo.andarFrente();
                    break;
                case 2:
                    robo.andarTras();
                    break;
                case 3: robo.andarDireita();
                    break;
                case 4:
                    robo.andarEsquerda();
                    break;
                case 0:
                    continuar = false;
                    break;
               default :
                   System.out.println("Opção inválida. Tente novamente.");
                   break;
            }
        }
        scanner.close();
    }

    private static void mostrarSala(Robo robo) {
        for (int i = 0; i < maxLinhas; i++) {
            for (int j = 0; j < maxColunas; j++) {
                if (i == robo.getLinha() && j == robo.getColuna()) {
                    System.out.print("\uD83E\uDD16"); // Robô
                } else {
                    System.out.print("-"); // Espaço vazio
                }
            }
            System.out.println();
        }
        //System.out.println();
    }
}