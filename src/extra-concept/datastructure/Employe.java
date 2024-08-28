package extra;

public class Employe {
     private String name;
    private double salary;

    public Employe(String n, double s) {
        name = n;
        salary = s;
    }
//    Employe(){
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increment(int i) {
        salary += salary * i / 100;
    }

}
class Student {
    public static void main(String[] args) {
        Employe e1 = new Employe("Suthan", 1000);
        e1.increment(10);
        System.out.println(e1.getSalary());
        Manager m1 = new Manager("Jeeva", 2000, 0);
        m1.setBonus(1000);
        System.out.println(m1.getSalary());
    }
}
class Manager extends Employe{
    double bonus;
    public Manager(String n, double s, double b){
        super(n, s);
        bonus = b;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary(){ //method overriding because using super class method name
        return super.getSalary()+bonus;
    }
}


