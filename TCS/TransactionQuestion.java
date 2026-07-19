import java.util.*;

class TransactionQuestion {

    static class Transaction {
        String sender;
        String receiver;
        double amount;
        int time;

        Transaction(String sender, String receiver, double amount, int time) {
            this.sender = sender;
            this.receiver = receiver;
            this.amount = amount;
            this.time = time;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Transaction> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String sender = sc.next();
            String receiver = sc.next();
            double amount = sc.nextDouble();
            int time = sc.nextInt();

            list.add(new Transaction(sender, receiver, amount, time));
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                Transaction t1 = list.get(i);
                Transaction t2 = list.get(j);

                if (t1.sender.equals(t2.sender)
                        && t1.receiver.equals(t2.receiver)
                        && t1.amount == t2.amount
                        && Math.abs(t1.time - t2.time) <= 60) {

                    System.out.println(t2.sender + " "
                            + t2.receiver + " "
                            + t2.amount + " "
                            + t2.time);

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Fraud Transactions");
        }
    }
}