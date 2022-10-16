package sistemauniversidad;

public class profesor {
    //Atributos
    private String nombreProfesor;
    private String cursoProfesor;
    private String cedulaProfesor;

    //Constructor vacio
    public profesor() {
    }

    //Constructor con atributos
    public profesor(String nombreProfesor, String cursoProfesor, 
            String cedulaProfesor) {
        //Inicializar atributos
        this.nombreProfesor = nombreProfesor;
        this.cursoProfesor = cursoProfesor;
        this.cedulaProfesor = cedulaProfesor;
    }

    //Metodos GET
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getCursoProfesor() {
        return cursoProfesor;
    }

    public String getCedulaProfesor() {
        return cedulaProfesor;
    }

    //Metodos SET
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setCursoProfesor(String cursoProfesor) {
        this.cursoProfesor = cursoProfesor;
    }

    public void setCedulaProfesor(String cedulaProfesor) {
        this.cedulaProfesor = cedulaProfesor;
    }
}
