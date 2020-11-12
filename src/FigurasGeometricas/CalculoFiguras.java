package FigurasGeometricas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoFiguras {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion = 0, figura = 0;
        boolean salir = false, regresar= false;
        Circle circulo = new Circle();
        Square cuadrado= new Square();
        Triangle triangulo = new Triangle();

        do {
            System.out.println("Calcula el area o perimetro de tu figura ");
            System.out.println("1° Calcular area ");
            System.out.println("2° Calcular perimetro ");
            System.out.println("3° Salir ");
            try {
                System.out.println("Elige una de las opciones ");
                opcion = Integer.parseInt(entrada.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Opcion no valida, tiene que ser alguno de los numeros del menu");
            }
            switch (opcion) {
                case 1:
                do {
                    System.out.println("¿De que figura quieres calcular el area? ");
                    System.out.println("1° Circulo ");
                    System.out.println("2° Cuadrado ");
                    System.out.println("3° Triangulo ");
                    System.out.println("4° Regresar ");
                    try {
                        System.out.println("Elige una de las opciones ");
                        figura = Integer.parseInt(entrada.readLine());
                    } catch (NumberFormatException e) {
                        System.err.println("Opcion no valida, tiene que ser alguno de los numeros del menu");
                    }
                    switch (figura) {
                        case 1:
                            System.out.println("Ingresa el radio de tu circulo ");
                            double radio = Double.parseDouble(entrada.readLine());
                            circulo.setRadius(radio);
                            System.out.println("El area de tu Circulo es: "+ circulo.area());
                            break;

                        case 2:
                            System.out.println("Ingresa el valor del lado de tu cuadrado ");
                            double lado = Double.parseDouble(entrada.readLine());
                            cuadrado.setSideLength(lado);
                            System.out.println("El area de tu cuadrdo es: "+ cuadrado.area());
                            break;
                        case 3:
                            System.out.println("Ingresa el valor de la base de tu triangulo ");
                            double base = Double.parseDouble(entrada.readLine());
                            triangulo.setSideLength(base);
                            System.out.println("ingresa el valor de la altura de tu triangulo ");
                            double altura =Double.parseDouble(entrada.readLine());
                            triangulo.setHeightLength(altura);
                            System.out.println("el area de tu triangulo es: "+ triangulo.area());
                            break;
                        case 4:
                            System.out.println("Regresando... ");
                            regresar=true;
                            break;

                        default:
                            System.out.println("La Opcion elegida no se encuentra en el menu ");
                            regresar=false;
                            break;
                    }
            }while (regresar!=true);

                    break;

                case 2:
                    do {
                        System.out.println("¿De que figura quieres calcular el perimetro? ");
                        System.out.println("1° Circulo ");
                        System.out.println("2° Cuadrado ");
                        System.out.println("3° Triangulo ");
                        System.out.println("4° Regresar ");
                        try {
                            System.out.println("Elige una de las opciones ");
                            figura = Integer.parseInt(entrada.readLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Opcion no valida, tiene que ser alguno de los numeros del menu");
                        }
                        switch (figura) {
                            case 1:
                                System.out.println("Ingresa el radio de tu circulo ");
                                double radio = Double.parseDouble(entrada.readLine());
                                circulo.setRadius(radio);
                                System.out.println("El perimetro de tu Circulo es: "+ circulo.perimetro());
                                break;

                            case 2:
                                System.out.println("Ingresa el valor del lado de tu cuadrado ");
                                double lado = Double.parseDouble(entrada.readLine());
                                cuadrado.setSideLength(lado);
                                System.out.println("El perimetro de tu cuadrdo es: "+ cuadrado.perimetro());
                                break;
                            case 3:
                                System.out.println("Ingresa el valor del lado de tu triangulo (calculo para triangulo equilatero)");
                                double ladot = Double.parseDouble(entrada.readLine());
                                triangulo.setSideLength(ladot);

                                System.out.println("el area de tu triangulo es: "+ triangulo.perimetro());
                                break;
                            case 4:
                                System.out.println("Regresando... ");
                                regresar=true;
                                break;

                            default:
                                System.out.println("La Opcion elegida no se encuentra en el menu ");
                                regresar=false;
                                break;
                        }
                    }while (regresar!=true);
                    break;

                case 3:
                    System.out.println("saliendo...");
                    salir=true;
                    break;

                default:
                    System.out.println("Opción  no valida, Solo hay opciones de calculos 1 y 2");
                    break;
            }
     } while (salir != true);


    }
}
