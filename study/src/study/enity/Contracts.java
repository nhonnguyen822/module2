package study.enity;

public class Contracts {
    private String contractId;
    private String bookingCode;
    private int deposit;
    private int totalPayment;

    public Contracts(String contractId, String bookingCode, int deposit, int totalPayment) {
        this.contractId = contractId;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contracts{" +
                "contractId=" + contractId +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                '}';
    }

    public  String convertToString() {
        return this.contractId + "," + this.bookingCode + "," +this.deposit + "," +this.totalPayment;
    }


}
