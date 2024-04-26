package LibrarySystem;

import java.lang.reflect.Array;
import java.util.*;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        //implement
        for (LibraryMember lm: members){
            for (CheckoutRecordEntry chre: lm.getCheckoutRecord().getCheckoutRecordEntryList() ){
                if (chre.getLendingItem().equals(item)){
                    phoneNums.add(lm.getPhone());
                    break;
                }
            }
        }
        Collections.sort(phoneNums);
        return phoneNums;
    }
}
