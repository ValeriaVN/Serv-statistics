package ru.netology.stats;

public class StatsService {

    public int salesAmount(int [] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int salesAverage(int [] sales) {
        return salesAmount(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int belowMonth = 0;
        for (int sale : sales) {
            if (sale < salesAverage(sales)) {
                belowMonth ++;
            }
        }
        return belowMonth;
    }

    public int aboveAverage(int[] sales) {
        int aboveMonth = 0;
        for (int sale : sales) {
            if (sale > salesAverage(sales)) {
                aboveMonth ++;
            }
        }
        return aboveMonth;
    }
}
