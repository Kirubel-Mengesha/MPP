package LibrarySystem;

import java.util.*;

public class CheckoutRecord {
    List<CheckoutRecordEntry> checkoutRecordEntryList;

    public CheckoutRecord(){
        checkoutRecordEntryList = new ArrayList<>();
    }
    public List<CheckoutRecordEntry> getCheckoutRecordEntryList() {
        return checkoutRecordEntryList;
    }

    public  void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry){
        checkoutRecordEntryList.add(checkoutRecordEntry);
    }
}
