package Ennumeration;

public class Execution {
    Days day;

    public Execution(Days day) {
        this.day = day;
    }

    public void SampleMethod() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case TUESDAY:
                System.out.println("Tuesdays are good.");
                break;

            case WEDNESDAY:
                System.out.println("WEdnesdays are okay.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        Execution e1 = new Execution(Days.TUESDAY);
        System.out.println(e1.day);
        e1.SampleMethod();

    }
}
