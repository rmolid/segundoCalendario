
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
 String diaActual="";
 String mesActual= "" ; 
 String añoActual= "" ; 
 
  if(dia < 10 ){
      diaActual =  "0" + this.dia ;
    }
    else {
      diaActual= this.dia + "";
    }
    
  if (mes <10){
    
    mesActual = "0"  + this.mes ;
    
    }
    else{
     mesActual= this.mes + "" ;
    
    }
    
  if (año <10) {
    añoActual =  "0" +this.año;
    
    }
   else{
    añoActual = this.año + "";
    }
 
 return diaActual + "-" +mesActual+ "-" + añoActual; 

}

public void fijarFecha (int nuevoDia, int nuevoMes, int nuevoAño){
    this.dia = nuevoDia;
    this.mes= nuevoMes;
    this.año= nuevoAño;
}

public void avanzarFecha(){
    this.dia++; 
   if (this.dia== 31){
        this.dia=1;
    }
    this.mes++;
    
    if (this.mes==12){
        this.mes=1;
   }
   this.año++;
   if(this.año==100){
        this.dia=1;
        this.mes=1;
        this.año=1;
        
    }
 }





}