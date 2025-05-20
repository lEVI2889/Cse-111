public class ComplexNumber extends RealNumber{
    double num =1.0;
    public ComplexNumber(){
        super(1.0);
    }
    public ComplexNumber(double n1, double n2){
        super(n1);
        num = n2;
    }
    public String toString(){
        System.out.println(super.toString());
        return "ImaginaryPart: "+num;
    }
}
