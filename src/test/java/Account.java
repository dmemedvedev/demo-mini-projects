public class Account {
    boolean isBlocked;
    boolean isUnblocked;
    int sum;
    String typeAccount;

    @Override
    public String toString() {
        return "Account{" +
                "isBlocked=" + isBlocked +
                ", isUnblocked=" + isUnblocked +
                ", sum=" + sum +
                ", typeAccount='" + typeAccount + '\'' +
                '}';
    }
}

