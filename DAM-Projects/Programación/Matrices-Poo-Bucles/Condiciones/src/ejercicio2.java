import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double preciobase = sc.nextDouble();
        double edad = sc.nextDouble();
        double diasemana = sc.nextDouble();
        boolean cupon = sc.next().equalsIgnoreCase("true");
        double preciomenoredad=0;
        double descupon = (preciobase*30)/100;
        double pfinal=0;
        double descmiercoles= (preciobase*25)/100;
        double aumentofinde= (preciobase*5)/100;
        double desc18 = (preciobase*10)/100;
        double desc65 = (preciobase*15)/100;

        if (cupon) {
            pfinal = preciobase-descupon;
            if (diasemana==3){
                pfinal= pfinal-descmiercoles;
            } else if (diasemana==6 || diasemana==7) {
                pfinal = pfinal + aumentofinde;
            }
        }else {
            if (edad<6) {
                pfinal=0;
            }else if (edad<18){
                pfinal=preciobase-desc18;
                if(diasemana==3){
                    pfinal=pfinal-descmiercoles;
                }else if(diasemana==6 || diasemana==7){
                    pfinal=pfinal+aumentofinde;
                }
            }else if (edad>=65){
                pfinal=preciobase-desc65;
                if(diasemana==3){
                    pfinal=pfinal-descmiercoles;
                } if(diasemana==6 || diasemana==7){
                    pfinal=pfinal+aumentofinde;
                }

            } else {
                pfinal=preciobase;
                if(diasemana==3){
                    pfinal=pfinal-descmiercoles;
                } if(diasemana==6 || diasemana==7){
                    pfinal=pfinal+aumentofinde;
                }

            }

        }
        System.out.println(pfinal);
    }
}
