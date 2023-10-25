package ru.netology.stats;

public class StatsService {
    public int getAmountSales(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int getAverageSales(int[] sales) {
        int averageSales = getAmountSales(sales) / sales.length;
        return averageSales;
    }

    public int getMaxSales(int[] sales) {
        int maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }
        }
        return maxSales;
    }

    public int getMinSales(int[] sales) {
        int minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
            }
        }
        return minSales;
    }

    public int nMonthSalesBelowAverage(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSales(sales)) {
                count++;
            }
        }
        return count;
    }

    public int nMonthSalesAboveAverage(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSales(sales)) {
                count++;
            }
        }
        return count;
    }
}
