package module1.mini_apps.mini_app_in_oop;

public class Cell {
    private Car car;
    private String cellId;
    private String sign = CarType.EMPTY_SIGN;

    public Cell() {

    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public Cell(int cellId) {
        this.cellId = String.valueOf(cellId);
    }

    public Cell(Car car, String cellId) {
        this.car = car;
        this.cellId = cellId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }
}
