
package laptrinhhuongdoituong;
public class Tax {
    double thunhap;
    int starttime,endtime;

    public Tax() {
    }

    public Tax(double thunhap, int starttime, int endtime) {
        this.thunhap = thunhap;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public void setThunhap(double thunhap) {
        this.thunhap = thunhap;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public void setEndtime(int endtime) {
        this.endtime = endtime;
    }

    public double getThunhap() {
        return thunhap;
    }

    public int getStarttime() {
        return starttime;
    }

    public int getEndtime() {
        return endtime;
    }
    public double paytax(double thunhap,int starttime,int endtime)
    {
        return thunhap*(endtime-starttime);
}
}
