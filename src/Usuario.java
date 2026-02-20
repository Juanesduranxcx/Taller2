import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String Nombre;
    private int edad ;
    private int id ;
    private String Telefono;
    private String Correo;


    private List<Inscripcion> Inscripciones;

    public Usuario(String Nombre, int edad , int id , String Telefono, String correo){
        this.Nombre = Nombre;
        this.edad = edad;
        this.id = id;
        this.Telefono = Telefono;
        this.Correo = correo;
        this.Inscripciones = new ArrayList<>();
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCorreo(){
        return Correo;
    }
    public void ListarCursos (String disponibilidad){
        System.out.println("Listando cursos disponibles " + disponibilidad);
    }
}
