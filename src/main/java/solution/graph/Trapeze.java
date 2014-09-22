package solution.graph;

/**
 * Created by damir on 22.09.14.
 */
public class Trapeze {

    Point[] points = new Point[4];

    Trapeze(Point b, Point c, Point d) {
        points[0] = new Point(0,0);
        points[1] = b;
        points[2] = c;
        points[3] = d;
    }

    boolean checkPoints(){
        if(points[3].y!=points[0].y || points[1].y!=points[2].y){
            return false;
        }
        if(points[3].y==points[1].y){
            return false;
        }
        return true;
    }

    int getHeight(){
        return points[1].y - points[0].y;
    }

    int getMaxY(){
        return points[2].y>points[3].y?points[2].y:points[3].y;
    }

}
