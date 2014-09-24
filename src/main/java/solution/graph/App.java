package solution.graph;

import java.io.*;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App{

    public static void main( String[] args ) throws IOException {
//        List<Trapeze> trapezeList = TrapezeReader.read(new FileReader("data.txt"));
//        System.out.println(trapezeList.size());
//        System.out.println(trapezeList.get(0).checkPoints());

        Random rnd = new Random(System.currentTimeMillis());
        EdgeWeightedDigraph g = new EdgeWeightedDigraph(10);
//        for (int i = 0; i < 9; i++) {
//            for (int j = i+1; j < 10; j++) {
//                double v = rnd.nextDouble();
//                double weight = v * v;
//                g.addEdge(new DirectedEdge(i, j, weight));
//            }
//        }
        g.addEdge(new DirectedEdge(0, 1, 1));
//        g.addEdge(new DirectedEdge(1, 0, 1));
//        g.addEdge(new DirectedEdge(0, 2, 2));
//        g.addEdge(new DirectedEdge(2, 0, 2));
        g.addEdge(new DirectedEdge(1, 2, 3));
//        g.addEdge(new DirectedEdge(2, 1, 3));
        DijkstraAllPairsSP dijkstraAllPairsSP = new DijkstraAllPairsSP(g);
        double path = dijkstraAllPairsSP.dist(0, 2);
        for (DirectedEdge edge: dijkstraAllPairsSP.path(0, 2) ){
            System.out.print(edge.from()+"->"+edge.to() + " ");
        }
        System.out.println();
        System.out.println(path);

    }
}

