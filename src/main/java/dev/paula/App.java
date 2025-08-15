package dev.paula;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        TablaDeMultiplicar tabla = new TablaDeMultiplicar();
        int numero = 2;

       System.out.println("Tabla de multiplicar del " + numero + ":");
        tabla.mostrarTabla(numero);
    }
}
