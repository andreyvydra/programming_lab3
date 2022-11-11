package people;

public class Guest extends Man implements Visitor {
    private GuestStatuses isHere = GuestStatuses.IS_NOT_COME;
    private GuestStatuses isInvited = GuestStatuses.IS_NOT_INVITED;
    public Guest(String name) {
        super(name);
    }

    public void setIsHere(GuestStatuses isHere) {
        this.isHere = isHere;
    }

    public void setIsInvited(GuestStatuses isInvited) {
        this.isInvited = isInvited;
    }

    public GuestStatuses getIsHere() {
        return isHere;
    }

    public GuestStatuses getIsInvited() {
        return isInvited;
    }

    public void sayThankSomeone(Object someone) {
        System.out.println(this + " сказал спасибо за фрукты " + someone);
    }

    public void getInvitation() {
        this.setIsInvited(GuestStatuses.IS_INVITED);
        System.out.println(this + " получил приглашение на бал");
    }

    public void getToDance() {
        this.setIsHere(GuestStatuses.IS_COME);
        System.out.println(this + " пришёл на бал");
    }

    @Override
    public int hashCode() {
        int result = 14;
        result = result * this.getName().hashCode();
        result = result * this.getIsInvited().hashCode();
        result = result * this.getIsHere().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Guest guest = (Guest) o;
        return this.getName().equals(guest.getName()) &&
                this.getIsHere() == guest.getIsHere() &&
                guest.getIsInvited() == this.getIsInvited();
    }
}
