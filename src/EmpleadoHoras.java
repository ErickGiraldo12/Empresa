public class EmpleadoHoras extends  Empleado {
    private int horasTrabajadas;
    private double valorhoras;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, int edad, double salarioBase, int horasTrabajadas, double valorhoras) {
        super(nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorhoras = valorhoras;

    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorhoras() {
        return valorhoras;
    }

    public void setValorhoras(double valorhoras) {
        this.valorhoras = valorhoras;
    }

    @Override
    public String toString() {
        return super.toString() +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorhoras=" + valorhoras +
                '}';
    }

    public void mostrarinformacion() {

        System.out.println("Nombre" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Salario base" + salarioBase);
        System.out.println("Total de horas trabajadas" + horasTrabajadas);
        System.out.println("Valor de horas" + valorhoras);


    }
    public double calcularSalario() {
        return horasTrabajadas * valorhoras;
    }
}