public class  StatService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int countBelowAvg(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }
    public int countUpAvg(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
}

