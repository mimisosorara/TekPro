package Exercise2;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "A Square with side=" + getWidth()
                + ", which is a subclass of " +  super.toString();
    }
}
