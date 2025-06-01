import java.util.function.BiFunction;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("learnign abpuot bifucntion in java functional programming");
        System.out.println("taking number 3 add 1 to it later multiply reust by 3");
        int a = 3;
        BiFunction<Integer,Integer,Integer> add1multiply3 = (n, m) -> (n + 1) * m;
        System.out.println("result of function is: " +add1multiply3.apply(a, 3));
    }
}
