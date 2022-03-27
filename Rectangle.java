
package InterfaceComparable;

public class Rectangle extends GeometricObject  {
 double width,height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height +", color=" + color + ", filled=" + filled +'}';
    }
     @Override
    public double getArea(){
        return width*height;
    }
     @Override
    public double getPerimeter()
    {
        return (width+height)*2;
    }
    public int compareto(Rectangle a){
        if (getPerimeter()<a.getPerimeter())
            return -1;
        else
            if (getPerimeter()==a.getPerimeter())
                return 0;
            else
                return 1;
    }
   
  
    
    
}
