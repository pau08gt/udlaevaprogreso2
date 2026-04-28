package ec.edu.taller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class GestorAccesosPrioridad {

    private PriorityQueue<IntentoAcceso> colaPrioridad;

    public GestorAccesosPrioridad() {
        this.colaPrioridad = new PriorityQueue<>();
    }


    private int obtenerValorPrioridad(String riesgo) {
        if ("CRITICO".equals(riesgo)) return 1;
        if ("ALTO".equals(riesgo)) return 2;
        if ("MEDIO".equals(riesgo)) return 3;
        return 4;
    }

    public boolean esContrasenaSegura(String contrasena) {
        // TODO: implementar validación de contraseña segura
        return false;
    }

    public String calcularRiesgo(IntentoAcceso intento) {
        // TODO: implementar reglas de cálculo de riesgo
        return "BAJO";
    }

    public boolean registrarIntento(IntentoAcceso intento) {
        // TODO: implementar registro con validaciones
        return false;
    }

    public boolean existeUsuario(String usuario) {
        // TODO: verificar usuario duplicado
        return false;
    }

    public IntentoAcceso consultarSiguienteRiesgo() {
        // TODO: consultar sin eliminar
        return null;
    }

    public IntentoAcceso atenderSiguienteRiesgo() {
        // TODO: atender y eliminar de la cola
        return null;
    }

    public int contarIntentosPendientes() {
        // TODO: retornar cantidad pendiente
        return 0;
    }

    public List<IntentoAcceso> listarIntentosOrdenados() {
        // TODO: retornar lista ordenada sin modificar cola
        return new ArrayList<>();
    }
}
