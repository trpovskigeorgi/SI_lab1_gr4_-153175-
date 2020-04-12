import java.util.ArrayList;
import java.util.List;

class canvasFeature {
    List<Point> points;

    public canvasFeature() {
        points=new ArrayList<>();
    }
    public void addPoint(Point p){
        points.add(p);
    }
    public void removePoint(Point p){
        points.remove(p);
    }
    public void moveAll(char xDir, char yDir){
        for(Point p: points)
            p.move(xDir, yDir);
    }
    public String midPoint(){
        int n=points.size();
        double sumX=0, sumY=0;
        for(Point p: points){
            sumX+=p.getX();
            sumY+=p.getY();
        }
        double x=sumX/n;
        double y=sumY/n;

        return "("+x+", "+y+")";
    }
}