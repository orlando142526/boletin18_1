
package boletin18;


public class Numeros {
     int [] numeros = new int [6]; 
       public void crearArray (){
        for(int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*50)+1;
            System.out.println("****"+numeros[i]);
           
}
       }
       public void inversa(){
           for(int i=numeros.length -1 ;i>-1;i--){
           System.out.println(numeros[i]);     
           }       
                   
       }
}

       