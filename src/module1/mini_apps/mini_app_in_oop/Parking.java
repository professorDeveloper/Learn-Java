package module1.mini_apps.mini_app_in_oop;

import static module1.mini_apps.mini_project_module1.ParkingApp.emptySign;

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

    public void park(Car car, int rowIndex, int columnIndex) {
        String sign = CarType.findCarTypeByCarTypeName(car.getType());
        car.setType(sign);
        if (rows.length > rowIndex) {
            Row row = rows[rowIndex];
            if (row.getCells().length > columnIndex) {
                Cell[] cells = row.getCells();
                Cell cell = cells[columnIndex];
                if (cell.getSign().equals(CarType.EMPTY_SIGN)) {
                    cell.setSign(car.getType());
                    cell.setCar(car);
                    System.out.println("Car has been parked in " + row.getRowId() + " row and " + cell.getCellId() + " column");
                } else {
                    System.out.println("Cell is not empty");
                }
            } else {
                System.out.println("Invalid column index");
            }
        } else {
            System.out.println("Invalid row index");
        }
    }

    public void availableCells() {
        System.out.println("==========================================");
        Row[] rows = this.rows;
        int count = 0;
        for (Row row : rows) {
            for (Cell cell : row.getCells()) {
                if (cell.getSign().equals(emptySign)) {
                    count++;
                }
            }
        }
        System.out.println("Available cells count: " + count);
        System.out.println("==========================================");
    }

    public void notAvailableCells() {
        System.out.println("==========================================");
        Row[] rows = this.rows;
        int count = 0;
        for (Row row : rows) {
            for (Cell cell : row.getCells()) {
                if (!cell.getSign().equals(emptySign)) {
                    count++;
                }
            }
        }
        System.out.println("Not Available cells count: " + count);
        System.out.println("==========================================");
    }

    public void outCar(int row, int column) {
        if (rows.length > row) {
            Row row1 = rows[row];
            if (row1.getCells().length > column) {
                Cell[] cells = row1.getCells();
                Cell cell = cells[column];
                if (!cell.getSign().equals(emptySign)) {
                    Car car = cell.getCar();
                    car.setType(cell.getSign());
                    cell.setSign(emptySign);
                    cell.setCar(null);
                    System.out.println("Car out successfully");
                } else {
                    System.out.println("Cell is empty");
                }
            } else {
                System.out.println("Invalid column index");
            }
        } else {
            System.out.println("Invalid row index");
        }
    }
}
