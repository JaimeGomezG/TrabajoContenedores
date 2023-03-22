package PaqG03;

public class Contenedor {

    int id;
    int peso;
    String pais;
    boolean inspeccionado;
    int prioridad;
    String descripcionContenido;
    String empresaEnvia;
    String empresaRecibe;

    // Constructor
    public Contenedor(int id, int peso, String pais, boolean inspeccionado, int prioridad, String descripcionContenido, String empresaEnvia, String empresaRecibe) {
        if(prioridad<1||prioridad>3){
            System.out.println("Prioridad debe de ser 1,2 o 3");
        }else if(descripcionContenido.length()>100){
            System.out.println("Descripción tiene un máximo de 100 caracteres");
        }else if (empresaEnvia.length()>20){
            System.out.println("El nombre de la empresa que envia el contenedor tiene un máximo de 20 caracteres");
        }else if (empresaRecibe.length()>20){
            System.out.println("El nombre de la empresa que recibe el contenedor tiene un máximo de 20 caracteres");
        }else {
            this.id = id;
            this.peso = peso;
            this.pais = pais;
            this.inspeccionado = inspeccionado;
            this.prioridad = prioridad;
            this.descripcionContenido = descripcionContenido;
            this.empresaEnvia = empresaEnvia;
            this.empresaRecibe = empresaRecibe;
        }
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isInspeccionado() {
        return inspeccionado;
    }

    public void setInspeccionado(boolean inspeccionado) {
        this.inspeccionado = inspeccionado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if(prioridad<1||prioridad>3){
            System.out.println("Prioridad debe de ser 1,2 o 3");
        }else this.prioridad = prioridad;
    }

    public String getDescripcionContenido() {
        return descripcionContenido;
    }

    public void setDescripcionContenido(String descripcionContenido) {
        if(descripcionContenido.length()>100){
            System.out.println("Descripción tiene un máximo de 100 caracteres");
        }else this.descripcionContenido = descripcionContenido;
    }

    public String getEmpresaEnvia() {
        return empresaEnvia;
    }

    public void setEmpresaEnvia(String empresaEnvia) {
        if (empresaEnvia.length()>20){
            System.out.println("El nombre de la empresa que envia el contenedor tiene un máximo de 20 caracteres");
        }else this.empresaEnvia = empresaEnvia;
    }

    public String getEmpresaRecibe() {
        return empresaRecibe;
    }

    public void setEmpresaRecibe(String empresaRecibe) {
        if (empresaRecibe.length()>20){
            System.out.println("El nombre de la empresa que recibe el contenedor tiene un máximo de 20 caracteres");
        }else this.empresaRecibe = empresaRecibe;
    }

    // Método para imprimir los datos del contenedor
    @Override
    public String toString() {
        return "Contenedor{" +
                "id=" + id +
                ", peso=" + peso +
                ", pais='" + pais + '\'' +
                ", inspeccionado=" + inspeccionado +
                ", prioridad=" + prioridad +
                ", contenido='" + descripcionContenido + '\'' +
                ", empresaEnvia='" + empresaEnvia + '\'' +
                ", empresaRecibe='" + empresaRecibe + '\'' +
                '}';
    }
}

