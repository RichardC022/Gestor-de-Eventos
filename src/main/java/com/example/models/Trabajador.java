import java.util.Date;

public class Trabajador extends Persona {
    private String clave;
    private Date fechaRegistro;

    public Trabajador(int id, String nombre, String apellido, int fechaNacimiento, String correo, String telefono, String clave, Date fechaRegistro) {
        super(id, nombre, apellido, fechaNacimiento, correo, telefono);
        this.clave = clave;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
