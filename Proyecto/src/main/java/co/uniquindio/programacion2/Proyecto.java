package co.uniquindio.programacion2;
import java.util.ArrayList;
import java.util.List;

class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
    }
    public void addEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
}

