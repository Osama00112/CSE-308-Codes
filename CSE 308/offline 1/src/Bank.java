import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Employee [] employees = new Employee[8];
    private List<Account> accountList = new ArrayList<>();

    double internalFund;
    int clock;


    InterestRate initialRates;

    Bank(){
        employees[0] = new ManagingDirector("MD");
        employees[1] = new Officer("S1");
        employees[2] = new Officer("S2");
        employees[3] = new Cashier("C1");
        employees[4] = new Cashier("C2");
        employees[5] = new Cashier("C3");
        employees[6] = new Cashier("C4");
        employees[7] = new Cashier("C5");

        internalFund = 1000000;
        clock = 0;
        initialRates = new InterestRate();
        initialRates.initialSettings();  //initially 10% rate

        System.out.print("Bank Created; ");
        for(int i=0; i<employees.length; i++){
            System.out.print(employees[i].getName());
            if (i!= employees.length-1) System.out.print(",");
        }
        System.out.println(" created");
    }

    public boolean isValidUser(String username){
        for (Account account : accountList) {
            if(account.getaccountName().equalsIgnoreCase(username)){
                return true;
            }
        }
        return false;
    }
    public boolean isValidEmployee(String username){
        for (Employee employee : employees) {
            if(employee.getName().equalsIgnoreCase(username)){
                return true;
            }
        }
        return false;
    }

    public void addAccount(Account acc){
        accountList.add(acc);
    }
    public void removeAccount(Account acc){
        int userIndex = findUser(acc.getaccountName());
        if(userIndex == -1){
            System.out.println("No user found to be deleted");
        }
        else{
            accountList.remove(userIndex);
        }
    }

    public int getTotalLoanReqs(){
        int count = 0;
        for (Account account : accountList) {
            count += account.getLoanStatus();
        }
        return count;
    }

    public Account getUser(String username){
        int userIndex = findUser(username);
        if (userIndex == -1){
            return null;
        }
        else{
            return accountList.get(userIndex);
        }
    }
    public Employee getEmployee(String username){
        int userIndex = findEmployee(username);
        if (userIndex == -1){
            System.out.println("no user found");
            return null;
        }
        else{
            return employees[userIndex];
        }
    }

    public void loanMsg(){
        if(getTotalLoanReqs() > 0){
            System.out.println(" there are loan approvals pending");
        }
        else{
            System.out.println(" there are 0 loan approvals pending");
        }
    }
    public void approveLoans(){
        for(Account account : accountList){
            if(account.getLoanStatus() == 1){
                if(getInternalFund() - account.getTotalAwaitingLoan() >= 0){
                    setInternalFund(getInternalFund() - account.getTotalAwaitingLoan());
                    account.addLoan();
                    account.setLoanStatus(0);
                    System.out.println("Loan for " + account.getaccountName() + " approved");
                }
                else{
                    account.rejectLoan();
                    account.setLoanStatus(0);
                    System.out.println("insufficient internal fund. please try again later");
                }
            }
        }
        //System.out.println("Loans Approved");
    }
    public int findUser(String accountName){
        int accountIndex = -1;
        for(int i=0; i<accountList.size();i++){
            if(accountList.get(i).getaccountName().equalsIgnoreCase(accountName)){
                accountIndex = i;
                break;
            }
        }
        return accountIndex;
    }
    public int findEmployee(String Name){
        int employeeIndex = -1;
        for(int i=0; i<employees.length;i++){
            if(employees[i].getName().equalsIgnoreCase(Name)){
                employeeIndex = i;
                break;
            }
        }
        return employeeIndex;
    }
    public void Lookup(String accountName){
        int accountIndex = findUser(accountName);
        if(accountIndex == -1)
            System.out.println("User no found");
        else
            System.out.println(accountName + "'s current balance " + accountList.get(accountIndex).getBalance());
    }

    public int nonLoanAccountCount(){
        int count = 0;
        for(Account account : accountList){
            if(!account.getType().equalsIgnoreCase("Loan")){
                count++;
            }
        }
        return count;
    }

    public void yearIncrement(){
        clock ++;
        System.out.println(clock + " years passed");
        applyRule();
    }
    public void applyRule(){
        double TotalDepositBefore = totalDeposits();
        for (Account account : accountList){
            account.addInterest_AfterOneYear(initialRates);
            //account.serviceChargeDeduction_AfterOneYear();
            account.loanInterestDeduction_AfterOneYear();
        }
        double TotalDepositAfter = totalDeposits();
        double result = internalFund - (TotalDepositAfter - TotalDepositBefore);
        if(result < 0){
            System.out.println("Bankrupt");
        }
        else{
            internalFund = result;
        }

        //seperate applied rule for service charge
        for (Account account : accountList){
            account.serviceChargeDeduction_AfterOneYear();
        }
    }

    public double totalDeposits(){
        double total = 0;
        for(Account account : accountList){
            total += account.getBalance();
        }
        return total;
    }

    public double getInternalFund() {
        return internalFund;
    }

    public void setInternalFund(double internalFund) {
        this.internalFund = internalFund;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public InterestRate getInitialRates() {
        return initialRates;
    }
    public void setInitialRates(InterestRate initialRates) {
        this.initialRates = initialRates;
    }


}
