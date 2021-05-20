import java.time.LocalDate;

class Transaction {
    private String description;
    private Double amount;
    private LocalDate date;
    
    Transaction(String description, Double amount) {
        this.description = description;
        this.amount=amount;
        this.date = LocalDate.now();
    }

    public static void main(String[] args) {
        Transaction t = new Transaction ("Milk", 3.99);
        System.out.println(t.description + "    " + t.amount + "    " + t.date);
    }
}
