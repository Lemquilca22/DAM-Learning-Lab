package Gestion_Empleados;

public class Programador extends Empleado{
    private String lenguaje;
    private int horasextra;

    public Programador(){

    }
    public Programador(String nombre, String apellidos, int salariobase, String departamento, String lenguaje, int horasextra) {
        super(nombre, apellidos, salariobase, departamento);
        this.lenguaje = lenguaje;
        this.horasextra = horasextra;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }
}
