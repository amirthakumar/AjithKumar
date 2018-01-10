package in.vamsoft.jdk8;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InBuildFunctionInterface {

  public static void main(String[] args) {
    
    Predicate<Integer> evenOrOdd =(x) -> x % 2== 0? true :false;
    System.out.println("Is !0 is Even Or Odd :" +(evenOrOdd.test(10)?"10 is Even":"10 is odd"));
    
    Consumer<String> upperDisplay=str -> System.out.println(str.toUpperCase());
    upperDisplay.accept("Hello Ajith");
    
    Function<String, Integer> findLength=(str) -> str.length();
    System.out.println("Length of Ajith Kumar"+ findLength.apply("Ajith kumar"));

    Supplier<String> getDayOfWeek =() -> LocalDate.now().getDayOfWeek().name();
    System.out.println("Today is : "+ getDayOfWeek.get());
  }
}
