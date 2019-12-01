
/**
 * Clase busqueda que contiene que un metodo buscar(), el cual
 * busca mediante el contenido que tiene las notas, usando la clase
 * Notas creamos un arreglos un de notas, en cual se ira recorriendo
 * para encontrar la nota.
 *
 * @author Gonzalez Pascual Melvin Paul
 * @version 2019 11 30
 */
public class Busqueda //Inicio de la clase
{
    static Nota s; //Creacion del objeto Nota
    int posicion=0; //Posicion de la nota en el arreglo
    int x=0;//Contador
    private Nota[]n=new Nota[100];//Atributo de la clase, que es un arreglo de notas
    /**
     * Constructor for objects of class Busqueda
     */
    public Busqueda()
    {
       Nota[]n=new Nota[100];//Constructor
    }

    /**
     * Metodo que busca una Nota mediante su contenido que tiene la nota
     *
     * @param Nota Las nota que tenemos.
     * @param s El contenido con el que deseamos encontrar la nota.
     * @return    la posicio donde se encuentra la nota
     */
    public int buscar(String nota, String s){//Inicio del metodo
    while(x<nota.length())  //Que sea menor al numero que deseamos buscar
        posicion=nota.indexOf(s);//Posicio
    if(posicion!=-1){//Condicion que descrementa
    posicion +=s.length();//Creacion de una subcadena
    nota=nota.substring(posicion);
    x=-1;
    }    
    x++;//Incremento
   return posicion;//Regresa la posicion de la nota
}//Fin del metodo
}//Fin del clase
