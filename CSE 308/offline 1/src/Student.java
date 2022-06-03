class StudentAccount extends Account{

    StudentAccount(String name, String type, double initialDeposit) {
        //super(name, type, initialDeposit);
        setAccountName(name);
        setType(type);
        setBalance(initialDeposit);
        setValidity(true);
        setServiceCharge(500);
        System.out.println("Student account for " + name +" Created; initial balance " + initialDeposit + "$");
    }

    public void withdraw(double amount){
        if(amount > 10000){
            System.out.println("Invalid Transaction; current balance " + getBalance() +"$");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient Balance. Try again");
        } else{
            setBalance(getBalance() - amount);
            System.out.println("withdrawal successful");
        }
    }
    public void reqLoan(double loan){
        if(loan <= 1000){
            if(getLoanStatus() == 1){
                System.out.println("Loan Already Pending. Waiting for Approval");
            }
            else{
                //setTotalLoan(getTotalLoan() + loan);
                setTotalAwaitingLoan(getTotalAwaitingLoan() + loan);
                setLoanStatus(1);
                System.out.println("Loan request successful, sent for approval");
            }
        }
        else
            System.out.println("Max loan of 1000$ allowed.");


    }
    public void addInterest_AfterOneYear(InterestRate currentRule){
        setMaturityPeriod(getMaturityPeriod() + 1);
        double rate = currentRule.getStudentInterest();
        //System.out.println("rate is " + rate + "balance is " + getBalance());
        setBalance(getBalance() + getBalance()*rate);
    }
}