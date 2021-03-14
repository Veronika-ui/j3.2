public class Main {
    public static void main(String[] args) {
        int sum = 1000;
        int deposit = 1000;
        if (deposit < 1000) {
            int total = sum + deposit;
            System.out.println(total);
        } else {
            int bonus = deposit / 100;
            int total = sum + deposit + bonus;
            System.out.println(bonus);
            System.out.println(total);
        }



    }
}