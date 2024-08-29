package co.uniquindio.programacion2;
import java.util.ArrayList;
import java.util.List;

class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> empleados;

    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = new ArrayList<>();
    }
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
}