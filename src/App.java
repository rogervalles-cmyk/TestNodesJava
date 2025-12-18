public class App {
    public static void main(String[] args) {
        Red red = new Red();

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        red.agregarNode(a);
        red.agregarNode(b);
        red.agregarNode(c);
        red.agregarNode(d);
        red.agregarNode(e);

        //Connectem nodes

        red.connectar(a,b);
        red.connectar(b,c);
        red.connectar(b,d);
        red.connectar(c,d);
        red.connectar(c,e);
        red.connectar(d,e);
        red.mostrar();
    }
}
