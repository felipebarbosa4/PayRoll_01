package payrollovertime;

public class Housekeeping {

    private String name;
    private int hours;
    private final int work_week = 40;
    private final double overtime = 1.5;

    public Housekeeping() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public int getWork_week() {
        return work_week;
    }

    public double getOvertime() {
        return overtime;
    }

    public double calculatePay() {
        double calculatePay;
        double rate = 15.00;
        if (hours > work_week) {
            calculatePay = ((work_week * rate) + (hours - work_week) * rate * overtime);
        }
        else {
            calculatePay = hours * rate;
        }
        return calculatePay;
    }

}
