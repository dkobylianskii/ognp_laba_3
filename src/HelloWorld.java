import java.util.ResourceBundle;

public class HelloWorld {
    ResourceBundle messages = ResourceBundle.getBundle("messages");

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHello());
    }
    String sayHello() {
        return messages.getString("hello.world");
    }
}
