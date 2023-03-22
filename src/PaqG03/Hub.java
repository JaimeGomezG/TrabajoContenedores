package PaqG03;

public class Hub {

    private Contenedor[][] hub;

    public Hub() {
        hub = new Contenedor[10][12];
    }

    public Contenedor[][] getHub() {
        return hub;
    }

    public void setHub(Contenedor[][] hub) {
        this.hub = hub;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 12; columna++) {
                if (hub[fila][columna] == null) {
                    sb.append("[ ] ");
                } else {
                    sb.append("[")
                            .append(hub[fila][columna].getPrioridad())
                            .append("] ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void apilarContenedor(Contenedor contenedor) {
        int columna = 0;
        if (contenedor.getPrioridad() == 1) {
            columna = 0;
        } else if (contenedor.getPrioridad() == 2) {
            columna = 1;
        } else {
            columna = 2;
            while (columna < 12 && hub[0][columna] != null) {
                columna++;
            }
        }
        if (columna < 12) {
            int fila = 0;
            while (fila < 10 && hub[fila][columna] != null) {
                fila++;
            }
            if (fila < 10) {
                hub[fila][columna] = contenedor;
            }
        }
    }

    public void desapilarContenedor(int columna) {
        for (int fila = 9; fila >= 0; fila--) {
            if (hub[fila][columna] != null) {
                hub[fila][columna] = null;

            }
        }
    }

    public void mostrarContenedor(int Id) {
        boolean encontrado = false;
        while(encontrado=false) {
            for (int fil = 0; fil < 10; fil++) {
                for (int col = 0; col < 12; col++) {
                    if (hub[fil][col] != null && hub[fil][col].getId() == Id) {
                        System.out.println(hub[fil][col].toString());
                        encontrado = true;
                    }
                }
            }
            if (!encontrado) {
                System.out.println("Contenedor no encontrado.");
            }
        }
    }

    public int calcularContenedoresPorPais(String pais ) {
        int contador = 0;
        for (int fil = 0; fil < 10; fil++) {
            for (int col = 0; col < 12; col++) {
                if (hub[fil][col]!= null && hub[fil][col].getPais().equals(pais)) {
                    contador++;
                }
            }
        }
        return contador;
    }

}
