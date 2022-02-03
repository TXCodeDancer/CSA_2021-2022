
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 2/3/2022
 */

import java.util.ArrayList;

public class DataPurge
{
    public static boolean correctlyFormatted(ArrayList<String> members)
    {
        for(String fullName : members)
        {
            String[] names = fullName.split(" ");
            if(names.length != 2)
                return false;
            String first = names[0];
            String last = names[1];
            String start;
            start = first.substring(0,1);
            if(!start.equals(start.toUpperCase()))
                return false;
            start = last.substring(0,1);
            if(!start.equals(start.toUpperCase()))
                return false;
        }
        return true;
    }

    public static void removeName(ArrayList<String> members, String fullName)
    {
        String[] names = fullName.split(" ");
        String first = null;
        String last = null;
        first = names[0].toLowerCase();
        if(names.length == 2)
            last = names[1].toLowerCase();

        for(String member : members)
        {
            String memberName = member.toLowerCase();

            if(memberName.contains(first))
            {
                System.out.println(member + " was removed.");
                members.remove(member);
                return;
            }
            else if(last != null && memberName.contains(last))
            {
                System.out.println(member + " was removed.");
                members.remove(member);
                return;
            }
        }
    }

    public static void removeDuplicates(ArrayList<String> members)
    {
        for(int i = 0; i < members.size(); i++)
        {
            String member = members.get(i);
            for(int j = i + 1; j < members.size(); j++)
            {
                if(member.equals(members.get(j)))
                {
                    System.out.println(members.get(j) + " was a duplicate and has been removed.");
                    members.remove(j);
                }
            }
        }
    }
}