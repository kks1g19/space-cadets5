class SpiroGrapher {
    public static String getCoords(String[] args, double t, Point origin) {
        Point A;
        A = getXY(args, t, origin);
        return ("<circle cx=\"" + A.getCoords("x") + "\" cy=\"" + A.getCoords("y") + "\" r=\".5\" stroke=\"red\" stroke-width=\".5\" fill=\"red\"/>");
    }

    private static Point getXY(String[] args, double t, Point origin){
        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double e = Double.parseDouble(args[2]);
        if(r < R){
            double k = R/r;
            double l = e/r;
            double x;
            double y;
            Point A = null;

            x = R * ((1-k) * (double) Math.cos(t) + (l * k) * (double) Math.cos(((1-k)/k)*t));
            y = R * ((1-k) * (double) Math.sin(t) + (l * k) * (double) Math.sin(((1-k)/k)*t));
            A = new Point(x, y);
            A.setOrigin(origin);
            return A;
        } else {
            System.out.println("Error: inner circle cannot have bigger radius than outer circle.");
            System.exit(1);
            return null;
        }
    }
}