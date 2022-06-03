class Account {
    private double Balance;
    private double totalLoan;
    private double totalAwaitingLoan;
    private String accountName;
    private int loanAwaitingStatus;
    private int maturityPeriod;
    private boolean validity;
    private String Type;

    private boolean interestRate;
    private double serviceCharge;

    Account(){
        Balance = 0;
        accountName = "";
        maturityPeriod = 0;
        loanAwaitingStatus = 0;
        totalLoan = 0;
        totalAwaitingLoan = 0;
        serviceCharge = 0;
        validity = true;
    }

    public void getInfo(){
        System.out.print("Current balance " + Balance + "$");
        if(totalLoan > 0) {
            System.out.print(", loan " + totalLoan + "$");
        }
        System.out.println();
    }

    public void deposit(double amount){
        Balance += amount;
        System.out.println(amount +"$ deposited; current balance " + getBalance() +"$");
    }
    public void withdraw(double amount) {
        if (amount > Balance)
            System.out.println("Error. Insufficient Balance. Try again");
        else {
            Balance -= amount;
            System.out.println("successful withdrawal");
        }
    }

    public void reqLoan(double loan){
        if(loanAwaitingStatus == 1){
            System.out.println("Loan Already Pending. Wait for Approval");
        }
        else{
            //totalLoan += loan;
            totalAwaitingLoan += loan;
            loanAwaitingStatus = 1;
            System.out.println("Loan request successful, sent for approval");
        }
    }
    public void addLoan(){
        totalLoan += totalAwaitingLoan;
        Balance += totalAwaitingLoan;
        loanAwaitingStatus = 0;
        totalAwaitingLoan = 0;
    }
    public void rejectLoan(){
        //totalLoan += totalAwaitingLoan;
        //Balance += totalAwaitingLoan;
        loanAwaitingStatus = 0;
        totalAwaitingLoan = 0;
    }


    public double loanInterest(){
        return totalLoan * 0.1;
    }

    public void addInterest_AfterOneYear(InterestRate currentRule){

    }

    public void serviceChargeDeduction_AfterOneYear(){
        Balance -= serviceCharge;
    }
    public void loanInterestDeduction_AfterOneYear(){
        Balance -= loanInterest();
    }

    // Getters and Setters
    public int getLoanStatus() {
        return loanAwaitingStatus;
    }
    public void setLoanStatus(int loanStatus) {
        this.loanAwaitingStatus = loanStatus;
    }
    public int getMaturityPeriod() {
        return maturityPeriod;
    }
    public void setMaturityPeriod(int maturityPeriod) {
        this.maturityPeriod = maturityPeriod;
    }
    public String getaccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public double getTotalLoan() {
        return totalLoan;
    }
    public void setTotalLoan(double totalLoan) {
        this.totalLoan = totalLoan;
    }
    public boolean getValidity() {
        return validity;
    }
    public void setValidity(boolean validity) {
        this.validity = validity;
    }
    public double getTotalAwaitingLoan() {
        return totalAwaitingLoan;
    }
    public void setTotalAwaitingLoan(double totalAwaitingLoan) {
        this.totalAwaitingLoan = totalAwaitingLoan;
    }
    public boolean getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(boolean interestRate) {
        this.interestRate = interestRate;
    }
    public double getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
}

