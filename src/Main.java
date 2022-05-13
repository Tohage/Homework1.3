public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества бонусных рублей:");
        int on_the_clients_account = 100;
        int phone_recharge = 1100;
        int total_amount = on_the_clients_account + phone_recharge;
        int x = 1000;
        System.out.println("На счету у клиента - " + on_the_clients_account + " p");
        System.out.println("Пополнение счета на - " + phone_recharge + " p");

        if (phone_recharge >=1000) {
            int bonus = phone_recharge/100;
            System.out.println("Итого на счету - " + (total_amount + bonus) + " p");
            System.out.println("Начисленные бонусы - " + bonus + " p");
        }
        else  {
            System.out.println("Итого на счету - " + total_amount + " p");
            System.out.println("Начисленные бонусы - 0 p");
        }

    }
    }
