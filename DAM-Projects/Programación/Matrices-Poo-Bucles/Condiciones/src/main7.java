import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valor1 = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
        String[] valor2= {"D", "G"};
        String[] valor3 = {"B", "C", "M", "P"};
        String[] valor4 = {"F", "H", "V", "W", "Y"};
        String[] valor5 = {"K"};
        String[] valor8 = {"J", "X"};
        String[] valor10 = {"Q", "Z"};

        String letraIngresada = sc.next().toUpperCase();
        int puntuacion = 0;

        if (puntuacion==0) {
            for(String letra : valor1) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 1;
                    break;
                }
            }
        }if (puntuacion == 0) {
            for (String letra : valor2) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 2;
                    break;
                }
            }
        }

        if (puntuacion == 0) {
            for (String letra : valor3) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 3;
                    break;
                }
            }
        }

        if (puntuacion == 0) {
            for (String letra : valor4) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 4;
                    break;
                }
            }
        }

        if (puntuacion == 0) {
            for (String letra : valor5) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 5;
                    break;
                }
            }
        }

        if (puntuacion == 0) {
            for (String letra : valor8) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 8;
                    break;
                }
            }
        }

        if (puntuacion == 0) {
            for (String letra : valor10) {
                if (letra.equals(letraIngresada)) {
                    puntuacion = 10;
                    break;
                }
            }
        } if (puntuacion > 0) {
            System.out.println(puntuacion);
        } else {
            System.out.println("Error: Letra no reconocida o entrada incorrecta.");
        }

    }
}
