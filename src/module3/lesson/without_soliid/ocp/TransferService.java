package module3.lesson.without_soliid.ocp;

public class TransferService {
    public boolean transfer(Transfer transfer) {
        if (transfer.transactionType().equals("uzcard_humo")) {
            //....
        } else if (transfer.transactionType().equals("humo_uzcard")) {
            //....
        }
        return true;
    }
}
