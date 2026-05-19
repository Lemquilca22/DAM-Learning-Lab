package IMC;

public class main {
    static void main(String[] args) {

        String alergiasList[] = {"Pescado", "Polvo", "Paracetamol"};
        String medicacion[]= {"Ibuprofeno","Amoxicilina"};
        String enfermedades[]= {"Diabetes","Parkinson"};
        String operaciones[]= {"Extracción de apendice","Operación de rodilla"};
        Paciente p1 = new Paciente(
                "carlos",
                "ruiz",
                "21/02/2004",
                "394416644w",
                1.73,62, alergiasList, medicacion, enfermedades, operaciones);
        p1.imcpaciente();
    }
}
