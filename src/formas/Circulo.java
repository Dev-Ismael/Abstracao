package formas;

// IMPLEMENTS serve para ligar com a interface

public class Circulo implements FormaGeometrica {
    public double raio;

    public Circulo(double raio) {

    }

    @Override
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println(area);
    }
}
