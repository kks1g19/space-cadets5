import java.util.HashMap;

public class Point {
    private double x;
    private double y;
    private double oX = 0;
    private double oY = 0;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setOrigin(double x, double y){
        this.oX = x;
        this.oY = y;
    }

    public void setOrigin(Point center){
        this.oX = center.getCoords("x");
        this.oY = center.getCoords("y");
    }

    public HashMap<String, Double> getCoords(){
        HashMap<String, Double> coords = new HashMap<String, Double>();
        coords.put("x", this.x + this.oX);
        coords.put("y", this.y + this.oY);
        return coords;
    }

    public Double getCoords(String coord){
        if(coord.matches("(^x$)|(^y$)")){
            return this.getCoords().get(coord);
        } else {
            System.out.println("Error: you can only get x or y.");
            return null;
        }
    }
}