package projects.mini_app_in_oop;

public class Row {
    private Cell[] cells;
    private String rowId;

    public Row() {

    }

    public Row(int rowId){
        this.rowId = String.valueOf(rowId);
    }
    public Row(Cell[] cells, String rowId) {
        this.cells = cells;
        this.rowId = rowId;
    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCells(Cell[] cells) {
        this.cells = cells;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public void buildRow(int cellCount) {
        cells = new Cell[cellCount];
        for (int i = 0; i < cellCount; i++) {
            Cell cell = new Cell(i);
            cells[i] = cell;
        }
    }
}
