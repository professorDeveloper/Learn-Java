package record_learn;

import java.time.LocalDate;

public record  EmployeeRecord(Integer id , String fullName, LocalDate hiredDate) {

    public EmployeeRecord(Integer id, String fullName, LocalDate hiredDate) {
        if (id<0) throw new IllegalArgumentException("id must be positive number");
        this.id = id;
        this.fullName = fullName;
        this.hiredDate = hiredDate;
    }

    public String json(){
        return "{ 'id':'%d', 'fullName':'%s', 'hiredDate':'%s' } ".formatted(id, fullName, hiredDate);
    }
};
