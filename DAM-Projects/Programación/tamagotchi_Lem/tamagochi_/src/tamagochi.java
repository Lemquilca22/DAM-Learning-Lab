import java.util.Random;
import java.util.Scanner;

public class tamagochi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        boolean padre = true; //El boolean principal
        boolean empezar = true; // El boolean para iniciar el juego
        int energia = 5, hambre = 5, felicidad = 5, dinero = 5;
        String respEmpezar, nomTamagotchi = "";
        int aspectoTamagotchi;
        String aspectoTamagotchiP = "";
        boolean aspecto = true; //Boolean para reiniciar aspecto.
        int respAspecto;
        int queHacer;
        boolean queHará = true; //Boolean más complejo (que modifica y acumula datos)
        //Comida disponible:
//        int milkshake = 1;
//        int bocadillo = 1;
//        int fruta = 1;
        int comida = 3;
        String respTienda;
        int quevamoaJuga;
        String volveraJugar;

        while (padre) {
            while (empezar) {
                System.out.println("Bienvenido a Tamagotchi");
//                System.out.println("¿Quieres empezar a jugar? (SI/NO)");
//                respEmpezar = sc.next();
//
//                if (respEmpezar.equalsIgnoreCase("NO")) {
//                    empezar = false;
//                    System.out.println("Que lastima, nos vemos pronto");
//                    break;
//                }
                while (aspecto) {

                    System.out.println("Introduce el nombre de tu tamagotchi: ");

                    nomTamagotchi = sc.nextLine();
                    System.out.println("Muy bien, ahora escoge la apariencia que quieres que tenga " + nomTamagotchi);
                    System.out.println("Aquí hay un menú de aspectos:");
                    System.out.println("1) 🐷\n2) 🐶\n3) 🐱\n4) 🐺\n5) 🐰\n6) 🐯\n7) 🦊\n8) 🐼\n9) 🐸\n10) 🐨");
                    aspectoTamagotchi = sc.nextInt();
                    switch (aspectoTamagotchi) {
                        case 1:
                            aspectoTamagotchiP = "🐷";
                            break;
                        case 2:
                            aspectoTamagotchiP = "🐶";
                            break;
                        case 3:
                            aspectoTamagotchiP = "🐱";
                            break;
                        case 4:
                            aspectoTamagotchiP = "🐺";
                            break;
                        case 5:
                            aspectoTamagotchiP = "🐰";
                            break;
                        case 6:
                            aspectoTamagotchiP = "🐯";
                            break;
                        case 7:
                            aspectoTamagotchiP = "🦊";
                            break;
                        case 8:
                            aspectoTamagotchiP = "🐼";
                            break;
                        case 9:
                            aspectoTamagotchiP = "🐸";
                            break;
                        case 10:
                            aspectoTamagotchiP = "🐨";
                            break;


                    }
                    System.out.println("Entonces su tamatogchi se llama: " + nomTamagotchi);
                    System.out.println("Y se ve asi: " + aspectoTamagotchiP);

                    System.out.println("¿Quieres seguir o quieres modificar algo antes de empezar?");
                    System.out.println("1)Quiero seguir\n2)Quiero modificar algo antes de empezar");
                    respAspecto = sc.nextInt();

                    if (respAspecto == 2) {
                        aspecto = true;
                        System.out.println("Okay volvamos a empezar");
                        sc.nextLine();

                    }
                    if (respAspecto == 1) {
                        break;
                    }

                }
                System.out.println(aspectoTamagotchiP + " " + nomTamagotchi);
                System.out.println("Energia: " + energia + " | " + "Hambre: " + hambre + " | " + "Felicidad: " + felicidad + " | " + "Dinero: " + dinero + " 💵 ");
                System.out.println("------------------------------------");

                while (queHará) {
                    System.out.println("¿Que quieres hacer?");
                    System.out.println("1. Dar de comer\n2. Jugar\n3. Dormir\n4. Tienda\n5. Ver estado\n6. Salir");
                    queHacer = sc.nextInt();

                    switch (queHacer) {
                        case 1: //alimentar
                            if(hambre<10){
                            if (comida == 0) {
                                System.out.println("No tienes comida Compra en la tienda");
                            } else {
                                hambre += 3;
                                energia -= 1;
                                comida -= 1;
                                System.out.println("Has alimentado a " + nomTamagotchi);
                                System.out.println("Comida restante: " + comida);
                            }
                        }
                            if (hambre>=10){
                                hambre=10;
                            }

                            break;
                        case 2:
                            if (energia<10){
                            System.out.println("¿Que vamos a jugar?");
                            System.out.println("1) Piedra, papel o tijera.\n2) Dados.");
                            quevamoaJuga=sc.nextInt();

                            System.out.println("Que comience el juego!!");
                            if (quevamoaJuga==1){
                                System.out.println("--- ¡Piedra, Papel o Tijera! ---");
                                System.out.println("Elige tu movimiento:");
                                System.out.println("1 - Piedra");
                                System.out.println("2 - Papel");
                                System.out.println("3 - Tijera");

                                System.out.print("Introduce el número de tu elección: ");
                                int eleccionUsuario = sc.nextInt();

                                int eleccionTamagotchi = generador.nextInt(3) + 1;

                                String movimientoUsuario = "";
                                String movimientoTamagotchi = "";

                                if (eleccionUsuario == 1) {
                                    movimientoUsuario = "Piedra";
                                } else if (eleccionUsuario == 2) {
                                    movimientoUsuario = "Papel";
                                } else if (eleccionUsuario == 3) {
                                    movimientoUsuario = "Tijera";
                                }

                                if (eleccionTamagotchi == 1) {
                                    movimientoTamagotchi = "Piedra";
                                } else if (eleccionTamagotchi == 2) {
                                    movimientoTamagotchi = "Papel";
                                } else if (eleccionTamagotchi == 3) {
                                    movimientoTamagotchi = "Tijera";
                                }

                                if (eleccionUsuario < 1 || eleccionUsuario > 3) {

                                    System.out.println("\nError: Elección no válida. Debes ingresar 1, 2 o 3.");

                                } else {

                                    System.out.println("\nTu elección: " + movimientoUsuario);
                                    System.out.println(nomTamagotchi+" eligió: " + movimientoTamagotchi);
                                    System.out.println("--------------------------------");


                                    if (eleccionUsuario == eleccionTamagotchi) {
                                        System.out.println("¡Es un empate!");

                                    } else if (eleccionUsuario == 1) {
                                        if (eleccionTamagotchi == 3) {
                                            System.out.println("¡Ganaste! Piedra rompe Tijera.");
                                            felicidad+=2;
                                            dinero+=3;
                                            energia-=1;
                                            hambre-=2;

                                        } else {
                                            System.out.println("¡Perdiste! Papel envuelve Piedra.");
                                            energia-=1;
                                            hambre-=2;
                                        }

                                    } else if (eleccionUsuario == 2) {
                                        if (eleccionTamagotchi == 1) {
                                            System.out.println("¡Ganaste! Papel envuelve Piedra.");
                                            felicidad+=2;
                                            dinero+=3;
                                            energia-=1;
                                            hambre-=2;
                                        } else {
                                            System.out.println("¡Perdiste! Tijera corta Papel.");
                                            energia-=1;
                                            hambre-=2;
                                        }

                                    } else if (eleccionUsuario == 3) {
                                        if (eleccionTamagotchi == 2) {
                                            System.out.println("¡Ganaste! Tijera corta Papel.");
                                            felicidad+=2;
                                            dinero+=3;
                                            energia-=1;
                                            hambre-=2;
                                        } else {
                                            System.out.println("¡Perdiste! Piedra rompe Tijera.");
                                            energia-=1;
                                            hambre-=2;
                                        }
                                    }
                                }

                            } else {
                                System.out.println("Que comience el juego!!");
                                int dadoJugador = generador.nextInt(6) + 1;
                                int dadoTamagotchi = generador.nextInt(6) + 1;

                                if (dadoJugador==dadoTamagotchi){
                                    System.out.println("Tu resultado: " + dadoJugador);
                                    System.out.println("Resultado de " + nomTamagotchi + ": "+dadoTamagotchi);
                                    System.out.println("Empate");
                                    energia-=1;
                                    hambre-=2;

                                }else if (dadoJugador > dadoTamagotchi) {
                                    System.out.println("Tu resultado: " + dadoJugador);
                                    System.out.println("Resultado de " + nomTamagotchi + ": "+dadoTamagotchi);
                                    System.out.println("Eres el ganador!!");
                                    felicidad += 2;
                                    dinero += 3;
                                    energia -= 1;
                                    hambre -= 2;

                                } else {
                                    System.out.println("Tu resultado: " + dadoJugador);
                                    System.out.println("Resultado de " + nomTamagotchi + ": "+dadoTamagotchi);
                                    System.out.println("Mejor suerte la proxima!!");
                                    energia -= 1;
                                    hambre -= 2;
                                }
                            }



                            }
                            if (energia>=10){
                                energia=10;}

                            break;
                        case 3:
                            if (energia<10) {
                                energia+=4;
                                felicidad-=1;
                            }
                            if (energia>=10){
                                energia=10;
                            }
//                            else {
//                                System.out.println("¿Dormir más?, mejor vamo a juga");
//                            }
                            break;
                        case 4:
                            System.out.println("Bienvenido a la tienda:");
                            System.out.println("¿Deseas comprar comida (SI/NO)?");
                            respTienda=sc.next();

                            if (respTienda.equalsIgnoreCase("SI")){
                                comida+=1;
                                dinero-=1;
                            } else {
                                System.out.println("Vuelve pronto");
                            }
                            break;
                        case 5:
                            System.out.println(aspectoTamagotchiP + " " + nomTamagotchi);
                            System.out.println("Energia: " + energia + " | " + "Hambre: " + hambre + " | " + "Felicidad: " + felicidad + " | " + "Dinero: " + dinero + " 💵 ");
                            if (felicidad>7 && hambre>4 && energia>5) {
                                System.out.println(nomTamagotchi+"Está feliz y activo");
                            } else if (hambre<=3) {
                                System.out.println(nomTamagotchi+"Tiene hambre, deberías darle de comer");
                            } else if (energia<=3) {
                                System.out.println("Está muy cansado, necesita dormir.");
                            } else if (felicidad<=3){
                                System.out.println(nomTamagotchi+"Está triste, juega con él.");
                            } else if (energia>7 && hambre<5) {
                                System.out.println(nomTamagotchi+"Está hiperactivo");
                            } else if (energia<=3 && felicidad<=3 && hambre<=3){
                                System.out.println(nomTamagotchi+"Está en las últimas");
                            }
                            break;
                        case 6:
                            queHará = false;
                            padre = false;
                            break;


                    }
                    if (hambre<=0 | energia<=0 | felicidad<=0) {
                        System.out.println(nomTamagotchi+" ha muerto");
                        System.out.println("GAME OVER");
                        queHará=false;

                    }

                }
                System.out.println("¿Deseas crear una nueva mascota? (SI/NO)");
                volveraJugar=sc.next();
                if (volveraJugar.equalsIgnoreCase("SI")){
                padre=true;
                }
                if (volveraJugar.equalsIgnoreCase("NO")){
                    padre=false;
                    break;
                }

            }
        }

    }
}
