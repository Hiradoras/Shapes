public class Square extends Rectangle
{
    public Square(double side) {
        super();
        side =1;
    }

    public Square(double width, double length) {
        super(width, length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }


}