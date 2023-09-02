package main.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class setOfGuests {
    private Set<Guest> setGuest;

    public setOfGuests() {
        this.setGuest = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode){
        this.setGuest.add(new Guest(name, invitationCode));

    }

    public void removeGuestByCode(Integer invitationCode){
        Guest invitedToRemove = null;

        for(Guest guest : setGuest){
            if(guest.getInvitationCode() == invitationCode){
                invitedToRemove = guest;
                break;
            }
        }
        setGuest.remove(invitedToRemove);
    }

    public Integer countGuests(){
        return setGuest.size();
    }

    public void displayGuest(){
        System.out.println(setGuest);
    }
}
