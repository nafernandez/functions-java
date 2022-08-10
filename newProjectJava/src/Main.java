public class Main {
    public static void main(String[] args) {

        //primera parte

        suma(10, 20, 30);

        //segunda parte

        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        miCoche.mostrarNumeroPuertas();
    }

    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class Coche {
    public int puertas = 0;

    public void agregarPuertas() {
        this.puertas ++;
    }

    public void mostrarNumeroPuertas() {
        System.out.println(this.puertas);
    }
}
