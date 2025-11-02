package record_learn;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

/*
* DTO - Data Transfer Object
* */
public class EmployeeDTO {
    private final Integer id;
    private final String fullName;
    private final LocalDate hiredDate;

    public EmployeeDTO(Integer id, String fullName, LocalDate hiredDate) {
        this.id = id;
        this.fullName = fullName;
        this.hiredDate = hiredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(fullName, that.fullName) && Objects.equals(hiredDate, that.hiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, hiredDate);
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }
}
