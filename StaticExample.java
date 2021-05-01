import java.util.ArrayList;

class StaticExample {

    static String message;
    String message1 = "Yo Universe!";
    private static final ArrayList<String> values = new ArrayList<>();

    static {
        message ="Hello World!";
    }

    public StaticExample() {

    }

    public void show () 
    {
        System.out.println(message);
    }

    public static void main(String[] args) {
        values.add("changed");
        System.out.println(values.get(0));

        StaticExample example = new StaticExample();
        example.show();

        System.out.println(example.message1);

        
    }
    
}