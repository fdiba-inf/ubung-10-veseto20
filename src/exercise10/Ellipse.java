package exercise10;

public class Ellipse extends Figure {
    private Point startPoint;
    private double side1;
    private double side2;

    public Ellipse() {
        
        super(new Point(0,0),1,1);
    }

    public Ellipse(Point startPoint, double side1, double side2) {
       super(new Point(startPoint,side1,side2));

    }

    public Ellipse(Ellipse otherEllipse) {
       super(new Point(otherEllipse.startpoint),otherEllipse.side1,otherEllipse.side2);
      
    }
        @Override
        public double calculatePerimeter() {
        return Math.PI * (3.0 * (side1 + side2) - Math.sqrt((3.0 * side1 + side2) * (side1 + 3.0 * side2)));
    }
    @Override
    public double calculateArea() {
        return Math.PI * side1 * side2;
    }

    @Override
    public String getType() {
        return (side1 == side2) ? "Circle" : "Ellipse";
    }

         @Override
        public boolean equal(Figure otherFigure) {
        if (otherFigure instanceof Ellipse) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }

    public boolean containsClick(Point click) {
        double clickX = click.getX();
        double clickY = click.getY();
        double startX = startPoint.getX();
        double startY = startPoint.getY();
        double solution = Math.pow((clickX - startX), 2) / (side1 * side1) +
                Math.pow((clickY - startY), 2) / (side2 * side2);

        return solution <= 1;
    }

      
    }

