class emp{
    private String emp_name;
    private double emp_salary;

    // setter
    public void setName(String name){
        this.emp_name = name;
    }
    public void setSalary(double salary){
        this.emp_salary = salary;
    }


    // getter
    public String getName(){
        return this.emp_name;
    }

    public double getSalary(){
        return this.emp_salary;
    }




}


public class Encapsulation{
    public static void main(String[]args){
        emp e = new emp();
        e.setName ("Piyush");
        e.setSalary (200000);

        System.out.println(e.getName());
        System.out.println(e.getSalary());
        
    }

    
}