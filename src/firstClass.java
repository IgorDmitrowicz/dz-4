public class firstClass {
    public static void main(String[] args) {
        secondClass secondClass = new secondClass();

        int value = secondClass.printAndReturnValue();
        System.out.println("~~~ " + value + " ~~~");
    }
}