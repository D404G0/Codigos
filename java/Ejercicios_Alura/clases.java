import java.util.*;

class Producto {
    String nombre_producto;
    double precio_producto;
    int stock_producto;

    public Producto(String nombre, double precio, int stock) {
        this.nombre_producto = nombre;
        this.precio_producto = precio;
        this.stock_producto = stock;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre_producto);
        System.out.println("Precio: $" + precio_producto);
        System.out.println("Stock: " + stock_producto);
    }
}

class clases {
    public static void main(String[] args) {
        System.out.println("6. Clases y objetos");

        Producto producto_uno = new Producto("Camiseta", 20.5, 100);
        Producto producto_dos = new Producto("Pantalón", 40.0, 50);
        Producto producto_tres = new Producto("Zapatos", 60.0, 30);

        producto_uno.mostrar();
        System.out.println(" ");

        producto_dos.mostrar();
        System.out.println(" ");

        producto_tres.mostrar();
        System.out.println(" ");
    }
}
