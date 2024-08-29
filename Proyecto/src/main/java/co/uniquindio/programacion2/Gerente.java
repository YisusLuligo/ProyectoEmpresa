package co.uniquindio.programacion2;
import java.util.ArrayList;
import java.util.List;

class Gerente extends Empleado implements IContribuyente, AsignarEmpleado {
    private List<Proyecto> proyectos;
    public Gerente(String nombre, String id, String departamento) {
        super(nombre, id, departamento);
        this.proyectos = new ArrayList<>();
    }
    public void asignarEmpleadoAProyecto(Empleado empleado, Proyecto proyecto) {
        proyecto.addEmpleado(empleado);
    }
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }
    public List<Proyecto> getProyectos() {
        return proyectos;
    }
    public String contribuir() {
        return "El gerente " + getNombre() + " está gestionando los proyectos: " +
                proyectos.stream().map(Proyecto::getNombre).toList();
    }
}

