class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    float salary;
    Employee(String n,int a,String p,String ad,float s){
        this.name=n;
        this.age=a;
        this.phoneNumber=p;
        this.address=ad;
        this.salary=s;
    }
    void print_salary()
    {
        System.out.println(salary);
    }
}
class Officer extends Employee{
    String specialization;
    String department;
    Officer(String n,int a,String p,String ad,float s)
    {
        super(n,a,p,ad,s);}
    void printDetails(){
        System.out.print("Name = "+ name +"\nAge = "+age+"\nPhone number = "+phoneNumber+"\nAddress = "+address+"\nSalary = ");
    }
}


class Manager extends Employee{
    String specialization;
    String department;
    Manager(String n,int a,String p,String ad,float s)
    {
        super(n,a,p,ad,s);
    }
    void printDetails(){
        System.out.print("\nName = "+ name +"\nAge = "+age+"\nPhone number = "+phoneNumber+"\nAddress = "+address+"\nSalary = ");
    }
}


public class EmployeeMain {
    public static void main(String[] args) {
        Officer of = new Officer("Rahul",20,"7736475692","XYZ Street, Delhi, India",665656);
        of.printDetails();
        of.print_salary();
        Manager ma = new Manager("Kiran",20,"8899889886","ABC House, New York, USA",686856);
        ma.printDetails();
        ma.print_salary();
    }
}
