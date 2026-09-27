public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();

        // Insertamos productos
        inventario.Insertar(50, "Laptop");
        inventario.Insertar(30, "Mouse");
        inventario.Insertar(70, "Teclado");
        inventario.Insertar(20, "USB");
        inventario.Insertar(40, "Monitor");
        inventario.Insertar(60, "Impresora");
        inventario.Insertar(80, "Camara");

        System.out.println("Inventario en orden:");
        inventario.RecorridoInorden();

        System.out.println("\nBuscando producto ID 40:");
        if (inventario.Buscar(40) != null) {
            System.out.println("Producto encontrado!");
        } else {
            System.out.println("No encontrado");
        }
    }
}