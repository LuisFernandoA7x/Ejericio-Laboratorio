import java.util.ArrayList;
 
public class Laboratorio
{
     private ArrayList<Alumno> alumnos;
     
     
     public Laboratorio()
     {
         alumnos = new ArrayList<Alumno>();
     }
     
     public void incribir(String nombre, int clave)
     {
         Alumno alumn = new Alumno(nombre, clave);
         
     } 
}

