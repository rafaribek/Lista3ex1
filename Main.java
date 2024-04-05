package br.cesul.app;

import br.cesul.shape.Square;

public class Main {

        public static void main(String[] args) {
            Square square = new Square(20);
            System.out.println("O valor total da area é: " + square.finalArea());
            System.out.println("O valor total do perimetro é: " + square.finalPerimeter());
        }
}
