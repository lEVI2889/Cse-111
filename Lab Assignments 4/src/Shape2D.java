//Task 3
public class Shape2D {
    double area;
    int s1;
    int s2;
    int s3;
    String shape;
    public Shape2D(){
        shape = "Square";
        int s1 = 5;
        System.out.println("A "+shape+" has been created with");
        System.out.println("length: "+ s1);
        area = s1*s1;
    }
    public void area(){
        System.out.println("The area of the "+shape+" is: "+area);
    }
    public Shape2D(int n1, int n2){
        shape = "rectangle";
        System.out.println("A "+shape+" has been created with");
        System.out.println("length: "+ n1+" breadth: "+n2);
        area = n1*n2;
    }
    public Shape2D(int n1, int n2, String a){
        shape = a;
        System.out.println("A "+shape+" has been created with");
        System.out.println("height: "+ n1+" base: "+n2);
        area = .5*n1*n2;
    }
    public Shape2D(int n1, int n2, int n3){
        System.out.println("A "+shape+" has been created with");
        System.out.println("the following sides: "+n1+", "+n2+ ", "+n3);
        double perimetre = (n1+n2+n3)/2.0;
        area = Math.sqrt(perimetre*(perimetre-n1)*(perimetre-n2)*(perimetre-n3));
    }
}
