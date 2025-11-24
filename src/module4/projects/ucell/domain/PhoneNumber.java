package module4.projects.ucell.domain;


import module4.projects.ucell.enums.NumberStatus;

import java.io.Serializable;

public class PhoneNumber implements Serializable {

    private String id;
    private String number;
    private NumberStatus status;
    private String ownerId;

    public PhoneNumber() {}

    public PhoneNumber(String id, String number, NumberStatus status, String ownerId) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.ownerId = ownerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public NumberStatus getStatus() {
        return status;
    }

    public void setStatus(NumberStatus status) {
        this.status = status;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
