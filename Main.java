package Ejercicio34_personalUniversitario;

public class Main {
    public static void main(String[] args) {
        PersonalUniversitario[] plantel = {
            new ProfesorTitular("Dra. Paula Núñez", 1001, 15, 12, "A"),
            new Investigador("Dr. Mario Funes", 1002, 8, 6, 2000000.0),
            new AyudanteCatedra("Lic. Elena Mora", 1003, 2, 4)
        };

        double total = 0;
        System.out.println("=== Reporte de salarios brutos ===");
        for (PersonalUniversitario p : plantel) {
            double salario = p.calcularSalarioBruto();
            total += salario;
            System.out.printf("%s (%s, legajo %d): %.2f%n", p.getNombre(), p.getClass().getSimpleName(), p.getLegajo(), salario);
        }
        System.out.printf("Masa salarial total: %.2f%n", total);
    }
}
