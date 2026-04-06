public class FloatPounds {
    public static void main(String[] args) {
        float twentyPence = 20;
        System.out.println("20 pence = " + twentyPence/100.0 + " pounds");

        for (int i = 0; i < 1000; i++) {
            twentyPence += 20;
        }

        System.out.println("total = " + twentyPence/100.0 + " pounds");
    }
}