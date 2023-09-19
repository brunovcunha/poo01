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

        Esfera esfera = new Esfera(raio);

        Cone cone = new Cone(altura, raio);

        System.out.println("----Menu----\n 1-Circulo\n 2-Cilindro\n 3-Cone\n 4-Esfera\n 5-Sair");
        int n = s.nextInt();

        while (n != 5) {
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
                                textoCirculo = "Area do Circulo = " + String.format("%.2f", circulo.area());
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
                                String textoCilindro = cilindro.exibeCilindro(raio);
                                exibeTexto(textoCilindro);
                                break;
                            case 2:
                                textoCilindro = "Area do Cilindro = " + String.format("%.2f", cilindro.area(circulo.area(), circulo.comprimento()));
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

                case 3:
                    System.out.println("----Menu Cone----\n 1-Dados do Cone\n 2-Área do Cone\n 3-Volume do Cone\n 4-VOLTAR");
                    int menCone = s.nextInt();
                    while (menCone != 4) {
                        switch (menCone) {
                            case 1:
                                String textoCone = cone.exibeCone();
                                exibeTexto(textoCone);
                                break;
                            case 2:
                                textoCone = "Area do Cone = " + String.format("%.2f", cone.areaCone(circulo.area()));
                                exibeTexto(textoCone);
                                break;
                            case 3:
                                textoCone = "Volume do Cone = " + String.format("%.2f", cone.volumeCone(circulo.area()));
                                exibeTexto(textoCone);
                                break;
                        }
                        System.out.println("----Menu Cone----\n 1-Dados do Cone\n 2-Área do Cone\n 3-Volume do Cone\n 4-VOLTAR");
                        menCone = s.nextInt();
                    }
                    break;

                case 4:
                    System.out.println("----Menu Esfera----\n 1-Dados da Esfera\n 2-Área da Esfera\n 3-Volume da Esfera\n 4-VOLTAR");
                    int menEsfera = s.nextInt();
                    while (menEsfera != 4) {
                        switch (menEsfera) {
                            case 1:
                                String textoEsfera = "Dados da Esfera: " + esfera.exibeEsfera();
                                exibeTexto(textoEsfera);
                                break;
                            case 2:
                                textoEsfera = "Area da Esfera = " + String.format("%.2f", esfera.areaEsfera());
                                exibeTexto(textoEsfera);
                                break;
                            case 3:
                                textoEsfera = "Volume da Esfera = " + String.format("%.2f", esfera.volumeEsfera());
                                exibeTexto(textoEsfera);
                                break;
                        }
                        System.out.println("----Menu Esfera----\n 1-Dados da Esfera\n 2-Área da Esfera\n 3-Volume da Esfera\n 4-VOLTAR");
                        menEsfera = s.nextInt();
                    }
                    break;

            }

            System.out.println("----Menu----\n 1-Circulo\n 2-Cilindro\n 3-Cone\n 4-Esfera\n 5-Sair");
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
