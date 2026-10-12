package Ejercicio34_personalUniversitario;

public class AyudanteCatedra extends PersonalUniversitario {
    private int practicasAsignadas;

    public AyudanteCatedra(String nombre, int legajo, int antiguedadAnios, int practicasAsignadas) {
        super(nombre, legajo, antiguedadAnios);
        this.practicasAsignadas = practicasAsignadas;
    }

    @Override
    public double calcularSalarioBruto() {
        return super.calcularSalarioBruto() * 0.5 + practicasAsignadas * 12000.0;
    }
}
