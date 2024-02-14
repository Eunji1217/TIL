package ContactManagementProgram.controller;

import ContactManagementProgram.domain.Contact;
import ContactManagementProgram.service.ContactService;

public class ContactController {
    private final ContactService contactService = new ContactService();
    public void start(){
        while (true){
            int option = contactService.inputMode();
            switch (option){
                case 1:
                    contactService.addBusinessContact();
                    break;
                case 2:
                    contactService.addPersonalContact();
                    break;
                case 3:
                    contactService.printContacts();
                    break;
                case 4:
                    contactService.searchContact();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
                    break;
            }
        }
    }
}
