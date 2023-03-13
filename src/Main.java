import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 7) {
            System.out.println("Mynday kun jok");
        } else if (a == 7) {
            System.out.println("Have a nice weekend");
        } else
            System.out.print("Item name: ");
        switch (a) {
            case 1:
                String time = "13:30 to 14:30";
                System.out.println("Math" + " Time:" + time);
                break;
            case 2:
                time = "14:30 to 15:30";
                System.out.println("English language" + " Time:" + time);
                break;
            case 3:
                time = "15:30 to 16:30";
                System.out.println("Biology" + " Time:" + time);
                break;
            case 4:
                time = "16:30 to 17:30";
                System.out.println("Chemistry" + " Time:" + time);
                break;
            case 5:
                time = "17:30 to 18:30";
                System.out.println("Geography" + " Time:" + time);
                break;
            case 6:
                time = "18:30 to 19:30";
                System.out.println("Literature" + " Time:" + time);
                break;
        }
    }
}