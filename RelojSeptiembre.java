public class RelojSeptiembre{
    public static void main(String []args){
        
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        
       
        while (true) {
    
            System.out.println(String.format("%d : %d : %d", horas, minutos, segundos));

             segundos = segundos + 1;

             if (segundos > 59) {
                segundos = 0;
                minutos= minutos + 1;
             }
             if (minutos > 59){
                minutos = 0;
                horas = horas + 1;
             }

            if(horas > 23){
                horas = 0;

            }  
             
        }
        

    }

    
}
