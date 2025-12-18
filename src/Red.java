import java.util.ArrayList;

public class Red {
    private ArrayList<Node> nodes;
    
    Red(){
        nodes = new ArrayList<>();
    }

    void agregarNode(Node n){
        if(!nodes.contains(n))
            nodes.add(n);
    }

    void connectar(Node a, Node b){
        a.connectar(b);
        b.connectar(a);
    }

    void mostrar(){
        System.out.println("=== GRAFO ===");
        for (Node n : nodes){
            System.out.println(n.getNombre() + " --> " + n.getVecinos());
        }
    }


}
