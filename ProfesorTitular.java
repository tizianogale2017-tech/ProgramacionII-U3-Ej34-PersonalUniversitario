package Ejercicio34_personalUniversitario;

public class ProfesorTitular extends PersonalUniversitario {
    private int horasFrenteAlumnos;
    private String categoriaDocencia;

    public ProfesorTitular(String nombre, int legajo, int antiguedadAnios, int horasFrenteAlumnos, String categoriaDocencia) {
        super(nombre, legajo, antiguedadAnios);
        this.horasFrenteAlumnos = horasFrenteAlumnos;
        this.categoriaDocencia = categoriaDocencia;
    }

    @Override
    public double calcularSalarioBruto() {
        double bonoCategoria = categoriaDocencia.equals("A") ? 150000.0 : 80000.0;
        return super.calcularSalarioBruto() + horasFrenteAlumnos * 9000.0 + bonoCategoria;
    }
}
