package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorConsultarSiguienteRiesgoTest {
 @Test void consultarDebeRetornarMayorRiesgoSinEliminar(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); g.registrarIntento(new IntentoAcceso("ana","Segura1!",0)); g.registrarIntento(new IntentoAcceso("luis","Debil",1)); g.registrarIntento(new IntentoAcceso("maria","Segura1!",5)); IntentoAcceso s=g.consultarSiguienteRiesgo(); assertNotNull(s); assertEquals("maria",s.getUsuario()); assertEquals("CRITICO",s.getRiesgo()); assertEquals(3,g.contarIntentosPendientes()); }
 @Test void consultarConColaVaciaDebeRetornarNull(){ assertNull(new GestorAccesosPrioridad().consultarSiguienteRiesgo()); }
}
