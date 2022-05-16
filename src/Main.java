public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества бонусных рублей:");
        int onTheClientsAccount = 100;
        int phoneRecharge = 1100;
        int totalAmount = onTheClientsAccount + phoneRecharge;
        int x = 1000;
        System.out.println("На счету у клиента - " + onTheClientsAccount + " p");
        System.out.println("Пополнение счета на - " + phoneRecharge + " p");
        if (phoneRecharge >= 1000) {
            int bonus = phoneRecharge / 100;
            System.out.println("Итого на счету - " + (totalAmount + bonus) + " p");
            System.out.println("Начисленные бонусы - " + bonus + " p");
        } else {
            System.out.println("Итого на счету - " + totalAmount + " p");
            System.out.println("Начисленные бонусы - 0 p");
        }
    }
}
