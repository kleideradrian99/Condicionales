package enumerados;

public enum Constantes {

    MENSAJE_CUADRO("Esto es un mensaje"),
    MENSAJE_TITLE("TITLO MENSAJE"),
    MENSAJE_DOLAR_ALTO("El dola esta alto"),
    MENSAJE_DOLAR_BAJO("El Dolar esta Bajo");
    private String mensaje;

    Constantes(String s) {
        this.mensaje = s;
    }


    public String getMensaje() {
        return mensaje;
    }
}
