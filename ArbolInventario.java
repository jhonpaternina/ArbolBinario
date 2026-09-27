public class ArbolInventario {
    Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

    // Para que funcione con Insertar y con insertar
    public void Insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }
    public void insertar(int id, String nombre) {
        Insertar(id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) return new Producto(id, nombre);
        if (id < actual.id) actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        else if (id > actual.id) actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        return actual;
    }

    public Producto Buscar(int id) {
        return BuscarRecursivo(raiz, id);
    }
    public Producto buscar(int id) {
        return Buscar(id);
    }

    private Producto BuscarRecursivo(Producto actual, int id) {
        if (actual == null || actual.id == id) return actual;
        if (id < actual.id) return BuscarRecursivo(actual.izquierdo, id);
        else return BuscarRecursivo(actual.derecho, id);
    }

    public void RecorridoInorden() {
        RecorridoInordenRecursivo(raiz);
    }
    public void RecorridoInOrden() {
        RecorridoInorden();
    }

    private void RecorridoInordenRecursivo(Producto nodo) {
        if (nodo != null) {
            RecorridoInordenRecursivo(nodo.izquierdo);
            System.out.println("ID: " + nodo.id + " - " + nodo.nombre);
            RecorridoInordenRecursivo(nodo.derecho);
        }
    }
}