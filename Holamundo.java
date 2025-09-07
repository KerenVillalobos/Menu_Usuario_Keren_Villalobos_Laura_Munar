//Laura_Munar_Keren_Villalobos

import java.util.Scanner;

public class Holamundo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        do {
    
            opcion=menuPrincipal();
      
            switch (opcion) {
                case 1:
                opcion=menuHamburguesa();
                break;
                case 2: 
                opcion=menuPizza();
                break;
                case 3: 
                opcion=menuPerroCaliente();
                break;
                case 4:
                opcion=menuEmpanada();
                break;
                case 5:
                opcion=menuPollo();
                break;
                case 6: System.out.println("Programa Terminado");
                break;
                
                

            }

        } while (opcion !=6);     
    }
    

        public static int menuPrincipal (){
            Scanner entrada = new Scanner(System.in);
            int opcion = 0;
            System.out.print("----------------------\n\r|   FOOD DIVERSITY   |\n");
            System.out.print("|                    |\n");
            System.out.print("|   Comidas Rápidas  |\n");
            System.out.print("|                    |\n");
            System.out.print("| 1. Hamburguesa     |\n");
            System.out.print("| 2. Pizza           |\n");
            System.out.print("| 3. Perro Caliente  |\n");
            System.out.print("| 4. Empanada        |\n");
            System.out.print("| 5. Pollo           |\n");
            System.out.print("| 6. Terminar        |\n");
            System.out.print("----------------------\n");
            System.out.print("¿Qué desea?");
            opcion = entrada.nextInt();
            return opcion;

        }
                public static int menuHamburguesa (){
                    Scanner entrada = new Scanner(System.in);
                    int opcion = 0;
                    System.out.print("----------------------\n");
                    System.out.print("|   FOOD DIVERSITY   |\n");
                    System.out.print("|                    |\n");
                    System.out.print("|     Hamburguesa    |\n");
                    System.out.print("|                    |\n");
                    System.out.print("| 1. Doble           |\n");
                    System.out.print("| 2. Ranchera        |\n");
                    System.out.print("| 3. Madurita        |\n");
                    System.out.print("| 4. BBQ             |\n");
                    System.out.print("| 5. Atrás           |\n");
                    System.out.print("----------------------\n");
                    System.out.print("¿Qué desea?");
                    opcion = entrada.nextInt(); 
                    
                switch (opcion) {    
                    case 1: opcion=menuEleccion1(); break;
                    case 2: opcion=menuEleccion1(); break;
                    case 3: opcion=menuEleccion1(); break;
                    case 4: opcion=menuEleccion1(); break;
                    case 5: opcion=menuPrincipal(); break;   
                } 
                
                return opcion;            
                }
                        public static int menuEleccion1 (){
                            Scanner entrada = new Scanner(System.in);
                            int opcion = 0;
                            System.out.print("----------------------\n");
                            System.out.print("|   FOOD DIVERSITY   |\n");
                            System.out.print("|                    |\n");
                            System.out.print("| 1. Pollo           |\n");
                            System.out.print("| 2. Carne           |\n");
                            System.out.print("| 3. Vegana          |\n");
                            System.out.print("| 4. Atrás           |\n");
                            System.out.print("----------------------\n");
                            System.out.print("¿Qué desea?");
                            opcion = entrada.nextInt();

                        switch (opcion) {    
                            case 1: opcion=menuTamaño1(); break;
                            case 2: opcion=menuTamaño1(); break;
                            case 3: opcion=menuTamaño1(); break;
                            case 4: opcion=menuHamburguesa(); break;  
                        } 
                        return opcion;            
                        }
                                public static int menuTamaño1 (){
                                    Scanner entrada = new Scanner(System.in);
                                    int opcion = 0;
                                    System.out.print("----------------------\n");
                                    System.out.print("|   FOOD DIVERSITY   |\n");
                                    System.out.print("|                    |\n");
                                    System.out.print("| 1. Junior          |\n");
                                    System.out.print("| 2. Big             |\n");
                                    System.out.print("| 3. Volver al menú  |\n");
                                    System.out.print("----------------------\n");
                                    System.out.print("¿Qué desea?");
                                    opcion = entrada.nextInt();

                                switch (opcion) {    
                                    case 1: System.out.print("Su pedido está en preparación\n"); break;
                                    case 2: System.out.print("Su pedido está en preparación\n"); break;
                                    case 3: opcion=menuPrincipal(); break;
                                }
                                return opcion;                            
                                }



                public static int menuPizza (){
                    Scanner entrada = new Scanner(System.in);
                    int opcion = 0;
                    System.out.print("----------------------\n");
                    System.out.print("|   FOOD DIVERSITY   |\n");
                    System.out.print("|                    |\n");
                    System.out.print("|        Pizza       |\n");
                    System.out.print("|                    |\n");
                    System.out.print("| 1. Hawaiana        |\n");
                    System.out.print("| 2. Carnes          |\n");
                    System.out.print("| 3. Champiñones     |\n");
                    System.out.print("| 4. Ranchera        |\n");
                    System.out.print("| 5. Atrás           |\n");
                    System.out.print("----------------------\n");
                    System.out.print("¿Qué desea?");
                    opcion = entrada.nextInt();

                switch (opcion) {    
                    case 1: opcion=menuEleccion2(); break;
                    case 2: opcion=menuEleccion2(); break;
                    case 3: opcion=menuEleccion2(); break;
                    case 4: opcion=menuEleccion2(); break;
                    case 5: opcion=menuPrincipal(); break;   
                }
                return opcion; 
                }
                        public static int menuEleccion2 (){
                            Scanner entrada = new Scanner(System.in);
                            int opcion = 0;
                            System.out.print("----------------------\n");
                            System.out.print("|   FOOD DIVERSITY   |\n");
                            System.out.print("|                    |\n");
                            System.out.print("| 1. Queso Extra     |\n");
                            System.out.print("| 2. Carne Extra     |\n");
                            System.out.print("| 3. Salsas Extra    |\n");
                            System.out.print("| 4. Atrás           |\n");
                            System.out.print("----------------------\n");
                            System.out.print("¿Qué desea?");
                            opcion = entrada.nextInt();

                        switch (opcion) {    
                            case 1: opcion=menuTamaño2(); break;
                            case 2: opcion=menuTamaño2(); break;
                            case 3: opcion=menuTamaño2(); break;
                            case 4: opcion=menuPizza(); break;  
                        } 
                        return opcion;
                        }
                                public static int menuTamaño2 (){
                                    Scanner entrada = new Scanner(System.in);
                                    int opcion = 0;
                                    System.out.print("----------------------\n");
                                    System.out.print("|   FOOD DIVERSITY   |\n");
                                    System.out.print("|                    |\n");
                                    System.out.print("| 1. Junior          |\n");
                                    System.out.print("| 2. Big             |\n");
                                    System.out.print("| 3. Volver al menú  |\n");
                                    System.out.print("----------------------\n");
                                    System.out.print("¿Qué desea?");
                                    opcion = entrada.nextInt();

                                switch (opcion) {    
                                    case 1: System.out.print("Su pedido está en preparación\n"); break;
                                    case 2: System.out.print("Su pedido está en preparación\n"); break;
                                    case 3: opcion=menuPrincipal(); break;
                                }
                                return opcion;
                                }



                public static int menuPerroCaliente (){
                    Scanner entrada = new Scanner(System.in);
                    int opcion = 0;
                    System.out.print("----------------------\n");
                    System.out.print("|   FOOD DIVERSITY   |\n");
                    System.out.print("|                    |\n");
                    System.out.print("|   Perro Caliente   |\n");
                    System.out.print("|                    |\n");
                    System.out.print("| 1. Americano       |\n");
                    System.out.print("| 2. Doble           |\n");
                    System.out.print("| 3. Especial        |\n");
                    System.out.print("| 4. Ranchero        |\n");
                    System.out.print("| 5. Atrás           |\n");
                    System.out.print("----------------------\n");
                    System.out.print("¿Qué desea?");
                    opcion = entrada.nextInt();

                switch (opcion) {    
                    case 1: opcion=menuEleccion3(); break;
                    case 2: opcion=menuEleccion3(); break;
                    case 3: opcion=menuEleccion3(); break;
                    case 4: opcion=menuEleccion3(); break;
                    case 5: opcion=menuPrincipal(); break;  
                }
                return opcion; 
                }
                        public static int menuEleccion3 (){
                            Scanner entrada = new Scanner(System.in);
                            int opcion = 0;
                            System.out.print("----------------------\n");
                            System.out.print("|   FOOD DIVERSITY   |\n");
                            System.out.print("|                    |\n");
                            System.out.print("| 1. Queso Extra     |\n");
                            System.out.print("| 2. Papitas Extra   |\n");
                            System.out.print("| 3. Salsas Extra    |\n");
                            System.out.print("| 4. Atrás           |\n");
                            System.out.print("----------------------\n");
                            System.out.print("¿Qué desea?");
                            opcion = entrada.nextInt();

                        switch (opcion) {    
                            case 1: opcion=menuTamaño3(); break;
                            case 2: opcion=menuTamaño3(); break;
                            case 3: opcion=menuTamaño3(); break;
                            case 4: opcion=menuPerroCaliente(); break; 
                        } 
                        return opcion;
                        }
                                public static int menuTamaño3 (){
                                    Scanner entrada = new Scanner(System.in);
                                    int opcion = 0;
                                    System.out.print("----------------------\n");
                                    System.out.print("|   FOOD DIVERSITY   |\n");
                                    System.out.print("|                    |\n");
                                    System.out.print("| 1. Junior          |\n");
                                    System.out.print("| 2. Big             |\n");
                                    System.out.print("| 3. Volver al menú  |\n");
                                    System.out.print("----------------------\n");
                                    System.out.print("¿Qué desea?");
                                    opcion = entrada.nextInt();

                                switch (opcion) {    
                                    case 1: System.out.print("Su pedido está en preparación\n"); break;
                                    case 2: System.out.print("Su pedido está en preparación\n"); break;
                                    case 3: opcion=menuPrincipal(); break;
                                }
                                return opcion;
                                }



                public static int menuEmpanada (){
                    Scanner entrada = new Scanner(System.in);
                    int opcion = 0;
                    System.out.print("----------------------\n");
                    System.out.print("|   FOOD DIVERSITY   |\n");
                    System.out.print("|                    |\n");
                    System.out.print("|      Empanada      |\n");
                    System.out.print("|                    |\n");
                    System.out.print("| 1. Pollo           |\n");
                    System.out.print("| 2. Carne           |\n");
                    System.out.print("| 3. Lechona         |\n");
                    System.out.print("| 4. Vegana          |\n");
                    System.out.print("| 5. Atrás           |\n");
                    System.out.print("----------------------\n");
                    System.out.print("¿Qué desea?");
                    opcion = entrada.nextInt();

                switch (opcion) {    
                    case 1: opcion=menuEleccion4(); break;
                    case 2: opcion=menuEleccion4(); break;
                    case 3: opcion=menuEleccion4(); break;
                    case 4: opcion=menuEleccion4(); break;
                    case 5: opcion=menuPrincipal(); break;  
                }
                return opcion; 
                }
                        public static int menuEleccion4 (){
                            Scanner entrada = new Scanner(System.in);
                            int opcion = 0;
                            System.out.print("----------------------\n");
                            System.out.print("|   FOOD DIVERSITY   |\n");
                            System.out.print("|                    |\n");
                            System.out.print("| 1. Salsa de Tomate |\n");
                            System.out.print("| 2. Salsa Chowii    |\n");
                            System.out.print("| 3. Ají             |\n");
                            System.out.print("| 4. Atrás           |\n");
                            System.out.print("----------------------\n");
                            System.out.print("¿Qué desea?");
                            opcion = entrada.nextInt();

                        switch (opcion) {    
                            case 1: opcion=menuTamaño4(); break;
                            case 2: opcion=menuTamaño4(); break;
                            case 3: opcion=menuTamaño4(); break;
                            case 4: opcion=menuEmpanada(); break;
                        } 
                        return opcion;
                        }
                                public static int menuTamaño4 (){
                                    Scanner entrada = new Scanner(System.in);
                                    int opcion = 0;
                                    System.out.print("----------------------\n");
                                    System.out.print("|   FOOD DIVERSITY   |\n");
                                    System.out.print("|                    |\n");
                                    System.out.print("| 1. Junior          |\n");
                                    System.out.print("| 2. Big             |\n");
                                    System.out.print("| 3. Volver al menú  |\n");
                                    System.out.print("----------------------\n");
                                    System.out.print("¿Qué desea?");
                                    opcion = entrada.nextInt();

                                switch (opcion) {    
                                    case 1: System.out.print("Su pedido está en preparación\n"); break;
                                    case 2: System.out.print("Su pedido está en preparación\n"); break;
                                    case 3: opcion=menuPrincipal(); break;
                                }
                                return opcion;
                                }



                public static int menuPollo (){
                    Scanner entrada = new Scanner(System.in);
                    int opcion = 0;
                    System.out.print("----------------------\n");
                    System.out.print("|   FOOD DIVERSITY   |\n");
                    System.out.print("|                    |\n");
                    System.out.print("|        Pollo       |\n");
                    System.out.print("|                    |\n");
                    System.out.print("| 1. Asado           |\n");
                    System.out.print("| 2. Broaster        |\n");
                    System.out.print("| 3. Frito           |\n");
                    System.out.print("| 4. BBQ             |\n");
                    System.out.print("| 5. Atrás           |\n");
                    System.out.print("----------------------\n");
                    System.out.print("¿Qué desea?");
                    opcion = entrada.nextInt();

                switch (opcion) {    
                    case 1: opcion=menuEleccion5(); break;
                    case 2: opcion=menuEleccion5(); break;
                    case 3: opcion=menuEleccion5(); break;
                    case 4: opcion=menuEleccion5(); break;
                    case 5: opcion=menuPrincipal(); break;
                }
                return opcion; 
                }
                        public static int menuEleccion5 (){
                            Scanner entrada = new Scanner(System.in);
                            int opcion = 0;
                            System.out.print("----------------------\n");
                            System.out.print("|   FOOD DIVERSITY   |\n");
                            System.out.print("|                    |\n");
                            System.out.print("| 1. Yuca            |\n");
                            System.out.print("| 2. Aborrajado      |\n");
                            System.out.print("| 3. Presa Extra     |\n");
                            System.out.print("| 4. Atrás           |\n");
                            System.out.print("----------------------\n");
                            System.out.print("¿Qué desea?");
                            opcion = entrada.nextInt();

                        switch (opcion) {    
                            case 1: opcion=menuTamaño5(); break;
                            case 2: opcion=menuTamaño5(); break;
                            case 3: opcion=menuTamaño5(); break;
                            case 4: opcion=menuPollo(); break;
                        }
                        return opcion; 
                        }
                                public static int menuTamaño5 (){
                                    Scanner entrada = new Scanner(System.in);
                                    int opcion = 0;
                                    System.out.print("----------------------\n");
                                    System.out.print("|   FOOD DIVERSITY   |\n");
                                    System.out.print("|                    |\n");
                                    System.out.print("| 1. Personal        |\n");
                                    System.out.print("| 2. Familiar        |\n");
                                    System.out.print("| 3. Volver al menú  |\n");
                                    System.out.print("----------------------\n");
                                    System.out.print("¿Qué desea?");
                                    opcion = entrada.nextInt();

                                switch (opcion) {    
                                    case 1: System.out.print("Su pedido está en preparación\n"); break;
                                    case 2: System.out.print("Su pedido está en preparación\n"); break;
                                    case 3: opcion=menuPrincipal(); break;
                                }
                                return opcion;
                                }

}

                        
