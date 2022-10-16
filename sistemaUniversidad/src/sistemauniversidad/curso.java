package sistemauniversidad;

public class curso {
    //Atributos
    private String nombreCurso;
    private String codigoCurso;
    private String horarioCurso;
    private String aulaCurso;
    private String cupoCurso;

    //Constructor vacio
    public curso() {
    }

    //Constructor con atributos
    public curso(String nombreCurso, String codigoCurso, String horarioCurso, 
            String aulaCurso, String cupoCurso) {
        //Inicializar atributos
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.horarioCurso = horarioCurso;
        this.aulaCurso = aulaCurso;
        this.cupoCurso = cupoCurso;
    }

    //Metodos GET
    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getHorarioCurso() {
        return horarioCurso;
    }

    public String getAulaCurso() {
        return aulaCurso;
    }

    public String getCupoCurso() {
        return cupoCurso;
    }

    //Metodos SET
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public void setAulaCurso(String aulaCurso) {
        this.aulaCurso = aulaCurso;
    }

    public void setCupoCurso(String cupoCurso) {
        this.cupoCurso = cupoCurso;
    }

}
