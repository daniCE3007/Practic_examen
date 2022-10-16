package sistemauniversidad;

//Atributos
public class estudiante {
    private String nombre;
    private String apellido;
    private String edad;
    private String cedula;
    private String telefono;
    
    //Constructor vacio
    public estudiante() {
    }

    //Constructor con atributos
    public estudiante(String nombre, String apellido, String edad, 
            String cedula, String telefono) {
        //Inicializar atributos
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    //Metodos GET
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    } 

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    //Metodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

}
