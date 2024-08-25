package Set.TreeSet;


import java.util.Comparator;

public class GeneralTicket2 {
   public static class TicketComparator implements Comparator<GeneralTicket2> {
        @Override
        public int compare(GeneralTicket2 t1, GeneralTicket2 t2) {
//            public int compare(GeneralTicket2 t1, GeneralTicket2 t2) {
//                return Integer.compare(t1.getPrice(), t2.getPrice());
//            }
            //The above can be used if only one parameter to compare of integer tpe
            if (t1.getPrice() > t2.getPrice()) {
                return 1;
            } else if (t1.getPrice() < t2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    private int id;
    private String title;
    private String description;
    private int price;

    public GeneralTicket2(int id, String title, String description, int price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
