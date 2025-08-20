package formas;

public class Quadrado implements FormaGeometrica {
    public double lado;

    public Quadrado(double lado) {

    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println(area);
    }
}
