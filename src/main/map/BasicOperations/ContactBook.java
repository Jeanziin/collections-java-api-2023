package main.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

    private Map<String, Integer> bookContactMap;

    public ContactBook() {
        this.bookContactMap = new HashMap<>();
    }

    public void addContact(String name, Integer number){
        bookContactMap.put(name, number);
    }

    public void removeContact(String name){
        if(!bookContactMap.isEmpty()){
            bookContactMap.remove(name);
        }
    }


    public void displayContact(){
        System.out.println(bookContactMap);
    }

    public Integer searchByName(String name){
        Integer numberByName = null;
        if(!bookContactMap.isEmpty()){
            numberByName = bookContactMap.get(name);
        }
        return numberByName;
    }
}
