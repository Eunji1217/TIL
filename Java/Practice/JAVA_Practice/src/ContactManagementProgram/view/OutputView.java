package ContactManagementProgram.view;

import ContactManagementProgram.domain.AddressBook;
import ContactManagementProgram.domain.Contact;

import java.util.List;
import java.util.Scanner;

import static ContactManagementProgram.util.Constant.*;

public class OutputView {
    public void showMenuOption() {
        System.out.print(MODE_REQ);
    }

    public void showAddName() {
        System.out.print(NAME_REQ);
    }

    public void showAddAddress() {
        System.out.print(ADDRESS_REQ);
    }

    public void showAddBusiness() {
        System.out.print(BUSINESS_REQ);
    }

    public void showAddPersonal() {
        System.out.print(RELATION_REQ);
    }
    public void showSearchName(){
        System.out.print(FIND_REQ);
    }
    public void showContact(Contact contact){
        System.out.println(contact.toString());
    }
    public void showNoContact(){
        System.out.println(NO_RES);
    }
    public void showNullContact(){
        System.out.println(NULL_RES);
    }
}
