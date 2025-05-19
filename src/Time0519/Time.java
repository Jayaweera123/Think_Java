package Time0519;

public class Time {
    private int hour;
    private int min;
    private int second;

    //initilaze values
    public Time() {
        this.hour = 0;
        this.min = 0;
        this.second = 0;
    }
    public Time(int totalSeconds) {
        this.second = totalSeconds % 60;
        int totalMin = totalSeconds / 60;
        this.min = totalMin % 60;
        this.hour = totalMin / 60;
    }
        public String toString() {
            return String.format("%02d:%02d:%02d", hour, min, second);
        }



    }


