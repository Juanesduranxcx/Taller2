public class Main {
    public static void main (String[] args){
        Leccion claseUno = new Leccion("introduccion a java", 45.5f, " L-100 " );

        Curso miCurso = new Curso (" Programacion Pro " , "De cero a herore", "Software","Basico");

        miCurso.sumarLeccion(claseUno);

        Usuario persona = new Usuario ("Juan esteban ", 18, 102886, "3213438564","Juacuranco@unal.edu.co");

        miCurso.Registrar(persona);

        Inscripcion matricula = new Inscripcion ("19/02/2026", miCurso);

        System.out.println("Inicio\n");
        matricula.calcular();

        System.out.println("Finalizado\n");
        matricula.marcarLeccionCompleta("L-100\n");
    }
}
