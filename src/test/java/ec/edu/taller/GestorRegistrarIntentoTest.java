package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorRegistrarIntentoTest {
 @Test void registrarIntentoValidoDebeRetornarTrueYAsignarRiesgo(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); IntentoAcceso i=new IntentoAcceso("ana","Segura1!",3); assertTrue(g.registrarIntento(i)); assertEquals("ALTO",i.getRiesgo()); assertEquals(1,g.contarIntentosPendientes()); }
 @Test void registrarIntentoNullDebeRetornarFalse(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertFalse(g.registrarIntento(null)); assertEquals(0,g.contarIntentosPendientes()); }
 @Test void registrarUsuarioVacioDebeRetornarFalse(){ assertFalse(new GestorAccesosPrioridad().registrarIntento(new IntentoAcceso("   ","Segura1!",1))); }
 @Test void registrarContrasenaVaciaDebeRetornarFalse(){ assertFalse(new GestorAccesosPrioridad().registrarIntento(new IntentoAcceso("ana","   ",1))); }
 @Test void registrarRiesgoCriticoDebeBloquearUsuario(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); IntentoAcceso i=new IntentoAcceso("ana","Segura1!",5); assertTrue(g.registrarIntento(i)); assertEquals("CRITICO",i.getRiesgo()); assertTrue(i.isBloqueado()); }
}
