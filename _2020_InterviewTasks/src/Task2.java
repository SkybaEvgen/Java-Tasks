public class Task2 {
    public static void main(String[] args) {
        System.out.println("hi" == new String("Hi").toLowerCase());
        System.out.println("hi" == "Hi".toLowerCase());
        System.out.println("hi" == "hi");
        System.out.println(new String("hi") == new String("hi"));
    }
}
