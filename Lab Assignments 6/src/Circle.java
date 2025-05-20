public class Circle {
    static int count = 0;
    private double radius;
    public Circle (int n){
        count++;
        radius = n;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

    public void setRadius(double n) {
        this.radius = n;
    }

    public double getRadius(){
        return radius;
    }
}
