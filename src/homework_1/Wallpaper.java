package homework_1;

/* ДЗ 2: Калькулятор обоев
 * Напишите программу, которая запрашивает
 * все необходимые данные согласно методике,
 * для упрощения считайте, что комната
 * прямоугольной формы, без дверей и окон.
 */

import java.util.Scanner;

public class Wallpaper {

    public static void main(String[] args) {

        final double WALLPAPER_WIDTH = 1.06;
        final double WALLPAPER_LENGTH = 10;

        Scanner in = new Scanner(System.in);
        System.out.println("Единица измерения: метры");
        System.out.println("Введите длину комнаты");
        double roomLength = in.nextDouble();
        System.out.println("Введите ширину комнаты");
        double roomWidth = in.nextDouble();
        double perimeter = (roomLength + roomWidth) * 2;
        System.out.println("Введите высоту комнаты");
        double roomHeight = in.nextDouble() + 0.1; // добавляем запас 10 см

        // число полотнищ (кусков рулона) для комнаты
        int papersQuantity = (int) Math.round(perimeter / WALLPAPER_WIDTH);

        // число полотнищ в рулоне
        int papersInRoll = (int) (WALLPAPER_LENGTH / roomHeight);

        // число рулонов всего
        int RollsQuantity = Math.round(papersQuantity / papersInRoll);

        System.out.println("Вам понадобится " + RollsQuantity +
                " рулонов(а) для оклейки комнаты");
        System.out.println("Успешного Вам ремонта!");
    }
}
