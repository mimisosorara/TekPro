package Kasus1;

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;  // Initialize totalSales to 0
    }
    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }
    @Override
    public double pay() {
        double payFromHours = super.pay();
        double commissionPay = totalSales * commissionRate;
        totalSales = 0.0;  // Reset totalSales after calculating commission
        return payFromHours + commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales;
    }
}

