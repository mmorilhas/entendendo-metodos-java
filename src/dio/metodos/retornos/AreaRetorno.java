package dio.metodos.retornos;

public class AreaRetorno {

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularArea(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura / 2;
    }


}
