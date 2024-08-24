package Set.TreeSet;


import java.util.Comparator;

public class GeneralTicket2 implements Comparable<GeneralTicket2> {
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

    @Override
    public int compareTo(GeneralTicket2 o) {
        int idCompare = Integer.compare(this.id, o.id);
        if (idCompare == 0) {
            return idCompare;
        } else if (idCompare == -1) {
            return -1;
        } else if (idCompare == 1) {
            return 1;
        } else {
            return this.title.compareTo(o.title);
        }
    }
    public class general implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
