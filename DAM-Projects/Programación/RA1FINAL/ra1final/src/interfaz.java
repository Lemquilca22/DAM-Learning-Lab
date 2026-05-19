import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class interfaz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        String rpta;
        while (salir) {
            System.out.println("Este es la interfaz de herramientas multiples de DAM");
            System.out.println("Cual quieres usar ahora?");
            System.out.println("Estas son las opciones: ");
            System.out.println("1) Calculadora\n2) Conversor de temperatura\n3) Clasificador de numeros\n4) Calculador de edad\n5) Calcular edad\n6) Simulador de dados" +
                    "\n7) Generador de números aleatorios\n8) Contador de palabras y caracteres");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1: //CALCULADORA CARLOS
                    double num1, num2, resultado;
                    char operacion;

                    System.out.print("Ingresa el primner digito: ");
                    num1 = sc.nextDouble();//Primera cifra de la operación

                    System.out.print("Ingresa el segundo digito: ");
                    num2 = sc.nextDouble();//Segunda cifra de la operación

                    System.out.print("Elige una operación (+, -, *, /): ");
                    operacion = sc.next().charAt(0);//Que operación hara

                    switch (operacion) {
                        case '+':
                            resultado = num1 + num2;
                            System.out.println(resultado);
                            break;
                        case '-':
                            resultado = num1 - num2;
                            System.out.println("Resultado: " + resultado);
                            break;
                        case '*':
                            resultado = num1 * num2;
                            System.out.println(resultado);
                            break;
                        case '/':
                            if (num2 != 0) {
                                resultado = num1 / num2;
                                System.out.println(resultado);
                            } else {
                                System.out.println("Error: No se puede dividir entre cero.");
                            }
                            break;
                        default:
                            System.out.println("Operación no válida.");
                    }
                    break;

                case 2: //CONVERSOR CARLOS
                    Scanner grados = new Scanner(System.in);
                    double gradosC, gradosF;

                    System.out.print("Ingresa los grados Celsius: ");
                    gradosC = grados.nextDouble();
                    gradosF = (gradosC * 9 / 5) + 32;
                    System.out.println(gradosC + " En grados Celsius son " + gradosF + " grados Fahrenheit.");
                    //de celsius a fahrenheit
                    System.out.print("Ingresa los grados Fahrenheit: ");
                    gradosF = grados.nextDouble();
                    gradosC = (gradosF - 32) * 5 / 9;
                    System.out.println(gradosF + " En  grados Fahrenheit son " + gradosC + " grados Celsius.");
                    break;
                //de fahrenheit a celsius

                case 3: //CLASIFICADOR CARLOS
                    System.out.print("Introduce un número entero: ");
                    int num = sc.nextInt();
                    //Introduce el nuemro a classificar
                    if (num > 0)
                        System.out.println(num + " es positivo.");
                    else if (num < 0)
                        System.out.println(num + " es negativo.");
                    else
                        System.out.println("El número es cero.");
                    //Comprobación de valores psotivos o negattivos o zero
                    if (num % 2 == 0)
                        System.out.println(num + " es par.");
                    else
                        System.out.println(num + " es impar.");
                    //Comprobación de pares
                    boolean primo = true;
                    if (num < 2) primo = false;
                    else {
                        for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {
                                primo = false;
                                break;
                            }
                        }
                    }
                    if (primo)
                        System.out.println(num + " es primo.");
                    else
                        System.out.println(num + " no es primo.");
                    //Classifica el numero como primo o no
                    break;

                case 4: //SALUDO PERSONALIZADO HUGOAT
                    String nombre = sc.nextLine(); //Lee el nombre introducido por el usuario
                    System.out.println("¡Hola " + nombre + " !");
                    break;

                case 5: //CALCULAR EDAD CARLOS
                    System.out.print("Ingrese su año de nacimiento: ");
                    int anioNacimiento = sc.nextInt();

                    int anioActual = LocalDate.now().getYear();
                    int edad = anioActual - anioNacimiento;

                    System.out.println("Tienes " + edad + " años.");

                    break;

                case 6: //SIMULADOR DE DADOS LEM
                    Random generador = new Random(); //Importe la libreria de random porque permite generar
                    //numeros aleatorios y eso es lo que un dado hace.
                    System.out.println("Bienvenido al smiluador de dados");
                    System.out.println("Puedes usar 1 a 6 dados para jugar");
                    System.out.println("Con cuantos dados quieres jugar?");
                    int dados = sc.nextInt();
                    int resultado1, resultado2, resultado3, resultado4, resultado5, resultado6;
                    int total;

                    switch (dados) { //El switch nos ayudará a ejecutar de acuerdo con una condición (si tenemos 1, 2, 3, 4 o 5 dados, etc).
                        case 1:
                            resultado1 = generador.nextInt(6) + 1;//el generador nos lanzará un número del 1 al 6
                            total = resultado1;
                            System.out.println("Al tirar un solo dado obtuviste: "+total);// imprime el numero generado.
                            break;
                        case 2:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2; //cada numero generado se guarda en una varible diferente.
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                            //Los comentarios para los siguientes case son los mismos; lo unico que cambia es la cantidad de print y resultados obtenidos.
                        case 3:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado3);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                        case 4:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            resultado4 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3+resultado4;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado2);
                            System.out.println("El resultado del dado 4 es: "+resultado2);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;

                        case 5:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            resultado4 = generador.nextInt(6) + 1;
                            resultado5 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3+resultado4+resultado5;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado3);
                            System.out.println("El resultado del dado 4 es: "+resultado4);
                            System.out.println("El resultado del dado 5 es: "+resultado5);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                        case 6:
                            resultado1 = generador.nextInt(6) + 1;
                            resultado2 = generador.nextInt(6) + 1;
                            resultado3 = generador.nextInt(6) + 1;
                            resultado4 = generador.nextInt(6) + 1;
                            resultado5 = generador.nextInt(6) + 1;
                            resultado6 = generador.nextInt(6) + 1;
                            total = resultado1+resultado2+resultado3+resultado4+resultado5+resultado6;
                            System.out.println("El resultado del dado 1 es: "+resultado1);
                            System.out.println("El resultado del dado 2 es: "+resultado2);
                            System.out.println("El resultado del dado 3 es: "+resultado3);
                            System.out.println("El resultado del dado 4 es: "+resultado4);
                            System.out.println("El resultado del dado 5 es: "+resultado5);
                            System.out.println("El resultado del dado 6 es: "+resultado6);
                            System.out.println("La suma total de los resultados obtenidos de los dados es: "+total);

                            break;
                    }
                    System.out.println("Gracias por jugar!!");
                    break;

                case 7: //NUMEROS ALEATORIOS LEM
                    Random generador2 = new Random();
                    System.out.println("Bienvenido al generador de Números aleatorios");
                    System.out.println("Para poder jugar, debes escoger un rango, \na continuación ingresa el valor minimo y maximo que puede tomar el número ");
                    System.out.println("Ingresa el valor mínimo del numero:");
                    int min = sc.nextInt();
                    System.out.println("Ingresa el valor máximo del numero:");
                    int max = sc.nextInt();

                    int numaleatorio = generador2.nextInt(max-min+1) + min;
                    //la razon por la cual sumo "min" a esta parte del codigo es, para que
                    //me genere numeros a partir del valor minimo; de otro modo, por ejemplo
                    //si mi numero min fuera 25 y el maximo 75, (sin la suma del min), los valores
                    //aleatorios serian del 0-50 y no del 25-75.
                    System.out.println("Su número es: "+numaleatorio);
                    break;


                case 8: //CONTAR LETRAS HUGOAT
                    sc.nextLine();
                    System.out.println("Ingresa una oración");
                    String texto = sc.nextLine(); //Lee una palabra introducida por el usuario
                    String[] palabras = texto.split(" "); //Salta los espacios para no contarlos como palabra
                    int numeroDePalabras = palabras.length; //Cuenta las palabras que hay

                    if (numeroDePalabras == 1) {
                        System.out.println("La oración tiene " + numeroDePalabras + " palabra."); //Si solo hay una palabra imprime esto
                    } else {
                        System.out.println("La oración tiene " + numeroDePalabras + " palabras."); //Si hay mas de una palabra imprime esto
                    }
                    break;
            }
            System.out.println("Deseas usar otra herramienta? (si/no)");
            rpta =sc.next();
            if (rpta.equalsIgnoreCase("no")) {
                salir = false;
                System.out.println("Gracias por participar");
            }
        }

    }
}
