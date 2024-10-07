public class EuroAccount extends Account {
    String currency;

    @Override
    public String toString() {
        return "EuroAccount{" +
                "currency='" + currency + '\'' +
                ", isBlocked=" + isBlocked +
                ", isUnblocked=" + isUnblocked +
                ", sum=" + sum +
                ", typeAccount='" + typeAccount + '\'' +
                '}';
    }
}
