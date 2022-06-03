class loanAccount extends Account{

    loanAccount(String name, String type, double initialLoan) {
        //super(name, type, initialDeposit);
        setBalance(0);
        setAccountName(name);
        setType(type);
        setTotalLoan(initialLoan);
        setServiceCharge(0);
        System.out.println("Loan account for " + name +" Created; initial Loan " + initialLoan + "$");
    }
    public void deposit(double amount){
        if(amount <= getTotalLoan()){
            setTotalLoan(getTotalLoan() - amount);
            System.out.println("Deducted from total loan");
            if(getTotalLoan() == 0){
                System.out.println("Loan cleared. Account will be suspended");
                setValidity(false);
            }
        }
        else{
            System.out.println("Deposit amount is more than the total loan. Your total loan is " + getTotalLoan() + "$");
        }

    }
    public void withdraw(double amount){
        System.out.println("Loan accounts are not allowed to withdraw.");
    }

    public void reqLoan(double loan){
        if(getLoanStatus() == 1){
            System.out.println("Loan Already Pending. Waiting for Approval");
        }
        else{
            if(loan <= getTotalLoan()*0.05){
                //setTotalLoan(getTotalLoan() + loan);
                setTotalAwaitingLoan(getTotalAwaitingLoan() + loan);
                setLoanStatus(1);
                System.out.println("Loan request successful, sent for approval");
            }
            else
                System.out.println("loans of upto 5% of total loans are allowed. Your total loan is " + getTotalLoan() + "$");
        }
    }
    public void serviceChargeDeduction_AfterOneYear(){
        setBalance(getBalance());
    }
    public void addLoan(){
            setTotalLoan(getTotalLoan() + getTotalAwaitingLoan());
            setLoanStatus(0);
            setTotalAwaitingLoan(0);
    }
    public void loanInterestDeduction_AfterOneYear(){
        setMaturityPeriod(getMaturityPeriod() + 1);
        setTotalLoan(getTotalLoan() + getTotalLoan() * 0.1);
    }

}