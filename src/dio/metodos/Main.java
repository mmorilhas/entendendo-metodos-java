package dio.metodos;

import dio.metodos.retornos.AreaRetorno;
import dio.metodos.sobrecarga.Area;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(5,2);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(10, 2);
        Calculadora.divisao(7, 3);

        //Mensagem
        System.out.println("Saudações");
        Mensagem.saudacao(10);
        Mensagem.saudacao(16);
        Mensagem.saudacao(0);
        Mensagem.saudacao(23);
        Mensagem.saudacao(26);

        //Emprestimo
        System.out.println("Empréstimo");
        Emprestimo.calcular(400, 2);
        Emprestimo.calcular(400, 3);

        //Sobrecarga
        System.out.println("Cálculo de área");
        Area.calcularArea(4);
        Area.calcularArea(4,2);
        Area.calcularArea(7, 5,9);

        //Retornos
        System.out.println("Usando retornos");
        double areaQuadrado = AreaRetorno.calcularArea(4);
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaRetangulo = AreaRetorno.calcularArea(4, 2);
        System.out.println("A área do retângulo é: " + areaRetangulo);

        double areaTrapezio = AreaRetorno.calcularArea(7, 5, 9);
        System.out.println("A área do trapézio é: " + areaTrapezio);

    }
}
