package Controllers;

public class HomeController {
    private int res;

    public HomeController() {
        this.res = 0;
    }

    public void add(int value) {
        res += value;
    }

    public void sub(int value) {
        res -= value;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
