/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 1/31/2022
 */

import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();

    public void add(Musician artist)
    {
        if(!artist.getIsPlatinum())
        {
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
            return;
        }

        if(top10.size() < 10)
        {
            top10.add(artist);
        }
        else
        {
            replace(artist);
        }
    }

    private void replace(Musician artist)
    {
        int lowestIdx = lowestRank();
        Musician lowestRank = top10.get(lowestIdx);
        if(lowestRank.getWeeksInTop40() < artist.getWeeksInTop40())
        {
            top10.remove(lowestRank);
            top10.add(lowestIdx, artist);

            System.out.println("The musician " + lowestRank.getName() + " has been replaced by " + artist.getName() + ".");
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }

    private int lowestRank()
    {
        int lowestRank = Integer.MAX_VALUE;
        int lowestIdx = -1;

        for(int i = 0; i < top10.size(); i++)
        {
            int weeks = top10.get(i).getWeeksInTop40();
            if(weeks < lowestRank)
            {
                lowestRank = weeks;
                lowestIdx = i;
            }
        }

        return lowestIdx;
    }




    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}