import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Transaction {
    private String description;
    private Double amount;
    private LocalDate date;

    Transaction(String description, Double amount) {
        this.description = description;
        this.amount = amount;
        this.date = LocalDate.now();
    }

    

    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public Double getAmount() {
        return amount;
    }



    public void setAmount(Double amount) {
        this.amount = amount;
    }



    public LocalDate getDate() {
        return date;
    }



    public void setDate(LocalDate date) {
        this.date = date;
    }



    public static void main(String[] args) {
        List<Transaction> trList = new ArrayList<Transaction>();
        for (int i = 0; i < 10; i++) {
            trList.add(new Transaction("Milk", 3.99));
        }

        for (Transaction t : trList) {
            System.out.println(t.description + "    " + t.amount + "    " + t.date);
        }
    }
}
