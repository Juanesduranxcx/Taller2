
public class Inscripcion {
    private String fecha;
    private String Estado;
    private int progreso;
    private Curso curso;

    public Inscripcion(String fecha,Curso curso){
        this.fecha = fecha;
        this.Estado = "Inicial";
        this.progreso = 0;
        this.curso = curso;
    }
    public void marcarLeccionCompleta(String idLeccion) {
        System.out.println("Leccion con ID " + idLeccion + "Marcada como completamente realizada");
        this.progreso += 10;
        if (this.progreso > 100) this.progreso = 100;
        calcular();
    }
        public int calcular (){
            System.out.println("Fecha de inscripcion: " + this.fecha);
            System.out.println("Progreso actual del curso"  + curso.getTitulo() + this.progreso + "%");
            return this.progreso;
        }
        public String getEstado(){
        return Estado;
        }
    }


