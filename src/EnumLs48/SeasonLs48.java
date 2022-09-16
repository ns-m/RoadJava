package EnumLs48;

public enum SeasonLs48 {
    SUMMER(32), AUTUMN(15), WINTER(5), SPRING(18);

    private int temp;

    SeasonLs48(int temp){
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
