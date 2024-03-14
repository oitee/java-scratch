package Section14;


interface NormalInterface{
    boolean test(int n);
}
interface GenericInterface<T>{
    T func(T t);
}

public class LambdaExpressions101 {
    public static void main(String[] args) {
        NormalInterface isIntEven;
        isIntEven = (n) -> n % 2 == 0;

        GenericInterface<Integer> intTwice;
        GenericInterface<String> strTwice;
        intTwice = (n) -> n + n;
        strTwice = (s) -> s + s;
        System.out.println(isIntEven.test(100));
        System.out.println(intTwice.func(100));
        System.out.println(strTwice.func("100"));

        //Testing with passing a lambda as an argument
        boolean result = takesLambdaAsArgument((n) -> n % 1 == 0, 10);
        System.out.println(result);
    }
    static boolean takesLambdaAsArgument(NormalInterface i, int n){
        return i.test(n);
    }
}
