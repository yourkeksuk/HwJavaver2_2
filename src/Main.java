public class Main {
    public static void main(String[] args) {

        int start = 300;     // Начальный счет
        int pay = 1500;      // Сумма пополнения
        int discount = pay / 100;    // Сумма кэшбека

        if (pay > 1000){
            System.out.println("Скидка предоставляется в размере " + (discount) + " рублей");
            System.out.println("Итоговая сумма счета: " + ((start) + (pay) + (discount)) + " рубля(ей)");
        }
    }
}
