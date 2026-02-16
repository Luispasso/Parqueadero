import java.util.Scanner;
public class principal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("Ingrese la dimension del patio");
        n = sc.nextInt();
        datos r [] = new datos[n];
        r = m.LlenarRegistros(r);
        r = m.CalcularNuevoPago(r);
        m.MostrarRegistros(r);
    }
}
