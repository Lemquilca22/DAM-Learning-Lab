package Gestion_Empleados1;

public class Gerente extends Empleado {
    private int bonus;
    private int empleadosAcargo;

    public Gerente(){

    }
    public Gerente(String nombre, String apellidos, int salariobase, String departamento, int bonus, int empleadosAcargo) {
        super(nombre, apellidos, salariobase, departamento);
        this.bonus = bonus;
        this.empleadosAcargo = empleadosAcargo;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getEmpleadosAcargo() {
        return empleadosAcargo;
    }

    public void setEmpleadosAcargo(int empleadosAcargo) {
        this.empleadosAcargo = empleadosAcargo;
    }

    @Override
    public String toString() {
        int suma=bonus+getSalariobase();
        return "Gerente\n" +"Nombre: "+getNombre()+
                "\nSalario base= " + getSalariobase()+
                "\nBonus= "+ bonus+
                "\nSalario final= " + suma+
                "\nEmpleadosAcargo= " + empleadosAcargo;
    }
}
