public class Manager extends Employee{
    int bonus;
    double salary;
    double base_sal;
    int hours;
    public Manager(String a, double sal, int hrs, int bon){
        super(a,  sal, hrs);
        base_sal = sal;
        salary = sal;
        bonus = bon;
        hours = hrs;
    }
    public void calculateSalary(){
        if(hours>40){
            salary += (bonus * salary) / 100;
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+bonus+"%");
        System.out.println("Final Salary: $"+salary);
        salary=base_sal;
    }
    public void setHoursWorked(int n){
        super.setHoursWorked(n);
        hours = n;
    }
    public void requestIncrement(int n){
        if(hours>100){
            System.out.println("$"+n+" Increment approved.");
            salary+=n;
            base_sal=salary;
            super.setBaseSalary(base_sal);
        }
        else if(hours>80&&hours<=100){
            System.out.println("$"+n/2+" Increment approved.");
            salary+=n/2;
            base_sal = salary;
            setBaseSalary(base_sal);
        }
        else{
            System.out.println("Increment Denied.");
        }
    }
}
