package solution.graph;

/**
 * Created by damir on 22.09.14.
 * граф трапеций
 */
public class DirectedEdge {

    Trapeze from;
    Trapeze to;

    public DirectedEdge(Trapeze from, Trapeze to) {
        this.from = from;
        this.to = to;
    }

    // подсчет веса ребра,
    // растояние между трапециями
    public int weight(){

        return 0;
    }

    public Trapeze getFrom() {
        return from;
    }

    public Trapeze getTo() {
        return to;
    }
}
