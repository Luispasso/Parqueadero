import java.util.Scanner;
public class metodos 
{
    public datos[] LlenarRegistros(datos[] r)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r.length; i++) 
        {
           datos o = new datos();
           System.out.println("Ingrese la marca"); 
           o.setMarca(sc.next());
           System.out.println("Ingrese el tipo del vehiculo");
           o.setTipo(sc.next());
           System.out.println("Ingrese el cilindraje");
           o.setCilindraje(sc.nextInt());

           if(o.getCilindraje() > 900 && o.getCilindraje() < 1700)
              o.setPagoAn(150.00);
            else if(o.getCilindraje() >= 1700 && o.getCilindraje() < 2000)
                o.setPagoAn(200.000);
            else
                o.setPagoAn(250.000);

            o.setNumCelda(i + 1);
            r[i] = o;
        }
            return r;   
    }

    public datos[] CalcularNuevoPago(datos[] r)
    {
        for (int i = 0; i < r.length; i++) 
        {
           r[i].setPagoAc((r[i].getPagoAn() * 0.23) + r[i].getPagoAn()); 
        }
          return r;
    }

    public void MostrarRegistros(datos[] r)
    {
        for (int i = 0; i < r.length; i++) 
        {
            System.out.println("Marca: " + r[i].getMarca());
            System.out.println("Tipo Vehiculo: " + r[i].getTipo());
            System.out.println("Cilindraje: " + r[i].getCilindraje());
            System.out.println("Pago Anterior : " + r[i].getPagoAn());
            System.out.println("Pago Actual : " + r[i].getPagoAc());
            System.out.println("Numero de Celda: " + r[i].getNumCelda());
            System.out.println("-------------------------------------");
        }
    }
}