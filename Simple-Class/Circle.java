public class Circle {
    double radius; 

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius; 
    }

    public double getRadius(){
        return this.radius; 
    }

    public double getArea(){
        return Math.PI * (this.radius) * (this.radius);
    }
}
