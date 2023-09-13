package ru.netology.stats;

public class StatsService {

    public int amountSales(int[] sales) {
        int amount = 0;

        for (int month : sales) {
            amount = amount + month;
        }
        return amount;

    }

    public int averageSales(int[] sales) {
        int amount = 0;
        int average;

        for (int month : sales) {
            amount = amount + month;
        }
        average = amount / sales.length;

        return average;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsUnderAverageSales(int[] sales) {
        int average = averageSales(sales);
        int counter = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherAverageSales(int[] sales) {
        int average = averageSales(sales);
        int counter = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                counter++;
            }
        }
        return counter;
    }
}
