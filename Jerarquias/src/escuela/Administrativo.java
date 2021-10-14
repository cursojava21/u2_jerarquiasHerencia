package escuela;

public class Administrativo extends Empleado {
    /* Administrativo */
    private Empleado jefe;
    private double bonoPuntualidad;

    public Administrativo() {}

    public String toString(){
        return "\nAdministrativo" + super.toString();
    }

}
