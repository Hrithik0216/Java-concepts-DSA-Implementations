package Set.LinkedHashSet_Implementation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exection {
    public static void main(String[] args) {
        Set<GeneralTicket> generalTicketSet = new LinkedHashSet<>();
        GeneralTicket gt = new GeneralTicket(1, "Sleeper", "Chennai to mumbai", 55);
        GeneralTicket gt1 = new GeneralTicket(2, "AC", "Delhi to Kolkata", 100);
        GeneralTicket gt2 = new GeneralTicket(3, "Sleeper", "Bangalore to Hyderabad", 75);
        GeneralTicket gt3 = new GeneralTicket(4, "First Class", "Mumbai to Goa", 120);
        GeneralTicket gt4 = new GeneralTicket(5, "AC", "Ahmedabad to Jaipur", 90);
        GeneralTicket gt5 = new GeneralTicket(6, "Sleeper", "Chennai to Bangalore", 50);
        GeneralTicket gt6 = new GeneralTicket(7, "Second Class", "Pune to Nagpur", 65);
        GeneralTicket gt7 = new GeneralTicket(8, "First Class", "Kolkata to Bhubaneswar", 110);
        GeneralTicket gt8 = new GeneralTicket(9, "Sleeper", "Lucknow to Patna", 70);
        GeneralTicket gt9 = new GeneralTicket(10, "AC", "Chandigarh to Shimla", 80);
        GeneralTicket gt10 = new GeneralTicket(11, "Second Class", "Coimbatore to Madurai", 60);



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
        Iterator<GeneralTicket> itr = generalTicketSet.iterator();

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
