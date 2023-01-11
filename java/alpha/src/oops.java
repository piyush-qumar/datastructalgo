import java.util.*;

class Bank {
    String name;
    String code;
    String hqAdd;
    Long contactNo;
}

class Branch extends Bank {
    String ifsc;
    String address;
    Long brContactNo;
    String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAddress(String hqAdd) {
        this.hqAdd = hqAdd;
    }

    public void setContact(Long contactNo) {
        this.contactNo = contactNo;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public void setBranchAddress(String address) {
        this.address = address;
    }

    public void setBranchContact(Long brContactNo) {
        this.brContactNo = brContactNo;
    }

    public void setBranchEmail(String email) {
        this.email = email;
    }

}
public  enum stat{
    ACTIVE, INACTIVE
}

class Customer extends Branch {
   
    private String type;
    private String status;
    private Long accNo;
    private Long balance;
    private String accHolderName;
    private String accHolderAddress;

    protected Long getAccNo() {
        return accNo;
    }

    protected Long getBalance() {
        return balance;

    }

    protected String getAccHolderName() {
        return accHolderName;
    }

    protected String getAccHolderAddress() {
        return accHolderAddress;
    }

    protected void setBalance(Long new_bal) {
        this.balance = new_bal;
    }

    protected void setAccNo(Long accNo) {
        this.accNo = accNo;
    }

    protected void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    protected void setAccHolderAddress(String accHolderAddress) {
        this.accHolderAddress = accHolderAddress;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    protected String getType() {
        return type;
    }

    protected String getStatus() {
        return status;
    }

}

class loan extends Customer {
    private Long loanAmt;
    private Long loanDuration;
    private String loanType;
    private String loanStatus;

    protected Long getAmt() {
        return loanAmt;
    }

    protected Long getLoanDuration() {
        return loanDuration;
    }

    protected String getType() {
        return loanType;
    }

    protected String getStatus() {
        return loanStatus;

    }
}

class Account extends Customer {

    public void create_acc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        String name = sc.next();
        setName(name);
        System.out.println("Enter the bank code");
        String code = sc.next();
        setCode(code);
        System.out.println("Enter the bank hq address");
        String hq_address = sc.next();
        setAddress(hq_address);
        System.out.println("Enter the bank contact number");
        Long contact_no = sc.nextLong();
        setContact(contact_no);
        System.out.println("Enter the branch IFSC");
        String IFSC = sc.next();
        setIfsc(IFSC);
        System.out.println("Enter the branch address");
        String Address = sc.next();
        setBranchAddress(Address);
        System.out.println("Enter the branch contact number");
        Long brcontact_no = sc.nextLong();
        setBranchContact(brcontact_no);
        System.out.println("Enter the account number");
        Long accNo = sc.nextLong();
        setAccNo(accNo);
        System.out.println("Enter the balance");
        Long balance = sc.nextLong();
        setBalance(balance);
        System.out.println("Enter the account holder name");
        String accHolderName = sc.next();
        setAccHolderName(accHolderName);
        System.out.println("Enter the account holder address");
        String accHolderAddress = sc.next();
        setAccHolderAddress(accHolderAddress);
        System.out.println("Enter the account type");
        String type = sc.next();
        setType(type);
        try{
        System.out.println("Enter the status");
        String status = sc.next();
        if((status.equals("ACTIVE")) ||(status.equals("INACTIVE")) )
        setStatus(status);
        }
        catch(Exception e){
            System.out.println("Invalid status");
        }
        //sc.close();
    }

    protected boolean get_details(Long accNo) {
        if (accNo == getAccNo()) {
            System.out.println("Bank name: " + name);
            System.out.println("Bank code: " + code);
            System.out.println("Branch IFSC: " + ifsc);
            System.out.println("Branch address: " + address);
            System.out.println("Branch contact number: " + brContactNo);
            System.out.println("Account number: " + accNo);
            System.out.println("Balance: " + getBalance());
            System.out.println("Account holder name: " + getAccHolderName());
            System.out.println("Account holder address: " + getAccHolderAddress());
            System.out.println("Account type: " + getType());
            System.out.println("Status: " + getStatus());
            return true;
        } else
            return false;
    }

    public void deposit_amt(Long amt) {

        Long balance = getBalance();
        Long new_bal = balance + amt;
        setBalance(new_bal);
    }

    public Long withdraw_amt(Long amt) {
        Long balance = getBalance();
        // return (amt <= balance)? setBalance(balance - amt): 0L;
        if (amt <= balance) {
            Long new_bal = balance - amt;
            setBalance(new_bal);
            return amt;
        } else {
            System.out.println("Insufficient balance");
            return 0L;
        }

    }

    public Boolean check(Long ac_no) {
        return (ac_no == getAccNo()) ? true : false;
    }
}

public class oops {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of new customer for unified banking system");
        Account a = new Account();
        a.create_acc();
        do {
            System.out.println("\nBanking System");
            System.out.println(
                    "1. Search by Account number\n 2. Deposit the amount \n 3. Withdraw the amount \n 4.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter account no. you want to search: ");
                    Long a_no = sc.nextLong();
                    boolean b = a.check(a_no) ? a.get_details(a_no) : false;

                    if (!b) {
                        System.out.println("Account number does not exist");
                    }

                    break;
                case 2:
                    System.out.println("Enter the account number");
                    Long ac_no = sc.nextLong();

                    boolean found = a.check(ac_no);
                    if (found) {
                        System.out.println("Enter the amount to be deposited");
                        Long amt = sc.nextLong();
                        a.deposit_amt(amt);
                        System.out.println("Amount deposited: " + amt);
                        System.out.println("The balance in your account is " + a.getBalance());
                    } else {
                        System.out.println("Account number does not exist");
                    }
                    break;
                case 3:
                    System.out.println("Enter the account number");
                    Long acc_no1 = sc.nextLong();
                    if (a.check(acc_no1)) {
                        System.out.println("Enter the amount to be withdrawn");
                        Long amt = sc.nextLong();
                        a.withdraw_amt(amt);
                        System.out.println("Amount withdraw request: " + amt);
                        System.out.println("The balance in your account is " + a.getBalance());

                    } else {
                        System.out.println("Account number does not exist");
                    }
                    break;
                case 4:
                    System.out.println("See you soon...");
                    break;
            }
        } while (ch != 4);
        sc.close();
    }
}