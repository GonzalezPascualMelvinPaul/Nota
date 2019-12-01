import java.util.Date;//Uso de la clase Date, para poder usar fechas.
/**
 * Clase Nota, el cual es un objeto que tiene distintos atributos que
 * conforman la clase, el cuales son contenido, titulo y fecha, lo que
 * mas o menos conforma una nota.
 *
 * @author Gonzalez Pascual Melvin Paul
 * @version 2019 11 30
 */
public class Nota
{
    private String contenido, titulo;
    private Date fecha;
    /**
     * Constructor for objects of class Nota
     */
    public Nota(String contenido, String titulo, Date fecha)
    {
      this.contenido=contenido;
      this.titulo=titulo;
      this.fecha=fecha; 
    }

    /**
     * Metodo que nos da el contenido
     *
     * @param  
     * @return contenido de tipo String
     */
     public void setcontenido(){
      this.contenido=contenido;
    }
    
    /** 
    *Metodo para poder recibir contenido
    *@param contenido recibe un String
    *@return un String
    */
    public String getcontenido(String contenido){
    return contenido;
    }
    
    /** 
     *Metodo que nos da el titulo
     *
     * @param  
     * @return titulo de String
        
    */
    public void settitulo(){
     this.titulo=titulo;
    }
    
    /**  
    *Metodo para poder recibir titulo
    *@param titulo recibe un String
    *@return un String
    */   
   
    public String gettitulo(String titulo){
    return titulo;
    }
    
    /** 
    * Metodo que nos da la fecha
     *
     * @param  
     * @return fecha de tipo date
        
    */
    public void setfecha(){
    this.fecha=fecha;
    }
    
    /**  
    *Metodo para poder recibir fecha
    *@param fecha recibe un String
    *@return un Date
    */   
    
    public Date getfecha(Date fecha){
    return fecha;
    }
}
