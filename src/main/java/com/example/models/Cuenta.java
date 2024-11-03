public class Cuenta {
    private int id;
    private String clave;
    private Persona persona; // Relación para una persona

    public Cuenta(int id, String clave, Persona persona) {
        this.id = id;
        this.clave = clave;
        this.persona = persona;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
