package OOPs_concepts.Static_variable;

public class Human {

    int age;
    String Name;
    int salary;
    static int population=0;
    public int getAge() {
        return age;
    }

    static void printHlello(){
        System.out.println("Hlello");
        this.age
    }
    public Human(String name, int salary, int age) {
        Name = name;
        this.salary = salary;
        this.age = age;
        Human.population++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
