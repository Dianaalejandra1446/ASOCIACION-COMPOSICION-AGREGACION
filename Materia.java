//MUCHOS A MUCHOS
public class Materia {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Materia(String nombre, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void EnviarEstudiante(Estudiante estudiante01){
        estudiantes.add(estudiante01);
        estudiante01.setMateria(this);
    }
}
