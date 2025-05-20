//Task 8
public class Employee {
    public String name;
    public double salary = 30000.0;
    public double new_salary = 0;
    public String designation = "junior";
    public double tax;
    public boolean eligible = false;
    public boolean promotion = false;
    public void newEmployee(String str){
        this.name = str;
    }
    public void displayInfo(){
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Salary: " + this.salary + " TK");
        System.out.println("Employee Designation: "+ this.designation);

    }
    public void calculateTax(){
        if(salary > 30000.00){
            this.eligible=true;
        }
        if(this.eligible){
            if (salary > 30000.00 && salary < 50000.00) {
                tax = salary * (10 / 100d);
            } else if (salary > 50000.00) {
                tax = salary * (30 / 100d);
            }
        }
        else {
            System.out.println("No need to pay tax");
        }
        if(promotion){
            System.out.println(this.name+" Tax Amount: "+this.tax +" TK");
        }
    }
    public void promoteEmployee(String str2){
        System.out.println(this.name+" has been promoted to "+str2);
        this.promotion = true;
        if(this.promotion){
            if(str2.equals("senior")){
                this.new_salary= this.salary+25000.00;
            }
            else if(str2.equals("lead")){
                this.new_salary= this.salary+50000.00;
            }
            else if(str2.equals("manager")){
                this.new_salary= this.salary+75000.00;
            }
        }
        if(this.promotion){
            System.out.printf("New Salary: %.2f TK %n" , this.new_salary );
        }
        this.salary = this.new_salary;
        this.designation=str2;
    }
}
