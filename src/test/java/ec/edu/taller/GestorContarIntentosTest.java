package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorContarIntentosTest {
 @Test void contarIntentosPendientesDebeRetornarCantidadCorrecta(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertEquals(0,g.contarIntentosPendientes()); g.registrarIntento(new IntentoAcceso("ana","Segura1!",1)); g.registrarIntento(new IntentoAcceso("luis","Segura1!",3)); assertEquals(2,g.contarIntentosPendientes()); g.atenderSiguienteRiesgo(); assertEquals(1,g.contarIntentosPendientes()); }
}
