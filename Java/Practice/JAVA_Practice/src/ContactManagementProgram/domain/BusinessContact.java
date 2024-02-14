package ContactManagementProgram.domain;

public class BusinessContact extends Contact {
    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }
    @Override
    public String toString() {
        return "이름: " + getName() + ", 전화번호: " + getPhoneNumber() + ", 회사명: " + company;
    }
}
