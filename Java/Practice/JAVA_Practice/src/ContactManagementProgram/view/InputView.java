package ContactManagementProgram.view;

import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }
    public int inputModeOption(){
        return scanner.nextInt();
    }
    public String inputString(){
        return scanner.next();
    }
}
