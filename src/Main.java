public class Main {
    public static void main(String[] args) {
        int basicAccount = 250; // На счету у клиента 250 рублей
        int depositAmount = 4800; // Сумма пополнения счета клиента - 4800 рублей
        int finalAccount;
        if (depositAmount >= 1000) { // Бонусы начинают работать при пополнении счета более, чем на 1000 рублей
            finalAccount = basicAccount + depositAmount + depositAmount / 100; // За каждые 100 рублей при пополнении - 1 рубль бонуса
        } else {
            finalAccount = basicAccount + depositAmount;
        }
        System.out.println("На Вашем счету " + finalAccount + " рублей");
    }
}
