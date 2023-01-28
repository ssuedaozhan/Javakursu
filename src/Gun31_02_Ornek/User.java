package Gun31_02_Ornek;

public class User {
    String username ;
    Soru.Role role;
    Soru.Statu statu;

    public User(String username, Soru.Role role, Soru.Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
