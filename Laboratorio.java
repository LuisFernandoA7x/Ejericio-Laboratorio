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
       Alumno alumno = new Alumno(nombre, clave);
       alumnos.add(alumno);
   } 
    
   public void darDeBaja(int claveDeBaja)
   {
       for(int i=0; i<alumnos.size(); i++)
       {
           Alumno alumn = alumnos.get(i);
           if(alumn.dimeClave() == claveDeBaja)
           {
               alumnos.remove(i);
           }
       }
   }
   
   public void imprimirLista()
   {
       for(int i=0; i<alumnos.size(); i++)
       {
           Alumno alumn = alumnos.get(i);
           System.out.println("Alumno: "+ alumn.dimeNombre() + " Clave: "+ alumn.dimeClave());
       }
   }
}

