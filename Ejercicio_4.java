public class Ejercicio_4 {
    
    public static void main(String[] args) {

        comparaNumero(4);

        System.out.println("<<<Bucle While>>>");
        incremento();

        System.out.println("<<<Bucle Do While>>>");
        doIncremento();

        System.out.println("<<<Bucle For>>>");
        forIncremento();
        
        System.out.println("Condicional SWITCH CASE");
        
        for(int i = 1; i < 6; i++ ){

            estaciones(i);
        }


    }

    public static void comparaNumero(int numeroIf){

        if (numeroIf < 0){

            System.out.print(numeroIf+" es un numero negativo");
            
        }
        else{

            System.out.println(numeroIf+" es positivo");
        }
    }

    public static void incremento(){

        int numeroWhile = 0;

        while (numeroWhile < 3){

            numeroWhile++;
            System.out.println("Numero= "+numeroWhile);
        }

    }

    public static void doIncremento(){

        int numeroWhile = 3;
        
        do{
            numeroWhile++;
            System.out.println("Numero= "+numeroWhile);
        }
        while(numeroWhile < 3);
    }
   
    public static void forIncremento(){

        

        for(int numeroFor = 0; numeroFor < 3; numeroFor++ ){

            System.out.println(">>"+numeroFor);
        }

    }
  
    public static void estaciones(int estacion){

        switch(estacion){
            case 1:{
                System.out.println("VERANO");
                break;
            }
            case 2:{
                System.out.println("OTOÑO");
                break;
            }
            case 3:{
                System.out.println("INVIERNO");
                break;
            }
            case 4:{
                System.out.println("PRIMAVERA");
                break;
            }
            default:{
                System.out.println("Opcion incorrecta");
            }
        }
    }

}
