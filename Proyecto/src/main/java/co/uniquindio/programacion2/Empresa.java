package co.uniquindio.programacion2;
import java.util.ArrayList;
import java.util.List;

class Empresa {
    private List<Departamento> departamentos;
    private List<Proyecto> proyectos;
    private List<Empleado> empleados;
    public Empresa() {
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
    public void addProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public void mostrarDepartamentos() {
        for (Departamento departamento : departamentos) {
            System.out.println("Departamento: " + departamento.getNombre() + " Código: " + departamento.getCodigo());
            for (Empleado empleado : departamento.getEmpleados()) {
                System.out.println("Empleado: " + empleado.getNombre() + " ID: " + empleado.getId());
            }
            System.out.println();
        }
    }
    public void mostrarProyectos() {
        for (Proyecto proyecto : proyectos) {
            System.out.println("Proyecto: " + proyecto.getNombre() + " Código: " + proyecto.getCodigo());
            for (Empleado empleado : proyecto.getEmpleadosAsignados()) {
                System.out.println("Empleado: " + empleado.getNombre() + " ID: " + empleado.getId());
            }
            System.out.println();
        }
    }
    public void mostrarContribuciones() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof IContribuyente) {
                System.out.println(((IContribuyente) empleado).contribuir());
            }
        }
    }
}
