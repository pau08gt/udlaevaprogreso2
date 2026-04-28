package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorAtenderSiguienteRiesgoTest {
 @Test void atenderDebeRespetarPrioridadDeRiesgo(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); g.registrarIntento(new IntentoAcceso("ana","Segura1!",0)); g.registrarIntento(new IntentoAcceso("luis","Segura1!",3)); g.registrarIntento(new IntentoAcceso("maria","Segura1!",5)); assertEquals("maria",g.atenderSiguienteRiesgo().getUsuario()); assertEquals("luis",g.atenderSiguienteRiesgo().getUsuario()); assertEquals("ana",g.atenderSiguienteRiesgo().getUsuario()); }
 @Test void atenderConMismaPrioridadDebeAtenderMasIntentosFallidosPrimero(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); g.registrarIntento(new IntentoAcceso("ana","Segura1!",3)); g.registrarIntento(new IntentoAcceso("luis","Segura1!",4)); assertEquals("luis",g.atenderSiguienteRiesgo().getUsuario()); assertEquals("ana",g.atenderSiguienteRiesgo().getUsuario()); }
 @Test void atenderConColaVaciaDebeRetornarNull(){ assertNull(new GestorAccesosPrioridad().atenderSiguienteRiesgo()); }
}
