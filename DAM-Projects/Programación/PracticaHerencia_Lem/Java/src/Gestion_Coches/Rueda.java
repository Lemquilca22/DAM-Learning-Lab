package Gestion_Coches;

public class Rueda{
    private double desgaste;
    private String estado;

    public Rueda(double desgaste, String estado) {
        this.desgaste = desgaste;
        this.estado = estado;
    }

    public double getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(double desgaste) {
        this.desgaste = desgaste;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "desgaste=" + desgaste +
                ", estado='" + estado + '\'' +
                '}';
    }
}
