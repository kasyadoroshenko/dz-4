public class Main {
    public static void main(String[] args) {
        Secondary secondary = new Secondary();
        String string = secondary.printAndReturn();
        System.out.println(string + "updated");
    }
}