package CursoJava.POO.ejercicios;
//programa que permita instanciar productos, como objetos de java,
// ese producto va a tener un string nombre
//double precio y un int stock

//metodos getnombre, setnombre y toString
//metodo void aumentar (int porcentaje)
//en el main vamos a colocar un producto monitor = new monitor("lg",140.000,5 )
//S .... (monitor.toString)
//monitor.aumentar(9)
//S... (monitor.toString)

public class monitor {
    public static void main(String[] args) {

        // creamos un objeto de tipo monitor con el nombre "lg", precio 140.000 y stock 5
        monitor monitor = new monitor("lg",140.000,5 );

        //imprimimos el objeto monitor
        System.out.println(monitor);

        //aumentamos el precio del producto por 9%
        monitor.aumentar(9);

        //imprimimos el objeto monitor nuevamente
        System.out.println(monitor);
    }

    //Declaramos las variables
    private String nombre;
    private double precio;
    private int stock;


    //Define el constructor de la clase monitor que inicializa las variables nombre, precio, y stock.
    public monitor(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

        //Dentro del constructor, this.nombre, this.precio y this.stock asignan los valores proporcionados a las variables de instancia correspondientes.
    }

    //metodo getnombre para obtener el nombre del producto
    public String getnombre() {
        return nombre;
    }

    //metodo setnombre para asignar un nuevo nombre al producto
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo getprecio para obtener el precio del producto
    public double getprecio() {
        return precio;
    }

    //metodo setprecio para asignar un nuevo precio al producto
    public void setprecio(double precio) {
        this.precio = precio;
    }

    //metodo getstock para obtener el stock del producto
    public int getstock() {
        return stock;
    }

    //metodo setstock para asignar un nuevo stock al producto
    public void setstock(int stock) {
        this.stock = stock;
    }

    //override indica que estamos sobreescribiendo el metodo toString de la clase Object
    //override del metodo toString para imprimir los valores de las variables del producto
    @Override
    public String toString() {
        return "monitor: " + "nombre: '" + nombre + '\'' + ", precio=" + precio + ", stock=" + stock;
    }

    //Define el metodo aumentar que aumenta el precio del producto por un porcentaje indicado
    public void aumentar(int porcentaje) {
        precio = precio + (precio * porcentaje / 100);
    }
}

