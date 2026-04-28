package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorCalcularRiesgoTest {
 @Test void usuarioBloqueadoDebeSerCritico(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); IntentoAcceso i=new IntentoAcceso("ana","Segura1!",1); i.setBloqueado(true); assertEquals("CRITICO",g.calcularRiesgo(i)); }
 @Test void cincoOMasIntentosDebeSerCritico(){ assertEquals("CRITICO",new GestorAccesosPrioridad().calcularRiesgo(new IntentoAcceso("ana","Segura1!",5))); }
 @Test void tresOCuatroIntentosDebeSerAlto(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertEquals("ALTO",g.calcularRiesgo(new IntentoAcceso("ana","Segura1!",3))); assertEquals("ALTO",g.calcularRiesgo(new IntentoAcceso("luis","Segura1!",4))); }
 @Test void intentosBajosConContrasenaDebilDebeSerMedio(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertEquals("MEDIO",g.calcularRiesgo(new IntentoAcceso("ana","12345",1))); assertEquals("MEDIO",g.calcularRiesgo(new IntentoAcceso("luis","12345",0))); }
 @Test void contrasenaSeguraConPocosIntentosDebeSerBajo(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertEquals("BAJO",g.calcularRiesgo(new IntentoAcceso("ana","Segura1!",0))); assertEquals("BAJO",g.calcularRiesgo(new IntentoAcceso("luis","Segura1!",2))); }
}
