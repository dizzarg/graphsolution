package solution.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by damir on 22.09.14.
 */
public class TrapezeReader {

    static List<Trapeze> read(Reader reader){
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Trapeze> trapezeList = new LinkedList<Trapeze>();
        try {
            while (bufferedReader.ready()){
                String line = bufferedReader.readLine();
                String[] row = line.split(" ");
                Point[] points = new Point[3];
                for (int i=0; i<row.length; i+=2){
                    points[i/2] = new Point(Integer.parseInt(row[i]), Integer.parseInt(row[i+1]));
                }
                trapezeList.add(new Trapeze(points[0], points[1], points[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trapezeList;
    }

}
