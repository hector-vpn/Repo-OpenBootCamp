public class Main{
   
    public static  void  main(String[] args){

        suma(3,3,3);

        Coche miCoche = new Coche();

        miCoche.puertas();

        System.out.println("Cantidad de puertas "+miCoche.puertas);


    }

    public static void suma(int n1 ,int n2,int n3){

        int sum = n1+n2+n3;

        System.out.println(sum);

    }
}

class Coche{
    int puertas = 3;

    public void puertas(){

        puertas++;
    }
}