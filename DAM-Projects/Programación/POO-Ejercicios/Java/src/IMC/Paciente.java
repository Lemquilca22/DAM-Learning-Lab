package IMC;

public class Paciente {
    String nombre;
    String apellidos;
    String fechanacimiento;
    String dni;
    double alturacm;
    double peso;
    String[] alergias;
    String[] medicacionactual;
    String[] enfermedadescronicas ;
    String[] operacionesquirurjicas;

    public Paciente(String nombre, String apellidos, String fechanacimiento, String dni, double alturacm, double peso, String[] alergias, String[] medicacionactual, String[] enfermedadescronicas, String[] operacionesquirurjicas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.dni = dni;
        this.alturacm = alturacm;
        this.peso = peso;
        this.alergias = alergias;
        this.medicacionactual = medicacionactual;
        this.enfermedadescronicas = enfermedadescronicas;
        this.operacionesquirurjicas = operacionesquirurjicas;
    }

    public void imcpaciente(){
        double imc = peso / (alturacm * alturacm);
        System.out.println("El imc del paciente "+nombre+" es: "+imc);
    }
}
