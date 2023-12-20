public class Desarrollador extends Empleado{
    public int horas;

    public Desarrollador(String nombre, double salarioBase,int horas) {
        super(nombre, salarioBase);
        this.horas=horas;
    }
    public void calcularsalario(){
        System.out.println("El salario del desarrollador"+" "+nombre+" es :"+salarioBase+" "+"y sus horas extra son  :"+horas);
    }
}
