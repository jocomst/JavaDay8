package Counter;

public class App4 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(7);
        counter1.decrease();
        counter1.increase();
        counter2.increase(8);
        counter2.decrease(4);
        System.out.println(counter1.value() + " " + counter2.value());
    }
}
