public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interest;
    private String contactNumber;

    public Loan() {
        this("", 0, 0, "");
    }

    public Loan(String borrower, int amount, double interest, String contactNumber) {
        setBorrower(borrower);
        setAmount(amount);
        setInterest(interest);
        setContactNumber(contactNumber);
        setPaid(false);
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public int getAmount() {
        return amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getInterest() {
        return interest;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
