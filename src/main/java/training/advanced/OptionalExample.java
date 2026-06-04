package training.advanced;
import java.util.Optional;
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.orElse("Default Value"));
    }
}
