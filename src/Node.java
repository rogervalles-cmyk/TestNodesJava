import java.util.ArrayList;
public class Node {
    
    private String nombre;
    private ArrayList<Node> vecinos;

    public Node(String nombre){
        this.nombre = nombre;
        this.vecinos = new ArrayList<>();
    }

    public void connectar(Node otro){
        if(!vecinos.contains(otro))
            vecinos.add(otro);
    }

    public String getNombre(){
        return nombre;
    }

    public String getVecinos(){
        String temp = "";
        
        for (Node v : vecinos){
            temp += "[" + v.getNombre() + "] - ";
        }

        return temp;
    }

}
