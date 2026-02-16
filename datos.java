public class datos {
    private String Marca, Tipo;
    private int Cilindraje, NumCelda;
    private double PagoAn, PagoAc;

    public datos(String marca, String tipo, int cilindraje, int numCelda, double pagoAn, double pagoAc) {
        Marca = marca;
        Tipo = tipo;
        Cilindraje = cilindraje;
        NumCelda = numCelda;
        PagoAn = pagoAn;
        PagoAc = pagoAc;
    }

    public datos() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }

    public int getNumCelda() {
        return NumCelda;
    }

    public void setNumCelda(int numCelda) {
        NumCelda = numCelda;
    }

    public double getPagoAn() {
        return PagoAn;
    }

    public void setPagoAn(double pagoAn) {
        PagoAn = pagoAn;
    }

    public double getPagoAc() {
        return PagoAc;
    }

    public void setPagoAc(double pagoAc) {
        PagoAc = pagoAc;
    }
    
    
    
    
}