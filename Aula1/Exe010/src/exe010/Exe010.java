package exe010;

public class Exe010 {

    public void calcular() {

        int somaLados = 0;
        int contador = 0;

        for (int lado1 = 1; lado1 <= 500; lado1++) {
            for (int lado2 = 1; lado2 <= 500; lado2++) {
                for (int hipotenusa = 1; hipotenusa <= 500; hipotenusa++) {
                    somaLados = (lado1 * lado1) + (lado2 * lado2);
                    if ((hipotenusa * hipotenusa) == somaLados) {
                        System.out.println("Triângulo de pitágoras com:\n"
                                + "\tLado 1: " + lado1
                                + "\n\tLado 2: " + lado2
                                + "\n\tHipotenusa: " + hipotenusa);
                        contador++;
                    }
                }
            }
        }
        System.out.println("Existe um total de " + contador
                + " triângulos de Pitágoras.");
    }

    public static void main(String[] args) {
        Exe010 triangPitagoras = new Exe010();
        triangPitagoras.calcular();
    }
}
