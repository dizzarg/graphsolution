package solution.graph;

import java.io.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App{

    public static void main( String[] args ) throws IOException {
        List<Trapeze> trapezeList = TrapezeReader.read(new FileReader("data.txt"));
        System.out.println(trapezeList.size());
        System.out.println(trapezeList.get(0).checkPoints());
    }
}

