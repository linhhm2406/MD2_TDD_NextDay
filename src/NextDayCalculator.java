public class NextDayCalculator {

    public static final int MONTH_HAS_30_DAYS = 30;
    public static final int MONTH_HAS_28_OR_29_DAYS = 28;
    public static final int MONTH_HAS_31_DAYS = 31;
    public static final int MAX_DAY = 31;
    public static final int INCREASE_STEP = 1;
    public static final int MAX_MONTH_OF_A_YEAR = 12;
    public static final int FIRST_DAY_OF_MONTH = 1;
    public static final int FIRST_MONTH_OF_YEAR = 1;

    public static String showNextDay(int day, int month, int year) {
        int maxDayOfMonth = MAX_DAY;
        maxDayOfMonth = getMaxDayOfMonth(month);

        if (month == MAX_MONTH_OF_A_YEAR && day == maxDayOfMonth) {
            day = FIRST_DAY_OF_MONTH;
            month = FIRST_MONTH_OF_YEAR;
            year = year + INCREASE_STEP;
        } else {
            if (day < maxDayOfMonth) {
                day = day + INCREASE_STEP;
            } else {
                day = FIRST_DAY_OF_MONTH;
                month = month + INCREASE_STEP;
            }
        }
        return day + "/" + month + "/" + year;
    }

    private static int getMaxDayOfMonth(int month) {
        int maxDayOfMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDayOfMonth = MONTH_HAS_30_DAYS;
                break;
            case 2:
                maxDayOfMonth = MONTH_HAS_28_OR_29_DAYS;
                break;
            default:
                maxDayOfMonth = MONTH_HAS_31_DAYS;
                break;
        }
        return maxDayOfMonth;
    }
}
