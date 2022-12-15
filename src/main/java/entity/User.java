package entity;

public class User {
    public int id;
    public String account;  //账号名
    public String password;  //密码

    public User(int id, String account, String password) {
        this.id=id;
        this.account=account;
        this.password=password;
    }

    public User(String account, String password) {
        this.account=account;
        this.password=password;
    }
}
