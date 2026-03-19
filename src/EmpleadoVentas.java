public class EmpleadoVentas extends Empleado {
    private double totalVentas;
    private double comision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(String nombre, int edad, double salarioBase, double totalVentas, double comision) {
        super(nombre, edad, salarioBase);
        this.totalVentas = totalVentas;
        this.comision = comision;

    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() +
                "totalVentas=" + totalVentas +
                ", comision=" + comision +
                '}';
    }

    public void mostrarinformacion() {

        System.out.println("Nombre" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Salario base" + salarioBase);
        System.out.println("Total ventas" + totalVentas);
        System.out.println("Comison" + comision);


    }
    public double calcularSalario() {
        double comisionCalculada = totalVentas * (comision / 100);
        return salarioBase + comisionCalculada;
    }
}