package escuela;

public class Empleado extends MiembroUniversitario{
    private int numEmpleado;
    private String rfc;
    private String area;

    public Empleado(){ }

    public Empleado(int numEmpleado, String rfc, String area) {
        this.numEmpleado = numEmpleado;
        this.rfc = rfc;
        this.area = area;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString(){
        return "\n----- Datos del empleado -----"+ "\nNo. empleado: " + getNumEmpleado() +
                "\nNombre completo: "+ getNombre()+ " " + getApellidos() +
                "\nÁrea:" + getArea();
    }
}
