public class Secondary {
    public int number = 3;

    public String printAndReturn(){
        String result = String.format("---< %d >---", number);
        System.out.println(result);
        return result;
    }
}

