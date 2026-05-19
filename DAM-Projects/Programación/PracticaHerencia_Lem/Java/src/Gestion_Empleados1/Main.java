package Gestion_Empleados1;

public class Main {
    static void main(String[] args) {
        Gerente g1=new Gerente("lem","quilca",1500,"Direccion general",150,25);
        Programador p1=new Programador("Kinberly","Rodriguez",1250,"Logistica","C++",30);
        Programador p2=new Programador("Kinberly","Rodriguez",1250,"Logistica","C++",30);
        System.out.println(g1);
        System.out.println();
        System.out.println(p1);
    }
}
