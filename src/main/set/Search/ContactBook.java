package main.set.Search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {

    private Set<Contact> setContact;

    public ContactBook() {
        this.setContact = new HashSet<>();
    }

    public void addContact(String name, Integer contact) {
        this.setContact.add(new Contact(name, contact));
    }

    public void displayContact() {
        System.out.println(setContact);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();
        if (!setContact.isEmpty()) {
            for (Contact contact : setContact) {
                if (contact.getName().startsWith(name)) {
                    contactsByName.add(contact);
                }
            }

        }

        return contactsByName;
    }


    public Contact updateContact(String name, Integer newNumber){
        Contact updateContact = null;

        for (Contact contact : setContact){
            if(contact.getName().equalsIgnoreCase(name)){
                contact.setNumber(newNumber);
                updateContact = contact;
                break;
            }
        }
        return  updateContact;
    }
}

