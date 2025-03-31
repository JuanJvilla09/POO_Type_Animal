package clase.Yobjetos;

public class Perro extends Mamifero{
    public String colorPelo;

    public Perro() {

    }

    public Perro(float peso, boolean sangreCaliente, String colorPelo) {
        super(peso, sangreCaliente);
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
}
