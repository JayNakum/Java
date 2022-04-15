class Customer {
    private String m_Name, m_Address, m_Age;

    private Account m_Acc;

    public Customer(String name, String address, String age) {
        m_Name = name;
        m_Address = address;
        m_Age = age;
        m_Acc = null;
    }

    public String getName() {
        return m_Name;
    }

    public String getAddress() {
        return m_Address;
    }

    public String getAge() {
        return m_Age;
    }

    public void createAccount(int ano) {
        m_Acc = new Account(ano);
    }

    public Account account() {
        return m_Acc;
    }
}

class Account {
    private int m_Ano, m_Bal;

    public Account(int ano) {
        m_Ano = ano;
        m_Bal = 0;
    }

    public int getBalance() {
        return m_Bal;
    }

    public void deposit(int amt) {
        m_Bal += amt;
    }

    public void withdraw(int amt) {
        int remaining = m_Bal - amt;
        if (remaining < 0) {
            System.out.println("Insufficient Funds");
        } else {
            m_Bal = remaining;
        }
    }

}

public class Q02 {
    public static void main(String[] args) {
        Customer cus1 = new Customer("John", "Abc, Def, 001", "25yrs");
        cus1.createAccount(12345);
        cus1.account().deposit(4000);

        Customer cus2 = new Customer("Cindy", "Pqr, Stu, 012", "32yrs");
        cus2.createAccount(54321);
        cus2.account().deposit(40204);

        cus1.account().withdraw(1500);
        cus2.account().withdraw(1500);

        System.out.println(cus1.getName() + ": " + cus1.account().getBalance());
        System.out.println(cus2.getName() + ": " + cus2.account().getBalance());
    }
}
