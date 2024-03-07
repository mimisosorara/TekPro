package store;

public class Cashier extends AbstractStoreEmployee {

    private double commissionRate;

    public Cashier(double commissionRate, double numberOfHoursWorked, double hourlyRate,
                   String storeDetails, String employeeName, double basePay) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        double regularPay = getNumberOfHoursWorked() * getHourlyRate();
        return regularPay + calculateCommission();
    }

    @Override
    public double calculateCommission() {
        if (getCommissionRate() > 15) {
            return super.getBasePay() * COMMISSION_RATE;
        } else {
            return 0.0;
        }
    }



    @Override
    public boolean checkPromotionEligibility() {
        if (calculatePay() > 12500.0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getEmployeeID() {
        return "C-"+getEmployeeName().length();
    }

    @Override
    public double getTax() {
        return TAX;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
