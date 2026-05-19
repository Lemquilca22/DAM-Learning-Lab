import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class tienda {
    static void print(String[] articulosdisponibles, String[] tienda){
        Random generador = new Random();
        int posicionTienda = 1;
        System.out.println("TIENDA-PABELLON 3C");
        for (int i = 1; i < 6; i++) {


            tienda[posicionTienda] = articulosdisponibles[i];
            System.out.print(posicionTienda + ") " + tienda[posicionTienda] + " - ");
            switch (tienda[posicionTienda]) {
                case "Arepa":          System.out.println("precio: 3$"); break;
                case "Hallaca":        System.out.println("precio: 2$"); break;
                case "Maltin Polar":   System.out.println("precio: 5$"); break;
                case "Agua":           System.out.println("precio: 1$"); break;
                case "Mejorar Almohada": System.out.println("precio: 10$"); break;
                default:               System.out.println("Precio no disponible"); break;
            }
            posicionTienda++;
        }
    }
    public static int comprobarInt(){
        Scanner sc = new Scanner(System.in);
        int accion=0;
        boolean comprobar=true;
        while (comprobar) {
            try {
                accion = sc.nextInt();
                comprobar=false;
            } catch (InputMismatchException e){
                System.out.println("Error, los datos no son numericos, vuelve a intentarlo");
                sc.next();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return accion;
    }
    public static int dinerorestante(int dinero, int comprar){
        switch (comprar) {
            case 1:
                dinero-=3;
                break;
            case 2:
                dinero-=2;
                break;
            case 3:
                dinero-=5;
                break;
            case 4:
                dinero-=1;
                break;
            case 5:
                dinero-=10;
                break;
        }

        return dinero;
    }
    static void print(String[]tienda, int comprar, int dinero){
        switch (tienda[comprar].toLowerCase()){
            case "arepa":           System.out.println("Compraste una arepa"); break;
            case "hallaca":          System.out.println("Compraste una hallaca"); break;
            case "maltin polar":    System.out.println("Compraste un maltin polar"); break;
            case "agua":            System.out.println("Compraste un agua"); break;
            case "mejorar almohada":  System.out.println("Compraste una mejor almohada"); break;
            default:               System.out.println("Precio no disponible"); break;
        }
    }
    static void printinventario(String[] inventario){
        System.out.println("INVENTARIO");
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                continue;
            } else {
                System.out.println(i + ") " + inventario[i]);
            }
        }
        System.out.println("¿Deseas utilizar algun artículo?");
    }
    static void modificarstats(int respuesta, int hambre, int sed, String[]inventario, int almohada) {
        if (inventario[respuesta].equalsIgnoreCase("Arepa")) {
            hambre += 35;
            System.out.println("Has comido una " + inventario[respuesta]);
            System.out.println("Hambre actual: " + hambre);
            inventario[respuesta] = null;
        } else if (inventario[respuesta].equalsIgnoreCase("Hallaca")) {
            hambre += 25;
            System.out.println("Has comida una " + inventario[respuesta]);
            System.out.println("Hambre actual: " + hambre);
            inventario[respuesta] = null;
        } else if (inventario[respuesta].equalsIgnoreCase("Maltin Polar")) {
            sed += 40;
            System.out.println("Has tomado un " + inventario[respuesta]);
            System.out.println("Sed actual: " + sed);
            inventario[respuesta] = null;
        } else if (inventario[respuesta].equalsIgnoreCase("Agua")) {
            sed += 35;
            System.out.println("Has tomado una " + inventario[respuesta]);
            System.out.println("Sed actual: " + sed);
            inventario[respuesta] = null;
        } else if (inventario[respuesta].equalsIgnoreCase("Mejorar Almohada")) {
            almohada+= 1;
            System.out.println("Has mejorado tu almohada");
            System.out.println("Nivel amohada: " + almohada);
            inventario[respuesta] = null;
        }
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String[] articulosdisponibles = {"Vacio", "Arepa", "Hallaca", "Maltin Polar", "Agua", "Mejorar Almohada"};
        String[] tienda = new String[6];
        String[] inventario = new String[6];
        int dinero = 20;
        int hambre = 100;
        int sed = 100;
        int almohada=1;
        int comprar;

        //ESOS SON LOS PARAMETROS QUE NECESITO PARA LLAMAR AL METODO
        boolean main=true;
        while (main){
            boolean seguirtienda=true;
            while (seguirtienda){
                print(articulosdisponibles, tienda);
                System.out.println();
                System.out.println("¿Qué vas a comprar?");
                comprar = comprobarInt();

                //GUARDAR ARTICULOS EN EL INVENTARIO DE MODO QUE SE GUARDE EN UNA POSICIÓN VACIA
                for (int i = 1; i < inventario.length; i++) {
                    if (inventario[i] == null) {
                        inventario[i] = articulosdisponibles[comprar];
                        break;
                    }
                }
                print(tienda, comprar, dinero);
                dinero=dinerorestante(dinero, comprar);
                System.out.println("Dinero restante: " + dinero);
                System.out.println("¿Deseas comprar algo más (SI/NO)?");
                String volveracomprar=sc.next();
                if (volveracomprar.equalsIgnoreCase("NO")) {
                    seguirtienda=false;}
            }

            boolean utilizar = true;
            int respuesta = 0;
            while (utilizar) {
                System.out.println("USAR OBJETOS");
                printinventario(inventario);
                String siono = sc.next();
                if (siono.equalsIgnoreCase("SI")) {
                    System.out.println("selecciona: ");
                    respuesta = sc.nextInt();
                    modificarstats(respuesta, sed, hambre,inventario,almohada);
                } else if (siono.equalsIgnoreCase("NO")) {
                    break;
                }
            }
            main=false;
        }




    }


}

