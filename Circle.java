
package InterfaceComparable;


public  class Circle extends GeometricObject {
 double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }
    
   @Override
    public int compareTo(Circle o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   @Override
    public double getArea(){
        return radius*radius*3.1415;
    }
    @Override
    public double getPerimeter()
    {
        return radius*2*3.1415;
    }
   
    public int compareto(Circle a){
        if (getArea()<a.getArea())
            return -1;
        else
            if (getArea()==a.getArea())
                return 0;
            else
                return 1;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", filled=" + filled +'}';
    }

    
}



    



