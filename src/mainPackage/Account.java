package mainPackage;

/**
 *
 * @author Marnelas
 */
public class Account {
    String titular;
    double cantidad = 0;

    public Account(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Account(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "esta cuenta tiene como titular a: " + titular + ", la cantidad almacenada ahora mismo es: " + cantidad + '}';
    }
    
    public void ingresar(double cantidad) {
        if(cantidad > 0){
        this.cantidad += cantidad;
        }

    }


    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
        if(this.cantidad < 0){
        this.cantidad = 0;
        }
        
    }
}

    
    

    
        
        
        

