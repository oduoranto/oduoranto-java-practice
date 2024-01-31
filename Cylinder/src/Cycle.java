public class Cycle {
    private double radius;

    public Cycle(double radius) {
        if (radius  < 0  ){
            this.radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return ((radius * radius) * Math.PI);
    }
}

class Cylinder extends  Cycle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if(height < 0){
            this.height = 0;
        }
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
