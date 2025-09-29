package Enum;

public enum Day {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true),
    THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);

    private boolean isWorkingDay;
    Day(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }
    public boolean isWorkingDay() {
        return isWorkingDay;
    }
}
