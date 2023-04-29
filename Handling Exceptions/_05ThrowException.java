public class _05ThrowException {
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("Not valid");
        else
        System.out.println("Valid t0 vote");
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("Nothing");
    }
}
