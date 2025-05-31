import java.io.IOException;
import menu.Menu;

public class Main {
    public static void main(String[] args){

        Empresa empresa = new Empresa();
        String ruta = "empleados.txt";

        int opcion = 0;
        while(opcion != 4){
             opcion = Menu.preguntarOpcion(new String[]{"Cargar empleados", "Mostrar nominas", "Añadir nuevo empleado", "Salir"});

             switch (opcion) {
                case 1:
                    cargarEmpleado(empresa, ruta);
                    break;
                case 2:
                    mostrarNominas(empresa);
                    break;
                case 3:
                    añadirEmpleado(empresa, ruta);
                    break;
                case 4:
                    System.out.println("Hasta otra!");
                    break;        
             }
        }
    }

    public static void cargarEmpleado(Empresa empresa, String ruta){
        try{
            System.out.println("Lista de empleados: ");
            empresa.leerEmpleadosDeFichero(ruta);
            
        } catch (IOException e) {
            System.err.println("Error al leer el fichero " + e.getMessage());

        }
    }

    public static void mostrarNominas(Empresa empresa){
        System.out.println("Listado de nmominas: ");
        empresa.mostrarNominas();
    }

    public static void añadirEmpleado(Empresa empresa, String ruta) {

        Empleado empleado = null;

        String nombre = Menu.preguntarTexto("Introduce el nombre del empleado: ");
        

        int tipoEmpleado = Menu.preguntarOpcion(new String[]{"Empleado fijo", "Empleado por horas"});

        switch (tipoEmpleado) {
            case 1:
                EmpleadoFijo ef = new EmpleadoFijo();
                double salarioMensual = Menu.preguntarDecimal("Introduce su salario mensual: ");
                ef.setNombre(nombre);
                ef.setSalarioMensual(salarioMensual);

                empleado = ef;
                break;
            case 2:
                EmpleadoPorHora eh = new EmpleadoPorHora();
                double horasTrabajadas = Menu.preguntarDecimal("Introduce las horas trabajadas: ");
                double pagoPorHora = Menu.preguntarDecimal("Introduce el salario por horas: ");
                
                eh.setNombre(nombre);
                eh.setHorasTrabajadas(horasTrabajadas);
                eh.setPagoPorHora(pagoPorHora);

                empleado = eh;
                break;
        }

        empresa.agregarEmpleado(empleado);
        try{
        empresa.guardarEmpleadosEnFichero(ruta);
        System.out.println("datos guardados correctamente");
        }catch (IOException e) {
            System.err.println("El archivo no se pudo guardar correctamente " + e.getMessage());
        }
    }
    
}
