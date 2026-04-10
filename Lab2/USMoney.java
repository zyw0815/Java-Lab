public class USMoney {
    private int dollar;
    private int cents;

    public USMoney(int dollar, int cents) {
        this.dollar = dollar + (cents / 100);
        this.cents = cents % 100;
        if (this.cents < 0){
            this.dollar -= 1;
            this.cents += 100;
        }
    }

    public USMoney plus(USMoney other) {
        int totalDollar = this.dollar + other.dollar;
        int totalCents = this.cents + other.cents;
        // Create and return a new USMoney object with the total dollars and cents
        return new USMoney(totalDollar, totalCents);
    }

    @Override
    public String toString() {
        return "$" + dollar + "." + (cents < 10 ? "0" : "") + cents;
    }

    public static void main(String[] args) {
        USMoney m1 = new USMoney(5, 80);
        USMoney m2 = new USMoney(2, 50);

        USMoney total = m1.plus(m2);
        System.out.println("Total: " + total);
    }
}