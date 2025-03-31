package clase.Yobjetos;

public class Main {
    public static void main(String[] args) {
        //instanciamos objeto de clase Animal
        Animal gato= new Animal(4.5f);
        System.out.println("El gato pesa: " +gato.getPeso() + "kg" );
        gato.comer();

        //Instanciamos objeto de clase oviparo
        Oviparo cocodrillo=new Oviparo(500f);
        System.out.println("El Cocodrillo pesa " +cocodrillo.getPeso() + "kg");
        cocodrillo.comer();
        cocodrillo.ponerHuevos();


        //Instanciamos objeto de clase mamifero
        Mamifero canguro=new Mamifero(66f,true);
        System.out.println("\nEl canguro pesa " +canguro.getPeso() + "kg" + " su sangre caliente es " + canguro.getSangreCaliente());
        canguro.comer();
        canguro.parir();
        canguro.amamantar();

        //Instanciamos objeto de clase delfin
        Delfin delfin=new Delfin(77f ,true);
        System.out.println("\nEl Delfin pesa " +delfin.getPeso() + "kg" + " su sangre caliente es " + delfin.getSangreCaliente());
        delfin.comer();
        delfin.nadar();
        delfin.amamantar();
        delfin.parir();

        Perro perro=new Perro(35f,false,"Negro");
        System.out.println("\nEl perro pesa " +perro.getPeso()+ "kg" + " su sangre caliente es " + perro.getSangreCaliente() + " el color del pelo es " + perro.getColorPelo());
        perro.ladrar();
        perro.comer();
        perro.amamantar();
        perro.parir();






    }
}