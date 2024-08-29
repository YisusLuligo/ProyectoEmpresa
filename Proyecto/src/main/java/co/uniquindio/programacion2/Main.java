package co.uniquindio.programacion2;
import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        inicializarDatos(empresa);
        iniciarMenu(empresa,scanner);
    }
    public static void iniciarMenu(Empresa empresa,Scanner scanner){
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar departamentos");
            System.out.println("2. Mostrar proyectos");
            System.out.println("3. Mostrar contribuciones");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    empresa.mostrarDepartamentos();
                    break;
                case 2:
                    empresa.mostrarProyectos();
                    break;
                case 3:
                    empresa.mostrarContribuciones();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
    public static void inicializarDatos(Empresa empresa) {
        // Crear departamentos
        Departamento departamento1 = new Departamento("Administrativo", "2020");
        Departamento departamento2 = new Departamento("Recursos Humanos", "2022");
        Departamento departamento3 = new Departamento("Marketing", "2025");
        Departamento departamento4 = new Departamento("General", "6060");
        empresa.addDepartamento(departamento1);
        empresa.addDepartamento(departamento2);
        empresa.addDepartamento(departamento3);
        empresa.addDepartamento(departamento4);
        // Crear empleados
        Gerente gerente = new Gerente("Luis", "1010", "Administrativo");
        Tecnico tecnico1 = new Tecnico("Fernando", "1011", "General", "Electricista");
        Tecnico tecnico2 = new Tecnico("Luisa", "5105", "General", "Mantenimiento");
        Tecnico tecnico3 = new Tecnico("Alexis", "6025", "Administrativo", "Desarrollador");
        Tecnico tecnico4 = new Tecnico("Valeria", "6868", "Recursos Humanos", "Archivo");
        empresa.addEmpleado(gerente);
        empresa.addEmpleado(tecnico1);
        empresa.addEmpleado(tecnico2);
        empresa.addEmpleado(tecnico3);
        empresa.addEmpleado(tecnico4);
        departamento1.getEmpleados().add(gerente);
        departamento2.getEmpleados().add(tecnico1);
        departamento3.getEmpleados().add(tecnico2);
        departamento4.getEmpleados().add(tecnico3);

        // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Colegio", "3030");
        Proyecto proyecto2 = new Proyecto("Supermercado", "9090");
        Proyecto proyecto3 = new Proyecto("Coliseo", "8080");
        empresa.addProyecto(proyecto1);
        empresa.addProyecto(proyecto2);
        empresa.addProyecto(proyecto3);
        // Asignar empleados a proyectos a través del gerente
        gerente.asignarEmpleadoAProyecto(tecnico1, proyecto1);
        gerente.asignarEmpleadoAProyecto(tecnico2, proyecto2);
        gerente.asignarEmpleadoAProyecto(tecnico3, proyecto3);
        gerente.agregarProyecto(proyecto1);
        gerente.agregarProyecto(proyecto2);
        gerente.agregarProyecto(proyecto3);
    }
}