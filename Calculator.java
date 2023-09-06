import java.util.function.*;
public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> { // Делить на ноль не имеем права
        try {
            return x / y;
        } catch (ArithmeticException e) { // Поэтому создаем исключение, если происходит деление на ноль
            System.out.println(
                    "ArithmeticException occured : " + e.getMessage());
        }
        return 0;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}


