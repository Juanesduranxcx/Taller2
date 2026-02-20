import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String titulo;
    private String descripcion;
    private String categoria;
    private String nivel;
    private List<Leccion> Lecciones;

    public Curso (String titulo, String descipcion , String categoria , String nivel){
        this.titulo = titulo;
        this.descripcion = descipcion;
        this.categoria = categoria;
        this.nivel = nivel;
        this.Lecciones = new ArrayList<>();
    }
    public List<Leccion> getLecciones(){
        return Lecciones;

    }
    public String getTitulo() {
        return titulo;

    }
    public void sumarLeccion (Leccion nuevaLeccion){
        this.Lecciones.add(nuevaLeccion);

    }
    public void Registrar (Usuario personaCursante){
        System.out.println("Registrando a " + personaCursante.getNombre() + "en el curso " + this.titulo  );
    }

}
