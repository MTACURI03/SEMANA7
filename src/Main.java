// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado emple1=new Empleado("Michael",420.50);
        Gerente gerente1=new Gerente("Mateo",420.50,520.30);
        Desarrollador desa1=new Desarrollador("Paula",450.20,18);
        emple1.calcularsalario();
        gerente1.calcularsalario();
        desa1.calcularsalario();

    }
}