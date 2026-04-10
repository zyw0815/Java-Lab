public class Budget {
    private int budget;
    private int[] keyboard = new int[3];
    private int[] usb = new int[3];

    public Budget(int budget, int[] keyboard, int[] usb) {
        this.budget = budget;
        this.keyboard = keyboard;
        this.usb = usb;
    }

    public int getCost() {
        int Cost = -1;
        int maxCost = -1;
        for (int i = 0; i < this.keyboard.length; i++) {
            for (int j = 0; j < this.usb.length; j++) {
                Cost = this.keyboard[i] + this.usb[j];
                if (Cost > maxCost && Cost <= this.budget) {
                    maxCost = Cost;
                }
            }
        }
        if (maxCost == -1) {
            return -1;
        }
        else {
            return maxCost;
        }
    }

    public static void main(String[] args) {
        int budget = 60;
        int[] keyboard = new int[]{40, 50, 60};
        int[] usb = new int[]{5, 8, 12};
        Budget budgetObj = new Budget(budget, keyboard, usb);
        System.out.println("Maximum cost: " + budgetObj.getCost());
    }
}