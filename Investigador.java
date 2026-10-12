package Ejercicio34_personalUniversitario;

public class Investigador extends PersonalUniversitario {
    private int papersPublicados;
    private double subsidioAsignado;

    public Investigador(String nombre, int legajo, int antiguedadAnios, int papersPublicados, double subsidioAsignado) {
        super(nombre, legajo, antiguedadAnios);
        this.papersPublicados = papersPublicados;
        this.subsidioAsignado = subsidioAsignado;
    }

    @Override
    public double calcularSalarioBruto() {
        return super.calcularSalarioBruto() + papersPublicados * 35000.0 + subsidioAsignado * 0.10;
    }
}
