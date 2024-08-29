package co.uniquindio.programacion2;

class Empleado {
    public String nombre;
    public String id;
    public String departamento;
    public Empleado(String nombre, String id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public String getDepartamento() {
        return departamento;
    }
}


