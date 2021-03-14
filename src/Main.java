public class Main {
    public static void main(String[] args) {
        int sum = 1000;
        int deposit = 1000;
        int bonus;
        int total;
        if (deposit < 1000) {
            total = sum + deposit;
        } else {
            bonus = deposit / 100;
            total = sum + deposit + bonus;
        }
        System.out.println(total);

    }
}