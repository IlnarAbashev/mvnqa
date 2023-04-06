package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int salesAmount = 0;

        for (int i=0; i < sales.length; i++) {
            salesAmount += sales[i];
        }
        return salesAmount;
    }

    public int average(int[] sales) {
        int salesAmount = sum(sales);
        int averageSales = salesAmount / 12;
        return averageSales;
    }

    public int maxMonthSales(int[] sales) {
        int maxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int minMonthSales(int[] sales) {
        int minSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int minMonthAverage(int[] sales) {
        int counter = 0;

        for (int sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int maxMonthAverage(int[] sales) {
        int counter = 0;

        for (int sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
