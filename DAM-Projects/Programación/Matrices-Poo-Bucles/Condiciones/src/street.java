import java.util.Scanner;

public class street {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String estadoactual = sc.next();
        String eventoocurrido = sc.next();

        if (estadoactual.equalsIgnoreCase("IDLE")){
            if (eventoocurrido.equalsIgnoreCase("JOYSTICK_UP")){
                System.out.println("JUMPING");
            }
            if (eventoocurrido.equalsIgnoreCase("JOYSTICK_LEFT/RIGHT")){
                System.out.println("WALKING");
            }
            if (eventoocurrido.equalsIgnoreCase("JOYSTICK_CENTER")){
                System.out.println("IDLE");
            }
            if (eventoocurrido.equalsIgnoreCase("PUNCH_KEY")){
                System.out.println("PUNCHING");
            }
            if (eventoocurrido.equalsIgnoreCase("KICK_KEY")){
                System.out.println("KICKING");
            }
        }

        if (estadoactual.equalsIgnoreCase("WALKING")){
            if (eventoocurrido.equalsIgnoreCase("PUNCH_KEY")){
                System.out.println("PUNCHING");
            }
            if (eventoocurrido.equalsIgnoreCase("KICK_KEY")){
                System.out.println("KICKING");
            }
            if (eventoocurrido.equalsIgnoreCase("JOYSTICK_UP")){
                System.out.println("KICKING");
            }
            if (eventoocurrido.equalsIgnoreCase("JOYSTICK_CENTER")){
                System.out.println("IDLE");
            }



        }
        if (estadoactual.equalsIgnoreCase("JUMPING")){
            if (eventoocurrido.equalsIgnoreCase("PUNCH_KEY")){
                System.out.println("PUNCHING");
            }
            if (eventoocurrido.equalsIgnoreCase("KICK_KEY")){
                System.out.println("KICKING");
            }
            if (eventoocurrido.equalsIgnoreCase("TOUCH_FLOOR")){
                System.out.println("IDLE");
            }
            if (eventoocurrido.equalsIgnoreCase("JOYSTICK_UP")){
                System.out.println("JUMPING");
            }

        }
        if (estadoactual.equalsIgnoreCase("KICKING")){

        }
        if (estadoactual.equalsIgnoreCase("PUNCHING")){

        }
    }
}
