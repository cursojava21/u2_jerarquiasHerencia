package escuela;

public class MiembroUniversitario {
    /* Atributos */
    private String nombre;
    private String apellidos;
    private String fecha_nac;
    private String fecha_ingreso;
    private String campus;

    public MiembroUniversitario(){}

    public MiembroUniversitario(String nombre, String apellidos, String fecha_nac, String fecha_ingreso, String campus) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.fecha_ingreso = fecha_ingreso;
        this.campus = campus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
