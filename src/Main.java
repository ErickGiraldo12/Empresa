import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<EmpleadoAdministrativo> lstEmplAdmin = new ArrayList<>();
        List<EmpleadoVentas> lstEmplVenta = new ArrayList<>();
        List<EmpleadoHoras> lstEmplHora = new ArrayList<>();
        List<Empleado> lstEmpleados = new ArrayList<>();

        int opcion;

        do {
            System.out.println("===== MENU EMPLEADOS =====");
            System.out.println("1. Registrar empleado administrativo");
            System.out.println("2. Registrar empleado de ventas");
            System.out.println("3. Registrar empleado por horas");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Buscar empleado por nombre");
            System.out.println("6. Calcular salario final de un empleado");
            System.out.println("7. Aumentar salario base de un empleado");
            System.out.println("8. Mostrar empleados mayores de edad");
            System.out.println("9. Mostrar empleados administrativos");
            System.out.println("10. Mostrar empleados de ventas");
            System.out.println("11. Mostrar empleados por horas");
            System.out.println("12. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Edad: ");
                    int edad = teclado.nextInt();
                    System.out.print("Salario base: ");
                    double salario = teclado.nextDouble();
                    System.out.print("Bonificacion: ");
                    double bonificacion = teclado.nextDouble();
                    teclado.nextLine();
                    EmpleadoAdministrativo ea = new EmpleadoAdministrativo(nombre, edad, salario, bonificacion);
                    lstEmplAdmin.add(ea);
                    lstEmpleados.add(ea);
                    System.out.println("Empleado administrativo registrado.");
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.print("Edad: ");
                    edad = teclado.nextInt();
                    System.out.print("Salario base: ");
                    salario = teclado.nextDouble();
                    System.out.print("Total ventas del mes: ");
                    double ventas = teclado.nextDouble();
                    System.out.print("Porcentaje de comision: ");
                    double comision = teclado.nextDouble();
                    teclado.nextLine();
                    EmpleadoVentas ev = new EmpleadoVentas(nombre, edad, salario, ventas, comision);
                    lstEmplVenta.add(ev);
                    lstEmpleados.add(ev);
                    System.out.println("Empleado de ventas registrado.");
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.print("Edad: ");
                    edad = teclado.nextInt();
                    System.out.print("Salario base: ");
                    salario = teclado.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horas = teclado.nextInt();
                    System.out.print("Valor por hora: ");
                    double valorHora = teclado.nextDouble();
                    teclado.nextLine();
                    EmpleadoHoras eh = new EmpleadoHoras(nombre, edad, salario, horas, valorHora);
                    lstEmplHora.add(eh);
                    lstEmpleados.add(eh);
                    System.out.println("Empleado por horas registrado.");
                    break;

                case 4:
                    if (lstEmpleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                        break;
                    }
                    for (Empleado e: lstEmpleados) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.print("Ingresa el nombre a buscar: ");
                    String buscar = teclado.nextLine();
                    boolean encontrado = false;
                    for (Empleado e : lstEmpleados) {
                        if (e.getNombre().equalsIgnoreCase(buscar)) {
                            e.mostrarinformacion();
                            System.out.println("----------");
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Empleado no encontrado.");
                    break;

                case 6:
                    System.out.print("Ingresa el nombre del empleado: ");
                    buscar = teclado.nextLine();
                    encontrado = false;
                    for (Empleado e: lstEmpleados) {
                        if (e.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.println("Salario final: " + e.calcularSalario());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Empleado no encontrado.");
                    break;

                case 7:
                    System.out.print("Ingresa el nombre del empleado: ");
                    buscar = teclado.nextLine();
                    encontrado = false;
                    for (Empleado e: lstEmpleados) {
                        if (e.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.print("Porcentaje de aumento: ");
                            double porcentaje = teclado.nextDouble();
                            teclado.nextLine();
                            e.aumentarSalario(porcentaje);
                            System.out.println("Nuevo salario base: " + e.getSalarioBase());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Empleado no encontrado.");
                    break;

                case 8:
                    System.out.println("Empleados mayores de edad:");
                    boolean hayAlguno = false;
                    for (Empleado e : lstEmpleados) {
                        if (e.verificarMayorEdad()) {
                            System.out.println(" - " + e.getNombre() + " (" + e.getEdad() + " anios)");
                            hayAlguno = true;
                        }
                    }
                    if (!hayAlguno) System.out.println("Ningun empleado es mayor de edad.");
                    break;

                case 9:
                    System.out.println("-- Empleados Administrativos --");
                    boolean hayAdmin = false;
                    for (Empleado e : lstEmpleados) {
                        if (e instanceof EmpleadoAdministrativo) {
                            System.out.println(e);
                            hayAdmin = true;
                        }
                    }
                    if (!hayAdmin) System.out.println("No hay empleados administrativos registrados.");
                    break;

                case 10:
                    System.out.println("-- Empleados de Ventas --");
                    boolean hayVentas = false;
                    for (Empleado e : lstEmpleados) {
                        if (e instanceof EmpleadoVentas) {
                            System.out.println(e);
                            hayVentas = true;
                        }
                    }
                    if (!hayVentas) System.out.println("No hay empleados de ventas registrados.");
                    break;

                case 11:
                    System.out.println("-- Empleados por Horas --");
                    boolean hayHoras = false;
                    for (Empleado e : lstEmpleados) {
                        if (e instanceof EmpleadoHoras) {
                            System.out.println(e);
                            hayHoras = true;
                        }
                    }
                    if (!hayHoras) System.out.println("No hay empleados por horas registrados.");
                    break;

                case 12:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 12);
    }
}