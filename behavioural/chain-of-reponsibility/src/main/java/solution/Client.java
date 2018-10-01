package solution;

public class Client {
    public static void main(String[] args) {
        Handler type1 = new Type1Handler();
        Handler type2 = new Type2Handler();
        Handler type3 = new Type3Handler();
        Handler exceptionHandler = new ExceptionHandler();

        type1.setNext(type2);
        type2.setNext(type3);
        type3.setNext(exceptionHandler);


        type1.handle("Type 1");
    }
}
