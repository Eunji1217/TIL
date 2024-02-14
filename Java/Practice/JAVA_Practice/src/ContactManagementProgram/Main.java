package ContactManagementProgram;

import ContactManagementProgram.controller.ContactController;

public class Main {
    public static void main(String[] args){
        ContactController controller = new ContactController();
        controller.start();

    }
}
