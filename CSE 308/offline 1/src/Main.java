import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank newBank = new Bank();
        boolean transactionValidity = true;
        boolean ongoingTransaction = false;
        Account currentUser;
        Employee currentEmployee;
        currentUser = null;
        currentEmployee = null;


        Scanner sc = new Scanner(System.in);
        while(true){
            String newLine = sc.nextLine();
            String[] words = newLine.split("\\s+");
            Account newAcc;

            if(words[0].equalsIgnoreCase("Create")){
                ongoingTransaction = true;
                String inputName = words[1];
                String inputType = words[2];
                double inputDeposit = Double.parseDouble(words[3]);

                if(newBank.isValidUser(inputName)){
                    System.out.println("user already exists");
                    transactionValidity = false;
                    continue;
                }
                else{
                    if(inputType.equalsIgnoreCase("Savings")){
                        newAcc = new SavingsAccount(inputName,inputType,inputDeposit);
                    }
                    else if(inputType.equalsIgnoreCase("Student")) {
                        newAcc = new StudentAccount(inputName,inputType,inputDeposit);
                    }
                    else if(inputType.equalsIgnoreCase("FixedDeposit")) {
                        newAcc = new FixedAccount(inputName,inputType,inputDeposit);
                    }
                    else if(inputType.equalsIgnoreCase("Loan")){
                        newAcc = new loanAccount(inputName,inputType,inputDeposit);
                        if(newBank.getInternalFund() < inputDeposit){
                            newAcc.setValidity(false);
                        }
                        else{
                            newBank.setInternalFund(newBank.getInternalFund() - inputDeposit);
                        }
                    }
                    else{
                        System.out.println("invalid account type");
                        transactionValidity = false;
                        continue;
                    }
                    currentUser = newAcc;
                }

                if(currentUser.getValidity()){
                    newBank.addAccount(currentUser);
                }
                else{
                    transactionValidity = false;
                    //continue;
                }

            }
            else if(words[0].equalsIgnoreCase("Deposit")){
                if(transactionValidity){
                    if(ongoingTransaction && currentUser != null){
                        double amount = Double.parseDouble(words[1]);

                        //if loan account deposits, it gets added to the internal fund
                        if(currentUser.getType().equalsIgnoreCase("Loan")){
                            if(amount <= currentUser.getTotalLoan()){
                                newBank.setInternalFund(newBank.getInternalFund() + amount);
                            }
                        }

                        //deposit method
                        currentUser.deposit(amount);

                        //in case of loan accounts, if loans are cleared, account gets suspended. thus it's removed from bank
                        if(!currentUser.getValidity()){
                            newBank.removeAccount(currentUser);
                        }

                    }
                    else{
                        System.out.println("No user detected. invalid deposit");
                    }
                }
                else{
                    System.out.println("Invalid transaction. u cant deposit. please close");
                }

            }
            else if(words[0].equalsIgnoreCase("Withdraw")){
                if(transactionValidity){
                    if(ongoingTransaction && currentUser != null){
                        currentUser.withdraw(Double.parseDouble(words[1]));
                    }
                    else{
                        System.out.println("No user detected. invalid withdrawal");
                    }
                }
                else{
                    System.out.println("Invalid transaction. u cant withdraw. please close");
                }
            }
            else if(words[0].equalsIgnoreCase("Query")){
                //currentUser.getInfo();
                if(transactionValidity){
                    if(ongoingTransaction && currentUser != null){
                        currentUser.getInfo();
                    }
                    else{
                        System.out.println("No user detected");
                    }
                }
                else
                    System.out.println("Invalid transaction. close now");
            }
            else if(words[0].equalsIgnoreCase("Request")){
                double requestedAmount = Double.parseDouble(words[1]);
                //currentUser.reqLoan(requestedAmount);
                if(transactionValidity){
                    if(ongoingTransaction && currentUser != null){
                        currentUser.reqLoan(requestedAmount);
                    }
                    else{
                        System.out.println("No user detected");
                    }
                }
                else
                    System.out.println("Invalid transaction. close now");
            }
            else if(words[0].equalsIgnoreCase("Close")){
                if(transactionValidity){
                    if(ongoingTransaction){
                        //System.out.println("Closing ongoing transaction");
                        if(currentUser != null){
                            System.out.println("Transaction Closed for " + currentUser.getaccountName());
                        }
                        if(currentEmployee != null){
                            System.out.println("Operations for " + currentEmployee.getName() + " closed");
                        }
                        ongoingTransaction = false;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    System.out.println("Closing invalid transaction");
                    transactionValidity = true;
                    ongoingTransaction = false;
                }

                currentUser = null;
                currentEmployee = null;
                //newBank.removeInvalidAccounts();
            }
            else if(words[0].equalsIgnoreCase("Open")){
                ongoingTransaction = true;
                String suspect = words[1];
                //checking if a user
                if(newBank.isValidUser(suspect)){
                    currentUser = newBank.getUser(suspect);
                    System.out.println("Welcome Back, " + suspect);
                }
                else if(newBank.isValidEmployee(suspect)){
                    currentEmployee = newBank.getEmployee(suspect);
                    System.out.print(currentEmployee.getName() + " active, ");
                    newBank.loanMsg();
                }
                else{
                    transactionValidity = false;
                    System.out.println("Invalid user. Please Close");
                }
            }
            else if(words[0].equalsIgnoreCase("Approve") && words[1].equalsIgnoreCase("loan")){
                if(currentEmployee != null){
                    if(currentEmployee.approveLoan()){
                        newBank.approveLoans();
                    }
                    else{
                        System.out.println("You don’t have permission for this operation");
                    }
                }
                else{
                    System.out.println("Invalid user. You don't have permission for approving.");
                }
            }
            else if(words[0].equalsIgnoreCase("Lookup")){
                String lookupUser = words[1];
                if(currentEmployee != null){
                    newBank.Lookup(lookupUser);
                }
                else{
                    System.out.println("Invalid user. You don't have permission for lookup.");
                }

            }
            else if(words[0].equalsIgnoreCase("See")){
                if(currentEmployee != null){
                    if(currentEmployee.seeInternalFund())
                        System.out.println("Current Internal Fund " + newBank.getInternalFund());
                    else{
                        System.out.println("You don’t have permission for this operation");
                    }
                }
                else{
                    System.out.println("Invalid user. You don't have permission for seeing.");
                }
            }
            else if(words[0].equalsIgnoreCase("Change")){
                String inputType = words[1];
                double inputRate = Double.parseDouble(words[2]) / 100;
                if(currentEmployee != null){
                    newBank.setInitialRates(currentEmployee.changeInterest(newBank.getInitialRates(), inputType, inputRate));
                }
                else{
                    System.out.println("Invalid user. You don't have permission for changing interest.");
                }
            }
            else if(words[0].equalsIgnoreCase("INC")){
                if(!ongoingTransaction){
                    newBank.yearIncrement();
                }
                else{
                    System.out.println("Invalid command. year cannot pass");
                }
            }
            else if(words[0].equalsIgnoreCase("EXIT")){
                System.out.println("exiting bank");
                break;
            }
            else{
                System.out.println("Invalid command.");
            }
        }
    }
}
