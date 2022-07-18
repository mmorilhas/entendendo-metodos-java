package dio.metodos.sobrecarga;

public class Area {

    public static void calcularArea(double lado){
        System.out.println("Área quadrado: " + lado * lado);
    }

    public static void calcularArea(double base, double altura){
        System.out.println("Área retângulo: " + base * altura);
    }

    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        System.out.println("Área trapézio: " + ((baseMaior + baseMenor)*altura) / 2);
    }


}
