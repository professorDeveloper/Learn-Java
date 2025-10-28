package mini_app_in_oop;

public class Parking {
    private Row[] rows;
    private String parkName;

    public Parking() {
    }

    public Parking(Row[] rows, String parkName) {
        this.rows = rows;
        this.parkName = parkName;
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public void buildPark(int rowCount, int cellCount) {
        rows = new Row[rowCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = new Row(i);
            row.buildRow(cellCount);
            rows[i] = row;
        }
    }

    public void showParking() {
        System.out.println("--------------------------------");
        for (Row row : rows) {
            for (Cell cell : row.getCells()) {
                System.out.print(cell.getSign() + "|");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

    public void park(Car car,int rowIndex,int columnIndex) {
        String sign =CarType.findCarTypeByCarTypeName(car.getType());
        car.setType(sign);
        Row row = rows[rowIndex];
        Cell[] cells = row.getCells();
        Cell cell = cells[columnIndex];
        cell.setCar(car);
        cell.setSign(car.getType());
    }
}
