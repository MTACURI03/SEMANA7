public class Gerente extends Empleado{
    public double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono=bono;
    }

    public void calcularsalario(){
        System.out.println("El salario del Gerente " + " "+nombre+" es :"+salarioBase+" "+"y su bono correspondiente es :"+bono);
    }
}
