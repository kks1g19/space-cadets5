import java.io.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        double STEP = Math.PI * 0.005;

        double t = 0;
        String coords;
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[4]));
        writer.write("<svg version=\"1.1\" baseProfile=\"full\" width=\"900\" height=\"800\" xmlns=\"http://www.w3.org/2000/svg\">" + "\r\n");
        while (t < (Float.parseFloat(args[3]) * Math.PI)){
            coords = SpiroGrapher.getCoords(args, t, new Point(400, 400));
            writer.append(coords + "\r\n");
            t+= STEP;
        }
        writer.append("</svg>");
        writer.close();
    }
}