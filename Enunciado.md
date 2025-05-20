Claro, aquí tienes el **examen de programación en Java** **sin la parte teórica**, enfocado únicamente en la **parte práctica**, incluyendo **herencia, polimorfismo, interfaces, colecciones** y **streams de ficheros de texto**:

---

## 🧪 Examen de Programación en Java

**Duración sugerida:** 2 horas
**Puntaje total:** 100 puntos

---

### **Parte Única: Programación (100 puntos)**

#### **Contexto:**

Una empresa desea llevar un registro de empleados. Existen dos tipos de empleados: **fijos** y **por hora**. Todos tienen un nombre y un salario calculado de forma diferente. Se requiere almacenar esta información en una colección y manipularla con entrada/salida de ficheros de texto.

---

### **1. Diseño de Clases e Interfaces (25 puntos)**

1. Crea una **interfaz `Pagable`** con el método:

```java
double calcularSalario();
```

2. Crea una **clase abstracta `Empleado`** que implemente `Pagable` y contenga:

   * Atributo `String nombre`
   * Constructor
   * Método `getNombre()`
   * Método `toString()` que devuelva `"Empleado: [nombre]"`

3. Crea dos subclases:

   * `EmpleadoFijo`: con atributo adicional `double salarioMensual`.
   * `EmpleadoPorHora`: con `double horasTrabajadas` y `double pagoPorHora`.

Cada clase debe sobrescribir `calcularSalario()`.

---

### **2. Uso de Colecciones y Polimorfismo (25 puntos)**

1. Crea una clase `Empresa` que contenga:

   * Una lista de empleados (`List<Empleado>`)
   * Un método `agregarEmpleado(Empleado e)`
   * Un método `mostrarNominas()` que imprima el nombre y salario de cada empleado usando polimorfismo

---

### **3. Lectura y Escritura de Ficheros de Texto (25 puntos)**

1. En la clase `Empresa`, implementa:

   * `void leerEmpleadosDeFichero(String ruta)`:
     Lee líneas con el siguiente formato:

     ```
     Fijo,Juan Perez,3000.0
     Hora,Laura Díaz,160.0,15.5
     ```

   * `void guardarEmpleadosEnFichero(String ruta)`:
     Guarda los empleados en el mismo formato.

Usa `java.nio.file.Files` y `Streams`.

---

### **4. Clase Principal (Main) (25 puntos)**

1. Crea una clase `Main` que:

   * Cargue los empleados desde `empleados.txt`
   * Muestre las nóminas
   * Añada un nuevo empleado por hora (puedes usar datos fijos o pedirlos por consola)
   * Guarde de nuevo los datos en el fichero

---

### 📁 Entrega

Entrega un archivo `.zip` que contenga:

* Código fuente organizado en paquetes
* Archivo de ejemplo `empleados.txt`
* Captura de pantalla con la ejecución del programa

---

¿Te gustaría que también te prepare el archivo base del proyecto o una solución ejemplo para este examen?
