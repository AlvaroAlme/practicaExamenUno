public class EmpleadoPorHora extends Empleado {

    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHora(){
        super();
    }

    public EmpleadoPorHora(double horasTrabajadas, double pagoPorHora){
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario(){
        double salarioPorHoras = getHorasTrabajadas() * getPagoPorHora();
        return salarioPorHoras;
    }
}
