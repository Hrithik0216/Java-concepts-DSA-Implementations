package Set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Execution {
    public static void main(String[] args) {
        Set<GeneralTicket2> generalTicketSet = new TreeSet<>();
        GeneralTicket2 gt = new GeneralTicket2(1, "Sleeper", "Chennai to mumbai", 55);
        GeneralTicket2 gt1 = new GeneralTicket2(2, "AC", "Delhi to Kolkata", 100);
        GeneralTicket2 gt2 = new GeneralTicket2(3, "Sleeper", "Bangalore to Hyderabad", 75);
        GeneralTicket2 gt3 = new GeneralTicket2(4, "First Class", "Mumbai to Goa", 120);
        GeneralTicket2 gt4 = new GeneralTicket2(5, "AC", "Ahmedabad to Jaipur", 90);
        GeneralTicket2 gt5 = new GeneralTicket2(6, "Sleeper", "Chennai to Bangalore", 50);
        GeneralTicket2 gt6 = new GeneralTicket2(7, "Second Class", "Pune to Nagpur", 65);
        GeneralTicket2 gt7 = new GeneralTicket2(8, "First Class", "Kolkata to Bhubaneswar", 110);
        GeneralTicket2 gt8 = new GeneralTicket2(9, "Sleeper", "Lucknow to Patna", 70);
        GeneralTicket2 gt9 = new GeneralTicket2(10, "AC", "Chandigarh to Shimla", 80);
        GeneralTicket2 gt10 = new GeneralTicket2(11, "Second Class", "Coimbatore to Madurai", 60);

       // Treeset cannot have null values
//        generalTicketSet.add(null);
//        generalTicketSet.add(null);
//        generalTicketSet.add(null);


        generalTicketSet.add(gt);
        generalTicketSet.add(gt1);
        generalTicketSet.add(gt2);
        generalTicketSet.add(gt3);
        generalTicketSet.add(gt4);
        generalTicketSet.add(gt5);
        generalTicketSet.add(gt6);
        generalTicketSet.add(gt7);
        generalTicketSet.add(gt8);
        generalTicketSet.add(gt9);
        generalTicketSet.add(gt10);

        boolean check = generalTicketSet.contains(gt10);


        gt10.setDescription("Hello");
        Iterator<GeneralTicket2> itr = generalTicketSet.iterator();

        for (GeneralTicket2 i : generalTicketSet) {
            System.out.println(i.getId() + ", " + i.getTitle());
        }
//        while (itr.hasNext()) {
//            GeneralTicket gte = itr.next();
//            System.out.println(gte.getTitle() + "," + gte.getDescription() + "," + gte.getPrice());
//
//            if(gte.getDescription().equals("Hello")){
//                gte.setDescription("Hello0000");
//            }
//        }

    }
}
