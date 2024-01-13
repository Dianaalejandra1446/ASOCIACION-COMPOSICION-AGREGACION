//MUCHOS A MUCHOS
import java.util.List;

public class Estudiante1 {
    private String nombre;
    private List<Materia> materias;

    public Estudiante1(String nombre, List<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
    public void EnviarMaterias(Materia materia){
        materias.add(materia);
        materia.setEstudiante1(this);
    }
    
}
