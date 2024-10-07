public class BynAccount extends Account{
    String currency;

    @Override
    public String toString() {
        return "BynAccount{" +
                "currency='" + currency + '\'' +
                ", isBlocked=" + isBlocked +
                ", isUnblocked=" + isUnblocked +
                ", sum=" + sum +
                ", typeAccount='" + typeAccount + '\'' +
                '}';
    }
}
