package ec.edu.taller;

public class IntentoAcceso implements Comparable<IntentoAcceso> {

    private String usuario;
    private String contrasena;
    private int intentosFallidos;
    private String riesgo;
    private boolean bloqueado;

    public IntentoAcceso(String usuario, String contrasena, int intentosFallidos) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.intentosFallidos = intentosFallidos;
        this.riesgo = "BAJO";
        this.bloqueado = false;
    }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public int getIntentosFallidos() { return intentosFallidos; }
    public void setIntentosFallidos(int intentosFallidos) { this.intentosFallidos = intentosFallidos; }
    public String getRiesgo() { return riesgo; }
    public void setRiesgo(String riesgo) { this.riesgo = riesgo; }
    public boolean isBloqueado() { return bloqueado; }
    public void setBloqueado(boolean bloqueado) { this.bloqueado = bloqueado; }

    @Override
    public String toString() {
        return usuario + " | intentos: " + intentosFallidos + " | riesgo: " + riesgo + " | bloqueado: " + bloqueado;
    }

    @Override
    public int compareTo(IntentoAcceso o) {
        return 0;
    }
}
