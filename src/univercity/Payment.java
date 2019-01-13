package univercity;

import java.util.Date;

public class Payment {
    private Date datePay;
    private int paySum;

    public Payment() {
        this.datePay = null;
        this.paySum = 0;
    }

    public Payment(Date datePay, int paySum) {
        this.datePay = datePay;
        this.paySum = paySum;
    }

    public Date getDatePay() {
        return datePay;
    }

    public void setDatePay(Date datePay) {
        this.datePay = datePay;
    }

    public int getPaySum() {
        return paySum;
    }

    public void setPaySum(int paySum) {
        this.paySum = paySum;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "datePay=" + datePay +
                ", paySum=" + paySum +
                '}';
    }
}
