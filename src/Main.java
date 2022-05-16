public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества бонусных рублей:");
        int ontheclientsaccount = 100;
        int phonerecharge = 1100;
        int totalamount = ontheclientsaccount + phonerecharge;
        int x = 1000;
        System.out.println("На счету у клиента - " + ontheclientsaccount + " p");
        System.out.println("Пополнение счета на - " + phonerecharge + " p");
        if (phonerecharge >= 1000) {
            int bonus = phonerecharge / 100;
            System.out.println("Итого на счету - " + (totalamount + bonus) + " p");
            System.out.println("Начисленные бонусы - " + bonus + " p");
        } else {
            System.out.println("Итого на счету - " + totalamount + " p");
            System.out.println("Начисленные бонусы - 0 p");
        }
    }
}
