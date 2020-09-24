package Lab2;

public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();
        BuddyInfo buddy = new BuddyInfo();

        buddy.setName("Matt");
        buddy.setAddress("5555 address lane");
        buddy.setPhoneNumber("613-555-5555");

        sb.append(buddy.getName() != null? "Hello: "+buddy.getName(): "You have no name");
        sb.append(buddy.getAddress()!= null ?"\nYour address is: " + buddy.getAddress() :"\n");
        sb.append(buddy.getPhoneNumber() != null ?"\nYour phone number is: " + buddy.getPhoneNumber() :"\n");

        System.out.println(sb.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
