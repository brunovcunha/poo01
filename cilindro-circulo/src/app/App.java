package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe as coordenadas: ");
        double xc = leCoordenada(1, s);
        double yc = leCoordenada(2, s);

        System.out.println("Informe o raio: ");
        double raio = leRaio(s);

        System.out.println("Informe a Altura: ");
        double altura = leAltura(s);

        Cilindro cilindro = new Cilindro(altura);

        Circulo circulo = new Circulo(xc, yc, raio);

        System.out.println("----Menu----\n 1- Circulo\n 2-Cilindro\n 3- Sair");
        int n = s.nextInt();

        while (n != 3) {
            switch (n) {
                case 1:
                    System.out.println("----Menu Circulo----\n 1-Dados do Circulo\n 2-Área do Circulo\n 3-Comprimento do Circulo\n 4-VOLTAR\n");
                    int menCirculo = s.nextInt();
                    while (menCirculo != 4) {
                        switch (menCirculo) {
                            case 1:
                                String textoCirculo = "Dados do círculo:\n" + circulo.exibeCirculo();
                                exibeTexto(textoCirculo);
                                break;
                            case 2:
                                textoCirculo = "Área do Circulo = " + String.format("%.2f", circulo.area());
                                exibeTexto(textoCirculo);
                                break;
                            case 3:
                                textoCirculo = "Comprimento do Circulo = " + String.format("%.2f", circulo.comprimento());
                                exibeTexto(textoCirculo);
                                break;
                        }
                        System.out.println("----Menu Circulo----\n 1-Dados do Circulo\n 2-Área do Circulo\n 3-Comprimento do Circulo\n 4-VOLTAR\n");
                        menCirculo = s.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("----Menu Cilindro----\n 1-Dados do Cilindro\n 2-Área do Cilindro\n 3-Volume do Cilindro\n 4-VOLTAR\n");
                    int menCilindro = s.nextInt();
                    while (menCilindro != 4) {
                        switch (menCilindro) {
                            case 1:
                                String textoCilindro = "Dados do Cilindro:\n" + cilindro.exibeCilindro(raio);
                                exibeTexto(textoCilindro);
                                break;
                            case 2:
                                textoCilindro = "Área do Cilindro = " + String.format("%.2f", cilindro.area(circulo.area(), circulo.comprimento()));
                                exibeTexto(textoCilindro);
                                break;
                            case 3:
                                textoCilindro = "Volume do Cilindro = " + String.format("%.2f", cilindro.volume(circulo.area()));
                                exibeTexto(textoCilindro);
                                break;
                        }
                        System.out.println("----Menu Cilindro----\n 1-Dados do Cilindro\n 2-Área do Cilindro\n 3-Volume do Cilindro\n 4-VOLTAR\n");
                        menCilindro = s.nextInt();
                    }
                    break;
            }

            System.out.println("----Menu----\n 1- Circulo\n 2-Cilindro\n 3- Sair");
            n = s.nextInt();
        }
    }

    public static double leCoordenada(int n, Scanner scanner) {
        double coordenada = 0.0;
        switch (n) {
            case 1:
                System.out.printf("XC: ");
                coordenada = scanner.nextDouble();
                break;
            case 2:
                System.out.printf("YC: ");
                coordenada = scanner.nextDouble();
                break;
        }
        return coordenada;
    }

    public static double leRaio(Scanner scanner) {
        System.out.printf("Raio: ");
        double raio = scanner.nextDouble();
        return raio;
    }

    public static double leAltura(Scanner scanner) {
        System.out.printf("Altura: ");
        double altura = scanner.nextDouble();
        return altura;
    }

    public static void exibeTexto(String texto) {
        System.out.println(texto);
    }
}
