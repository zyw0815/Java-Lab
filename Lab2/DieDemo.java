class Die {
    private int faceValue;

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}

public class DieDemo {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        int sum[] = new int[11];
        int totalRolls = 1000;
        for (int i = 0; i < totalRolls; i++) {
            die1.roll();
            die2.roll();
            int nowSum = die1.getFaceValue() + die2.getFaceValue();
            sum[nowSum - 2]++;
        }
        for (int i = 0; i < 11; i++) {
            System.out.println("the percentage of sum " + (i + 2) + ": " + sum[i] * 100.0 / totalRolls + "%");
        }
    }
}