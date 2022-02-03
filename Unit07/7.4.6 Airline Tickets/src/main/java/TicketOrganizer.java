/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 1/31/2022
 */
import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }

    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }

    public void printPassengersByBoardingGroup()
    {
        for(int group = 1; group <= 5; group++)
        {
            System.out.println("Boarding Group " + group + ":");
            for(int p = 0; p < tickets.size(); p++)
            {
                AirlineTicket ticket = tickets.get(p);
                if(ticket.getBoardingGroup() == group)
                    System.out.println("Passenger " + (p + 1));
            }
        }
    }

    public void canBoardTogether()
    {
        boolean foundMatch = false;
        for(int p = 0; p < tickets.size() - 1; p++)
        {
            AirlineTicket p1 = tickets.get(p);
            AirlineTicket p2 = tickets.get(p + 1);

            if(p1.getRow() == p2.getRow() && p1.getBoardingGroup() == p2.getBoardingGroup())
            {
                System.out.println("Passenger " + (p + 1) + " can board with Passenger " + (p + 2));
                foundMatch = true;
            }
        }
        if(!foundMatch)
            System.out.println("There are no passengers with the same row and boarding group.");

    }
}