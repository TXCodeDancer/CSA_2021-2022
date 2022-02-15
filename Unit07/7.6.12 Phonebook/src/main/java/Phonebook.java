
/*
 ** @author Rick Brunson, Team Brunson Software, LLC
 ** @created 2/3/2022
 */

import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact)
    {
        sortAdd(contact);
    }

    private void sortAdd(Contact contact)
    {

        for(int i = contacts.size() - 1; i >= 0 ; i--)
        {
            String name = contacts.get(i).getName();

            if(contact.getName().compareTo(name) > 0)
            {
                contacts.add(i + 1, contact);
                return;
            }
        }
        contacts.add(0, contact);
    }

    public void printPhonebook()
    {
        for(Contact contact: contacts)
        {
            System.out.println(contact.getName());
        }
    }


}

