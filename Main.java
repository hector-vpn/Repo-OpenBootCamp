public class Main{
   
    public static  void  main(String[] args){

        suma(3,3,3);

        Coche miCoche = new Coche();

        miCoche.addPuertas();

        //System.out.println(miCoche.addPuertas);


    }

    public static void suma(int n1 ,int n2,int n3){

        int sum = n1+n2+n3;

        System.out.println(sum);

    }
}




class Coche{
    int puertas=4;

    public void addPuertas(){

        puertas++;
    }
}