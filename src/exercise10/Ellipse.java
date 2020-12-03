package exercise10;

public class Ellipse extends Figure {
    private Point startPoint;
    private double side2;
    private double side1;

    public Ellipse() {
        
        super(new Point(0,0),1,1);
    }

    public Ellipse(Point startPoint, double side2, double side1) {
       super(new Point(startPoint,side2,side1));

    }

    public Ellipse(Ellipse otherEllipse) {
       super(new Point(otherEllipse.startpoint),otherEllipse.side2,otherEllipse.side1);
      
    }

    public boolean isValid() {
        return side2 > 0 && side1 > 0;
    }

    
    

    public double calculatePerimeter() {
        return Math.PI * (3.0 * (side2 + side1) - Math.sqrt((3.0 * side2 + side1) * (side2 + 3.0 * side1)));
    }

    public double calculateArea() {
        return Math.PI * side2 * side1;
    }

    public String getType() {
        return (side2 == side1) ? "Circle" : "Ellipse";
    }

        public boolean equal(Ellipse otherEllipse) {
        boolean sameA = Utils.equals(side2, otherEllipse.side2);
        boolean sameB = Utils.equals(side1, otherEllipse.side1);
        boolean sameAReversed = Utils.equals(side2, otherEllipse.side1);
        boolean sameBReversed = Utils.equals(side1, otherEllipse.side2);

        return (sameA && sameB) || (sameAReversed && sameBReversed);
    }

    public boolean containsClick(Point click) {
        // Check if click point is inside the rectangle

        return false;
    }
}
