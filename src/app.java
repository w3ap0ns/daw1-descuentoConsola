import java.util.Scanner;

public class app {

    public static void main(String[] arg){

        /*En el ejercicio 5 (DescuentoConsola) se solicita al usuario el precio
        del artículo y el precio de venta (usa colores para diferenciarlos).*/

        Scanner readln = new Scanner(System.in);

        // Constantes
        final String VERDE = "\u001b[32m";
        // Variables
        double precioArticulo = 0;
        double precioVenta = 0;

        // Operación - Pedir precio del artículo
        System.out.printf("Introduce el precio del artículo:...\n");
        precioArticulo = readln.nextDouble();
        // Operación - Pedir precio de venta del artículo
        System.out.printf("Introduce el precio de venta del artículo:...\n");
        precioVenta = readln.nextDouble();


        // Formula
        double porcentajeVenta = (100-(precioVenta*100)/precioArticulo);

        // Output
        System.out.printf("Un producto que cuenta %.2f y es vendido a %.2f. Su porcentaje de descuento es: %s%.2f%%", precioArticulo , precioVenta , VERDE,porcentajeVenta);


    } //public static void main(String[] arg)

} //public class app
