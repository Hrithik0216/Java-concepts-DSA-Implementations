package OOPs_concepts.Static_variable;

public class Implementation {
    public static void main(String[] args) {
        Human rahul = new Human("Rahul",45000,22);
        Human Hrithik = new Human("Hrithik",45000,21);
        Human Arun = new Human("Arun",45000,23);
        System.out.println(Human.population);
    }
}
