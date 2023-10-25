package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void amountSales() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.getAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.getAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int expected = 20;
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int expected = 7;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthSalesBelowAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.nMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthSalesAboveAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.nMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}