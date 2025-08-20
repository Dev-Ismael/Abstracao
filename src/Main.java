import Exercicio.Exibivel;
import Exercicio.Produto;
import formas.FormaGeometrica;
import formas.Quadrado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Circulo, Quadrado - CalcularArea()
        // Criar interfaces
        FormaGeometrica forma = new Quadrado(4);

        Exibivel prod1 = new Produto("i30", 55000, "Hyundai");
        prod1.mostrarDetalhes();


    }
}