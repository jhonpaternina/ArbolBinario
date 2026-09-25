public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();

        // Insertamos productos
        inventario.insertar(50, "Laptop");
        inventario.insertar(30, "Mouse");
        inventario.insertar(70, "Teclado");
        inventario.insertar(20, "USB");
        inventario.insertar(40, "Monitor");
        inventario.insertar(60, "Impresora");
        inventario.insertar(80, "Camara");

        System.out.println("Inventario en orden:");
        inventario.inOrden();

        System.out.println("\nBuscando producto ID 40:");
        if (inventario.buscar(40)) {
            System.out.println("Producto encontrado!");
        } else {
            System.out.println("No encontrado");
        }
    }
}
