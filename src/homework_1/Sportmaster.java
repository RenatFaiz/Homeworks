package homework_1;

/* ДЗ 3: Спортмастер
 * Напишите сервис, который рассчитывает бонусы по карте Спортмастер.
 * Что у вас есть (исходные данные):
 * общая стоимость всех предыдущих покупок
 * стоимость текущей покупки
 * Нужно вычислить бонус за текущую покупку исходя из условий, описанных по ссылке.
 * https://www.sportmaster.ru/misc/pages/clubpro/about.do
 */

public class Sportmaster {

    public static void main(String[] args) {
        // копейки не учитываются
        int bonus;
        final int PURCHASE_STEP = 1000; // шаг покупки в 1000 руб
        int purchaseValue = 1999; // стоимость текущей покупки
        int totalPurchases = 1; // общая стоимость всех предыдущих покупок


        if (totalPurchases >= 1 && totalPurchases <= 15_000) {
            bonus = (purchaseValue / PURCHASE_STEP) * 50; // размер бонуса по синей карте
            System.out.println(bonus);
        }
        if (totalPurchases >= 15_001 && totalPurchases <= 150_000) {
            bonus = (purchaseValue / PURCHASE_STEP) * 70; // размер бонуса по серебряной карте
            System.out.println(bonus);
        }
        if (totalPurchases > 150_000) {
            bonus = (purchaseValue / PURCHASE_STEP) * 100; // размер бонуса по золотой карте
            System.out.println(bonus);
        }
    }
   /* Метод для вывода бонуса. Так мы это ещё не проходили, решил обойтись без него
    static void printBonus(int bonus) {
        System.out.println(bonus);
    }
    */
}
