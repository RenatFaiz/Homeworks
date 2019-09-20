package homework_1;

/*  ДЗ 1: Расход топлива
 *  Напишите программу, которая запрашивает
 *  расход топлива на 100 км и объём
 *  имеющегося топлива.
 *  На выходе - приблизительная оценка
 *  расстояния, на которое хватит топлива.
 */

import java.util.Scanner;

public class Fuel {

    public static void main(String[] args) {
        final int LENGTH_FACTOR = 100; // константа 100 км

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий объём топлива в литрах");
        double fuel = in.nextDouble();
        System.out.println("Введите расход топлива Вашего автомобиля");
        System.out.println("в литрах на 100 км");
        double fuelConsumption = in.nextDouble();
        double length = (fuel / fuelConsumption) * LENGTH_FACTOR;
        System.out.println("Вы сможете проехать ещё " +
                Math.floor(length) + " км");
    }
}
