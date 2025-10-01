package xeanuts.io.sonar.dto;

import java.util.Date;

import lombok.Data;

@Data
public class RentalData {
    private Integer roomNo;
    private Integer person;
    private String size;
    private Date updatedDate;

    public RentalData(Integer roomNo, Integer person, String size, Date updatedDate) {
        this.roomNo = roomNo;
        this.person = person;
        this.size = size;
        this.updatedDate = updatedDate;
    }
}
