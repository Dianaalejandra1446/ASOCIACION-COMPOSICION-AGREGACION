// UNO A MUCHOS

public class Estudiante {
    private String nombre;
    private Curso curso; 
    
    public Estudiante(String nombre,Curso curso) {
            this.nombre = nombre;
            this.curso = curso;
    }
    
    public Curso getCurso() {
            return curso;
    }
    
    public void setCurso(Curso curso) {
            this.curso = curso;
    }
    

    }
