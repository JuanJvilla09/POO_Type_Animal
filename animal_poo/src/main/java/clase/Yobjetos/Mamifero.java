package clase.Yobjetos;

public class Mamifero extends Animal{
    public boolean sangreCaliente;

    public Mamifero() {

    }

    public Mamifero(float peso, boolean sangreCaliente) {
        super(peso);
        this.sangreCaliente = sangreCaliente;
    }

    public boolean getSangreCaliente() {
        return sangreCaliente;
    }

    public void setSangreCaliente(boolean sangreCaliente) {
        this.sangreCaliente = sangreCaliente;
    }

    public void parir(){
        System.out.println("El mamifero esta pariendo");
    }

    public void amamantar(){
        System.out.println("El mamifero esta amamantando sus crias");

    }



}
