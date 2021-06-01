import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class AccountTest {

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Bread",3.99));
        transactions.add(new Transaction("Milk", 2.99));
        transactions.add(new Transaction("Apples",5.99));
        transactions.add(new Transaction("Youghurt", 4.98));
        transactions.add(new Transaction("White Castle Cheeseburgers",11.99));
        transactions.add(new Transaction("Laundry Detergent",13.99));
        transactions.add(new Transaction("Pizza",8.99));
        transactions.add(new Transaction("Icecream",2.50));

        for (Transaction elem : transactions) {
            System.out.println(elem.getDescription() + " " + elem.getAmount());
        }

        BiConsumer<String, Double> p1 = (x, y) -> System.out.println(x + " COSTS " + y);

        transactions.forEach(transaction -> p1.accept(transaction.getDescription(), transaction.getAmount()));

    }
    
}
