
/**
 * Calendario.
 * 
 * Raquel
 * 05/11/2019
 */
public class CalendarioBasico{
    
 // Dia 
    private int dia;
 // Mes
    private int mes;
 // Año
    private int año;
    
   /**
    * Crea un calendario nuevo.
    */
   public CalendarioBasico (){
   dia = 1 ;
   mes = 1 ;
   año = 1 ;
}

public String obtenerFecha() {
    
 String fechaCompleta = "" ; 
 String diaActual="";
 String mesActual= "" ; 
 String añoActual= "" ; 
 
  if(dia< 2 ){
      diaActual =  "0" + dia + "-";
    }
    
  if (mes <2){
    
    mesActual = "0"  + mes + "-";
    
    }
    
  if (año <2) {
    añoActual =  "0" +año;
    
    }
 
 return fechaCompleta= diaActual+mesActual+añoActual; 

}



}