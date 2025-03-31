package clase.Yobjetos;

public class Animal {
    public float peso;

    public Animal(){

    }

    public Animal(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void comer(){
        System.out.println("El animal esta comiendo");
    }


}



