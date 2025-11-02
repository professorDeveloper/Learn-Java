package record_learn;

import java.time.LocalDate;

public record  EmployeeRecord(Integer id , String fullName, LocalDate hiredDate) {



    /* and also this constructor named  compact constructor*/
    /*
    public EmployeeRecord {

    }*/

    /* this constructor is canonical constructor  */
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
