class Employee {
    private String name;
    Employee(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean approveLoan(){
        return true;
    }

    public InterestRate changeInterest(InterestRate currentRule, String type, double newRate) {
        System.out.println("You don’t have permission for this operation");
        return currentRule;
    }

    public boolean seeInternalFund(){
        return true;
    }
}

class ManagingDirector extends Employee{
    ManagingDirector(String name){
        this.setName(name);
    }

    public InterestRate changeInterest(InterestRate currentRule, String type, double newRate) {
        currentRule.changeByBankEmployee(type, newRate);
        return currentRule;
    }
}

class Officer extends Employee{
    Officer(String name){
        this.setName(name);
    }
    public boolean changeInterest(){
        return false;
    }
    public boolean seeInternalFund(){
        return false;
    }


}

class Cashier extends Employee{
    Cashier(String name){
        this.setName(name);
    }
    public boolean approveLoan(){
        return false;
    }
    public boolean changeInterest(){
        return false;
    }
    public boolean seeInternalFund(){
        return false;
    }
}


