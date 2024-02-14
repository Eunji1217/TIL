package ContactManagementProgram.domain;

import ContactManagementProgram.domain.Contact;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public List<Contact> getContacts(){
        return contacts;
    }
}
