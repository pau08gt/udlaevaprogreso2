package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorContrasenaSeguraTest {
 @Test void contrasenaSeguraDebeRetornarTrue(){ assertTrue(new GestorAccesosPrioridad().esContrasenaSegura("Segura1!")); }
 @Test void contrasenaSinMayusculaDebeRetornarFalse(){ assertFalse(new GestorAccesosPrioridad().esContrasenaSegura("segura1!")); }
 @Test void contrasenaSinMinusculaDebeRetornarFalse(){ assertFalse(new GestorAccesosPrioridad().esContrasenaSegura("SEGURA1!")); }
 @Test void contrasenaSinNumeroDebeRetornarFalse(){ assertFalse(new GestorAccesosPrioridad().esContrasenaSegura("Segura!!")); }
 @Test void contrasenaSinEspecialDebeRetornarFalse(){ assertFalse(new GestorAccesosPrioridad().esContrasenaSegura("Segura12")); }
 @Test void contrasenaCortaONullDebeRetornarFalse(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertFalse(g.esContrasenaSegura("S1!a")); assertFalse(g.esContrasenaSegura(null)); }
}
