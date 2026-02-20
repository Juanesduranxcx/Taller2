public class Leccion {
    private String titulo;
    private float duracion;
    private String identificador;

    public Leccion (String titulo , float duracion , String identificador){
        this.titulo = titulo;
        this.duracion = duracion;
        this.identificador = identificador;
    }
    public String getTitulo() {
        return titulo;
    }
    public float getDuracion(){
        return duracion;
    }
    public String getIdentificador(){
        return identificador;
    }
}