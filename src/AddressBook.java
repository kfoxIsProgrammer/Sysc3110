import BuddyInfo;

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
        System.out.println("Address Book");
    }

}
