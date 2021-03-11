public class Lambdatest {

    public void greet(MyLambda myLambda) {
        myLambda.write();
    }

    public static void main(String[] args) {
        
        Lambdatest LT = new Lambdatest();
        MyLambda greeting = () -> System.out.println("Hello World!");
        
        LT.greet(greeting);
        greeting.write();        
}
interface MyLambda {
        public void write();
    }
}