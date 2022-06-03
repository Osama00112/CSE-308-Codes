class FixedAccount extends Account{

    FixedAccount(String name, String type, double initialDeposit) {
        //super(name, type, initialDeposit);
        setAccountName(name);
        setType(type);
        setServiceCharge(500);
        setMaturityPeriod(0);
        if(initialDeposit < 100000){
            setValidity(false);
            System.out.println("minimum 100000$ initial deposit required. Account creation failed");

        }
        else{
            setValidity(true);
            setBalance(getBalance() + initialDeposit);
            System.out.println("Successful initial deposit");
            System.out.println("Fixed Deposit account for " + name +" Created; initial balance " + initialDeposit + "$");
        }

    }

    public void deposit(double amount){
        if (amount < 50000){
            System.out.println("minimum 50000$ deposit required.");
        }
        else{
            setBalance(getBalance() + amount);
            //System.out.println("Successful deposit");
            System.out.println(amount +"$ deposited; current balance " + getBalance() +"$");

        }
    }

    public void withdraw(double amount){
        int period = getMaturityPeriod();
        if (period >= 1){
            if (amount > getBalance()) {
                System.out.println("Insufficient Balance. Try again");
            } else{
                setBalance(getBalance() - amount);
                System.out.println("withdrawal successful");
            }
        }
        else{
            System.out.println("insufficient maturity period");
        }
    }

    public void reqLoan(double loan){
        if(getLoanStatus() == 1){
            System.out.println("Loan Already Pending. Waiting for Approval");
        }
        else{
            if(loan <= 100000){
                //setTotalLoan(getTotalLoan() + loan);
                setTotalAwaitingLoan(getTotalAwaitingLoan() + loan);
                setLoanStatus(1);
                System.out.println("Loan request successful, sent for approval");
            }
            else
                System.out.println("Max loan of 100000$ allowed.");
        }
    }
    public void addInterest_AfterOneYear(InterestRate currentRule){
        setMaturityPeriod(getMaturityPeriod() + 1);
        double rate = currentRule.getFixedInterest();
        setBalance(getBalance() + getBalance()*rate);
    }

}