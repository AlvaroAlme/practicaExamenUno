public abstract class Empleado implements Pagable {
    private String nombre;

    public Empleado(){
        super();
    }

    public Empleado(String nombre){
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public abstract double calcularSalario();

    
}
