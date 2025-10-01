package xeanuts.io.sonar.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class RecordData {
    private int roomNo;
    private int electricityNo;
    private Date recordDate;

    public RecordData(int roomNo, int electricityNo, Date recordDate) {
        this.roomNo = roomNo;
        this.electricityNo = electricityNo;
        this.recordDate = recordDate;
    }
}
