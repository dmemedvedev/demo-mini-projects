public class Bank {
    public static void main(String[] args) {
        EuroAccount euroAccount = new EuroAccount();
            euroAccount.currency = "EUR";
            euroAccount.sum = 5000;
            euroAccount.typeAccount = "debet";
            if(euroAccount.sum>0) {
                euroAccount.isBlocked = false;
                euroAccount.isUnblocked = true;
            }
            else {
                euroAccount.isBlocked = true;
                euroAccount.isUnblocked = false;
        }
        System.out.println(euroAccount);
    }
}
