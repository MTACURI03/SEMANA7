public class Empleado {
    public String nombre;
    public double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre=nombre;
        this.salarioBase=salarioBase;
    }
    public void calcularsalario(){
        System.out.println("El salario del Empleado" + " "+nombre+" es :"+salarioBase);
    }
}

