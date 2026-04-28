package ec.edu.taller;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class GestorListarOrdenadosTest {
 @Test void listarIntentosOrdenadosDebeRespetarPrioridadSinModificarCola(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); g.registrarIntento(new IntentoAcceso("ana","Segura1!",0)); g.registrarIntento(new IntentoAcceso("luis","Segura1!",3)); g.registrarIntento(new IntentoAcceso("maria","Segura1!",5)); List<IntentoAcceso> lista=g.listarIntentosOrdenados(); assertEquals(3,lista.size()); assertEquals("maria",lista.get(0).getUsuario()); assertEquals("luis",lista.get(1).getUsuario()); assertEquals("ana",lista.get(2).getUsuario()); assertEquals(3,g.contarIntentosPendientes()); assertEquals("maria",g.consultarSiguienteRiesgo().getUsuario()); }
}
