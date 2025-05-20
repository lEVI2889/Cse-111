public class Developer extends Employee {
    String lang;
    double salary;
    public Developer(String a, int sal, int hrs, String b){
        super(a, sal, hrs);
        lang = b;
        salary = sal;
    }
    public void calculateSalary(){
        if(lang.equals("Java")){
            salary+=700;
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+lang);
        System.out.println("Final Salary: "+salary);
    }
}
