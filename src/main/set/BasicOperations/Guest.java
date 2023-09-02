package main.set.BasicOperations;

import java.util.Objects;

public class Guest {
    private String name;
    private Integer invitationCode;

    public Guest(String name, Integer invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public Integer getInvitationCode() {
        return invitationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return Objects.equals(getInvitationCode(), guest.getInvitationCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvitationCode());
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", invitationCode=" + invitationCode +
                '}';
    }
}
