package ec.edu.taller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GestorExisteUsuarioTest {
 @Test void existeUsuarioDebeRetornarTrueSiExiste(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); g.registrarIntento(new IntentoAcceso("ana","Segura1!",1)); assertTrue(g.existeUsuario("ana")); }
 @Test void existeUsuarioDebeRetornarFalseSiNoExiste(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); g.registrarIntento(new IntentoAcceso("ana","Segura1!",1)); assertFalse(g.existeUsuario("luis")); }
 @Test void existeUsuarioConNullOVacioDebeRetornarFalse(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertFalse(g.existeUsuario(null)); assertFalse(g.existeUsuario("")); assertFalse(g.existeUsuario("   ")); }
 @Test void registrarUsuarioDuplicadoDebeRetornarFalse(){ GestorAccesosPrioridad g=new GestorAccesosPrioridad(); assertTrue(g.registrarIntento(new IntentoAcceso("ana","Segura1!",1))); assertFalse(g.registrarIntento(new IntentoAcceso("ana","Otra1!",5))); assertEquals(1,g.contarIntentosPendientes()); }
}
