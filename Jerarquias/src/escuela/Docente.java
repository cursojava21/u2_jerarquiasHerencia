package escuela;

public class Docente extends Empleado {
    private String departamento;
    private String programaEducativo;
    private String asignaturas[];

    public Docente(){}

    public Docente(String departamento, String programaEducativo, String[] asignaturas) {
        this.departamento = departamento;
        this.programaEducativo = programaEducativo;
        this.asignaturas = asignaturas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    // Método para imprimir las asignaturas

    public String toString(){
        return "\nDocente" + super.toString() + "\nNo. asignaturas: " +  this.asignaturas.length;  //getAsignaturas().length;
    }
}
