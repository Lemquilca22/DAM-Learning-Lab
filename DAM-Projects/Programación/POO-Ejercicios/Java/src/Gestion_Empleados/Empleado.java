package Gestion_Empleados;

public class Empleado {
    private String nombre;
    private String apellidos;
    private int salariobase;
    private String departamento;

    public Empleado(String nombre, String apellidos, int salariobase, String departamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salariobase = salariobase;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(int salariobase) {
        this.salariobase = salariobase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
