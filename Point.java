class Point {
    String id;
    double x,y;

    //TODO add new variable
    String color;
    //TODO constructor

    public Point(String id, double x, double y, String color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //TODO setters and getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move (char xDirection, char yDirection) {
        //TODO
        if(xDirection=='L')
            x--;
        else if(xDirection=='R')
            x++;
        if(yDirection=='D')
            y--;
        else if(yDirection=='U')
            y++;
    }

    public void draw () {
        //TODO
        System.out.println("("+x+", "+y+")");
    }



}