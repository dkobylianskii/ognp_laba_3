import java.util.ResourceBundle;

public class Haloo {
    ResourceBundle messages = ResourceBundle.getBundle("messages");

    public static void main(String[] args) {
        Haloo hello = new Haloo();
        System.out.println(hello.sayHello());
    }
    String sayHello() {
        return messages.getString("hello.world");
    }
}
