public class Peson {
    private Status status;
    private String fullName;
    private Bank bank;

    public Peson() {
    }

    public Peson(Status status, String fullName, Bank bank) {
        this.status = status;
        this.fullName = fullName;
        this.bank = bank;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Peson{" +
                "status=" + status +
                ", fullName='" + fullName + '\'' +
                ", bank=" + bank +
                '}';
    }
}
