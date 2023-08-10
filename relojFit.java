package act_reloj;

import java.time.LocalTime;
import java.util.Random;

public class relojFit extends Reloj {


    public relojFit(String modelo, String numSerie) {
        super(modelo, numSerie);
    }

    public void cuentaPasos(int x, int y) {
        LocalTime horaInicio= LocalTime.now();
        int r=x+y;
        System.out.println("pasos realizados: "+r);
    }

    public void frecuencia() {
        Random random= new Random();
        int latidos= random.nextInt(140-60+1)+60;
        System.out.println("frecuencia por minuto: "+latidos);
    }
    
    
}
