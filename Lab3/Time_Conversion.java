import java.util.Scanner;

class Conversion {
    private String part1,part2 = new String();

    public String con (String part1, String part2) {
        if (part2.equals("AM")) {
            if (part1.equals("12:00:00")) {
                return "00:00:00";
            }
            else {
                return part1;
            }
        }
        else {
            if (part1.equals("12:00:00")) {
                return part1;
            }
            else {
                int hour = Integer.parseInt(part1.substring(0, 2)) + 12;
                return hour + part1.substring(2);
            }
        }
    }
}

public class Time_Conversion {
    public static void main(String[] args) {
        String str = new String();
        String part1,part2 = new String();

        System.out.println("Input:");
        try (Scanner sc = new Scanner(System.in)) {
            str = sc.nextLine();
        }
        catch(Exception e) {
            System.err.println(e);
        }

        part1 = str.substring(0, 8);
        part2 = str.substring(8);
        System.out.println("Output:");

        Conversion c = new Conversion();
        System.out.println(c.con(part1, part2));
    }
}