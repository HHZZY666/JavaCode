package com.hzyedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("云熙");
        account.setMoney(0);
        account.setKey("999");
        System.out.println(account.info());
    }
}

class Account{
    private String name;
    private double money;
    private String key;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else{
            System.out.println("格式错误");
            this.name = "无名";
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money >= 20) {
            this.money = money;
        }else{
            System.out.println("错误");
            this.money = 9999999;
        }
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        if (key.length() == 6) {
            this.key = key;
        }else{
            System.out.println("密码错误");
            this.key = "123456";
        }
    }

    public String info(){
        return "name = " + name +"\tmoney = " + money + "\tkey = " + key;
    }
}
