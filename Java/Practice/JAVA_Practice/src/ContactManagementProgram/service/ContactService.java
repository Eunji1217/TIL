package ContactManagementProgram.service;

import ContactManagementProgram.domain.*;
import ContactManagementProgram.view.InputView;
import ContactManagementProgram.view.OutputView;

import java.util.List;

public class ContactService {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private  AddressBook addressBook = new AddressBook();
    public BusinessContact addBusinessContact(){
        if(addressBook == null){
            addressBook = new AddressBook();
        }
        outputView.showAddName();
        String name = inputView.inputString();
        outputView.showAddAddress();
        String phoneNumber = inputView.inputString();
        outputView.showAddBusiness();
        String company = inputView.inputString();
        BusinessContact contact = new BusinessContact(name,phoneNumber,company);
        addressBook.addContact(contact);
        return contact;
    }
    public PersonalContact addPersonalContact(){
        if(addressBook == null){
            addressBook = new AddressBook();
        }
        outputView.showAddName();
        String name = inputView.inputString();
        outputView.showAddAddress();
        String phoneNumber = inputView.inputString();
        outputView.showAddPersonal();
        String relationship = inputView.inputString();
        PersonalContact contact = new PersonalContact(name,phoneNumber,relationship);
        addressBook.addContact(contact);
        return contact;
    }

    public int inputMode(){
        outputView.showMenuOption();
        int mode = inputView.inputModeOption();
        return mode;
    }
    public void printContacts(){
        List<Contact> contacts = addressBook.getContacts();
        if(contacts.isEmpty()){
            outputView.showNullContact();
            return;
        }
        for(Contact contact : contacts){
            outputView.showContact(contact);
        }
    }
    public void searchContact(){
        List<Contact> contacts = addressBook.getContacts();
        outputView.showSearchName();
        String name = inputView.inputString();
        for(Contact contact : contacts){
            if(contact.getName().equals(name)){
                outputView.showContact(contact);
                return;
            }
        }
        outputView.showNoContact();
    }
}
