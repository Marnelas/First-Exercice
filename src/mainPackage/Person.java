package mainPackage;

/**
 *
 * @author Marnelas
 */
public class Person {
    String name = "";
    int edad = 0;
    String dni;
    String sexo = "H";
    double peso = 0;
    double altura = 0;

    public Person() {
    }

    public Person(String name, int edad, String sexo, double peso, double altura) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Person(String name, int edad, String sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public int CalcularIMC() {
    double alto = this.altura*this.altura;
    double kilos = this.peso;
    double pesoIdeal = kilos/alto;
    if(pesoIdeal < 20){
    return -1;
    }else if(pesoIdeal >= 20 && pesoIdeal <= 25){
    return 0;
    }else{
     return 1;   
    }
    
    
    
    }
    public boolean MayorDeEdad() {
     if(this.edad >= 18){
     return true;
     }   
     return false;
    }

    public String toString() {
        return "esta persona se llama: " + name + ", tiene: " + edad + " años, su dni es: " + dni + ", es de género: " + sexo + ", pesa: " + peso + "kg y mide: " + altura;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    }
    
    
