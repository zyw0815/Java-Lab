public class RandomSimulation {
    public static void main(String[] args) {
        int totalTimes = 1000;
        int count = 0;
        for (int i = 0; i < totalTimes; i++) {
            double x = Math.random();
            if (x > 0.5) {
                count++;
            }
        }
        System.out.println("the percentage of values greater than 0.5: " + count*100.0/totalTimes + "%");
    }
}