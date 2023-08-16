package act_reloj;

public class Persona {

    private String nombre;

    private int edad;

    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

  

    public void decirHora(Reloj r1) {
        System.out.println("hora: "+r1.getFecha());
    }

    public void comer(relojFit r2) {
    }

    public void hablar(Reloj r1) {
        System.out.println("hola, buenos dias. la hora es: "+r1.getFecha());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }


}
