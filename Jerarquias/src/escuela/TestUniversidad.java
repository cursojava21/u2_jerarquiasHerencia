package escuela;

public class TestUniversidad {
    public static void main(String[] args) {

        // Crear un objeto Empleado
        Empleado martin = new Empleado();

        martin.setNombre("Martin");
        martin.setApellidos("Gomez Martinez");
        martin.setArea("Finanzas");
        martin.setNumEmpleado(5789);
        martin.setCampus("Cancún");

        System.out.println(martin);

        // Crear un objeto Administrativo
        Administrativo empAdmin = new Administrativo();
        empAdmin.setNombre("Juan");
        empAdmin.setApellidos("Fernandez Campos");
        empAdmin.setCampus("Playa del Carmen");
        empAdmin.setNumEmpleado(5553);
        empAdmin.setArea("Bienestar Estudiantil");

        System.out.println(empAdmin);

        // Crear un objeto Docente
        String[] asignaturas = {"Matematicas", "Algebra"};
        Docente susana = new Docente("Ingenierias","Sistemas de Energia",asignaturas);

        susana.setNumEmpleado(6788);
        susana.setNombre("Susana");
        susana.setApellidos("Gomez Jimenez");
        susana.setArea("Académica");
        susana.setCampus("Chetumal");

        System.out.println(susana);
        // imprimir las asignaturas que imparte

        // Crear un objeto estudiante, imprimir sus datos

        // Crear un objeto egresado, imprimir sus datos + las empresas/trabajos en los cuales ha estado


    }
}
