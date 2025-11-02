package record_learn;

import java.time.LocalDate;

public record  EmployeeRecord(Integer id , String fullName, LocalDate hiredDate) {

    public String json(){
        return "{ 'id':'%d', 'fullName':'%s', 'hiredDate':'%s' } ".formatted(id, fullName, hiredDate);
    }
};
