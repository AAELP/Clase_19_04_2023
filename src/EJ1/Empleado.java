package EJ1;

public class Empleado {
    private String nombre;
    private String apellido;
    private Double salarioMensual;

    //GET y SET


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;

        if (salarioMensual<0){
            salarioMensual = 0.0;
            this.salarioMensual=salarioMensual;
        }else {
            this.salarioMensual=salarioMensual;
        }
    }
    //METODOS


}