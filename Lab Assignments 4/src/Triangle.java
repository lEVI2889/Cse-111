//Task 5
public class Triangle {
    int side1, side2, side3;
    boolean same_add= false;
    boolean same_side= false;
    boolean same_perimeter = false;
    public Triangle(){
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }
    public void updateSides(int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;
    }
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: "+side1+", "+side2+", "+side3);
        System.out.println("Perimeter: "+ (side1+ side2+ side3));
    }
    public String printTriangleType(){
        if (side1==side2&&side2==side3&&side3==side1){
            return "This is an Equilateral Triangle.";
        }
        else if (side1!=side2&&side2!=side3&&side3!=side1){
            return "This is an Scalene Triangle.";
        }
        else{
            return "This is an Isosceles Triangle.";
        }
    }
    public void compareTrinagles(Triangle a){
        if(this == a){
            same_add = true;
        }
        if(this.side1==a.side1&&this.side2==a.side2&this.side3==a.side3){
            same_side = true;
        }
        if((this.side1+this.side2+this.side3)==(a.side1+a.side2+a.side3)){
            same_perimeter = true;
        }

        if(same_add){
            System.out.println("These two triangle objects have the same address.");
        }
        else if(!same_add&&!same_side&&same_perimeter){
            System.out.println("Only the perimeter of both triangles is equal.");
        }
        else if(!same_add&&same_side){
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        }
        else{
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }
}
