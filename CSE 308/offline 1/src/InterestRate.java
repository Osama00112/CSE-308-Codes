public class InterestRate {
    private double studentInterest;
    private double savingsInterest;
    private double fixedInterest;
    //private double loanInterest;

    public void initialSettings(){
        setSavingsInterest(0.1);
        setStudentInterest(0.05);
        setFixedInterest(0.15);
        //setLoanInterest();
    }

    public void changeByBankEmployee(String type, double changedRate){
        if(type.equalsIgnoreCase("savings")){
            setSavingsInterest(changedRate);
            System.out.println("Savings Account Interest changed");
        } else if (type.equalsIgnoreCase("student")) {
            setStudentInterest(changedRate);
            System.out.println("Student Account Interest changed");
        } else if (type.equalsIgnoreCase("fixed")) {
            setFixedInterest(changedRate);
            System.out.println("Fixed Deposit Account Interest changed");
        }
//        else if (type.equalsIgnoreCase("loan")) {
//            setLoanInterest(changedRate);
//        }
        else {
            System.out.println("Invalid account type");
        }

    }

    public double getStudentInterest() {
        return studentInterest;
    }

    public void setStudentInterest(double studentInterest) {
        this.studentInterest = studentInterest;
    }

    public double getSavingsInterest() {
        return savingsInterest;
    }

    public void setSavingsInterest(double savingsInterest) {
        this.savingsInterest = savingsInterest;
    }

    public double getFixedInterest() {
        return fixedInterest;
    }

    public void setFixedInterest(double fixedInterest) {
        this.fixedInterest = fixedInterest;
    }

//    public double getLoanInterest() {
//        return loanInterest;
//    }
//
//    public void setLoanInterest(double loanInterest) {
//        this.loanInterest = loanInterest;
//    }
}
