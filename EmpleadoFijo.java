public class EmpleadoFijo extends Empleado {
    
    private double salarioMensual;

    public EmpleadoFijo(){
        super();
    }

    public EmpleadoFijo(double salarioMensual){
        super();
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario(){
        return getSalarioMensual();
    }

    @Override
    public String toString() {
        return "Fijo, " + getNombre() + "," + getSalarioMensual();
    }

    
}
