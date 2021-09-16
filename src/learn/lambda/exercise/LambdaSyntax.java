package learn.lambda.exercise;

public class LambdaSyntax {

    public String method() {
        return "Hello World";
    }

    // Same thing
    Lambda lambda = (s) -> System.out.println(s);

    interface Lambda {
        void method(String s);
    }
}
