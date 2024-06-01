

public class App {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", "123", 450000.0);
        empleados[1] = new EmpleadoMedioTiempo("Jose", "3432", 430, 34);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());
        }
    }
}
