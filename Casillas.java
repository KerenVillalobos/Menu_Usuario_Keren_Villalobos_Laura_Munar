public class Casillas {
    public static void main(String []args ){
        int numero[] = new int [10];
        for(int i = 9; i >= 0; i--){
             numero[i] = 9-i;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(numero[i]);
        }

    }
}
