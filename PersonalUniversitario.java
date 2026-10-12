package Ejercicio34_personalUniversitario;

public class PersonalUniversitario {
    private String nombre;
    private int legajo;
    private int antiguedadAnios;

    public PersonalUniversitario(String nombre, int legajo, int antiguedadAnios) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.antiguedadAnios = antiguedadAnios;
    }

    public double calcularSalarioBruto() {
        return 400000.0 + antiguedadAnios * 10000.0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }
}
