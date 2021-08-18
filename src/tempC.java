import com.google.gson.Gson;

public class tempC {
    String username;
    transient String Password;

    public tempC(String usernam, String pass) {
        this.username=usernam;
        this.Password=pass;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
