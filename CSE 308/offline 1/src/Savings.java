class SavingsAccount extends Account {

    SavingsAccount(String name, String type, double initialDeposit) {
        //super(name, type, initialDeposit);
        setAccountName(name);
        setType(type);
        setBalance(initialDeposit);
        setValidity(true);
        setServiceCharge(500);
        System.out.println("Savings account for " + name +" Created; initial balance " + initialDeposit + "$");
    }
    public void withdraw(double amount){
        double result = getBalance() - amount;
        if (result < 1000){
            System.out.println("results in deposit less than 1000. try again");
        }
        else{
            setBalance(getBalance() - amount);
            System.out.println("withdrawal successful");
        }
    }
    public void reqLoan(double loan){
        if(getLoanStatus() == 1){
            System.out.println("Loan Already Pending. Waiting for Approval");
        }
        else{
            if(loan <= 10000){
                //setTotalLoan(getTotalLoan() + loan);
                setTotalAwaitingLoan(getTotalAwaitingLoan() + loan);
                setLoanStatus(1);
                System.out.println("Loan request successful, sent for approval");
            }
            else
                System.out.println("Max loan of 10000$ allowed.");
        }
    }
    public void addInterest_AfterOneYear(InterestRate currentRule){
        setMaturityPeriod(getMaturityPeriod() + 1);
        double rate = currentRule.getSavingsInterest();
        setBalance(getBalance() + getBalance()*rate);
    }
}