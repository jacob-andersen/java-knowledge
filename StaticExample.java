class StaticExample {

    static String message;

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

        StaticExample example = new StaticExample();
        example.show();
        
    }
    
}