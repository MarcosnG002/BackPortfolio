package logica;

public class Persona {
    private String nombre;
    private String posicion;
    private String ubicacion;
    private String imagenUrl;

    public Persona() {
    }

    public Persona(String nombre, String posicion, String ubicacion, String imagenUrl) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.ubicacion = ubicacion;
        this.imagenUrl = imagenUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    
    
}
