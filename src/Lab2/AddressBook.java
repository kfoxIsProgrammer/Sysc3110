package Lab2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public List<BuddyInfo> addressList = new ArrayList<>();

    public void addBuddy(BuddyInfo newBuddy){
        addressList.add(newBuddy);
    }

    public void deleteBuddy(BuddyInfo delBuddy){
        addressList.remove(delBuddy);
    }

    public static void main(String[] args){

        BuddyInfo buddy = new BuddyInfo();
        AddressBook aBook = new AddressBook();
        buddy.setAddress("Carleton");
        buddy.setName("Jim");
        buddy.setPhoneNumber("613");
        aBook.addBuddy(buddy);
        aBook.deleteBuddy(buddy);

    }

}
