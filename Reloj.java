package act_reloj;

import java.time.LocalDateTime;

public class Reloj {
    
    protected LocalDateTime fecha;
    protected String modelo;
    protected String numSerie;

    public Reloj(String modelo, String numSerie) {
        this.fecha = LocalDateTime.now();
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void mostarHora() {
        System.out.printf("Hora Actual: %s\n", fecha.toLocalTime().toString());
    }

    public void mostarFecha() {
        System.out.printf("Hora Actual: %s\n", fecha.toLocalDate().toString());
    }

    public void incrementarDia() {
        LocalDateTime nuevaFecha = fecha.plusDays(1);
        fecha = nuevaFecha;
    }

    public void incrementarHora() {
        LocalDateTime nuevaFecha = fecha.plusHours(1);
        fecha = nuevaFecha;
    }

    public String getModelo(Reloj r1) {
        return modelo;
    }

    public String getNumSerie(Reloj r1) {
        return numSerie;
    }

    public void limpiarPantalla() {

    }

    public void traducirFrecuncia() {
    }

}
