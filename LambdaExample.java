public class LambdaExample {
    
    interface LambdaInterface {
        public void lambdaMethod();
    }
        public static void main(String[] args) {

            LambdaInterface LambdaInstance = () -> System.out.println("Hello World!");

            LambdaInterface AnotherLambdaInstance = () -> System.out.println("Shout out to the universe!!!");
            
            LambdaInstance.lambdaMethod();

            // Behold the magic of Lambda's!!! Because a Lambda expression defines the CONTENTS of the Lambda method,
            // 2 different implementations can use the same method with different results, AS LONG AS the interface
            // contract is not broken, that is, the number of parameters does not differ.

            AnotherLambdaInstance.lambdaMethod();
        
        }
    }