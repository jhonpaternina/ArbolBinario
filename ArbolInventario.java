public class ArbolInventario {
    Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

    // Método para insertar
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) {
            return new Producto(id, nombre);
        }
        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        } else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        }
        return actual;
    }

    // Método para buscar
    public boolean buscar(int id) {
        return buscarRecursivo(raiz, id) != null;
    }

    private Producto buscarRecursivo(Producto actual, int id) {
        if (actual == null || actual.id == id) {
            return actual;
        }
        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        } else {
            return buscarRecursivo(actual.derecho, id);
        }
    }

    // Recorrido InOrden (ordenado)
    public void inOrden() {
        inOrdenRecursivo(raiz);
    }

    private void inOrdenRecursivo(Producto nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.println("ID: " + nodo.id + " - Nombre: " + nodo.nombre);
            inOrdenRecursivo(nodo.derecho);
        }
    }
}