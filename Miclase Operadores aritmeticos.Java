public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numero1 = 7;
        int numero2 = 5;

        System.out.println("Operaciones entre \"numero1\" (" + numero1 + ") y \"numero2\" (" + numero2 + "):");
        
        System.out.println("Suma (+): " + (numero1 + numero2));
        System.out.println("Resta (-): " + (numero1 - numero2));
        System.out.println("Multiplicación (*): " + (numero1 * numero2));
        System.out.println("División entera (/): " + (numero1 / numero2));
        System.out.println("División exacta (/): " + ((double) numero1 / numero2));
        System.out.println("Módulo / Resto (%): " + (numero1 % numero2));