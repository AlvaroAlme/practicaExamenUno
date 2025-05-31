import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private final List<Empleado> empleados;
    private Empleado empleado;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
        } else {
            System.out.println("El empleado ya esta registrado");
        }

    }

    public void mostrarNominas() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + ": " + e.calcularSalario());
        }
    }

    public void leerEmpleadosDeFichero(String ruta) throws FileNotFoundException, IOException {
        try (InputStream inputStream = new FileInputStream(ruta)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String linea = bufferedReader.readLine();
            while (linea != null) {
                String[] partes = linea.split(",");
                if (partes[0].equals("Fijo")) {
                    EmpleadoFijo empleadoFijo = new EmpleadoFijo();
                    empleadoFijo.setNombre(partes[1]);
                    empleadoFijo.setSalarioMensual(Double.valueOf(partes[2]));
                    empleados.add(empleadoFijo);
                } else if (partes[0].equals("Hora")) {
                    EmpleadoPorHora empleadoHora = new EmpleadoPorHora();
                    empleadoHora.setNombre(partes[1]);
                    empleadoHora.setHorasTrabajadas(Double.valueOf(partes[2]));
                    empleadoHora.setPagoPorHora(Double.valueOf(partes[3]));
                    empleados.add(empleadoHora);
                }

                linea = bufferedReader.readLine();
            }
        }

    }

    public void guardarEmpleadosEnFichero(String ruta) throws IOException{
    try (FileWriter fileWriter = new FileWriter(ruta);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){
        
        for (Empleado e : empleados) {
            bufferedWriter.write(e.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

    } 
}
}
