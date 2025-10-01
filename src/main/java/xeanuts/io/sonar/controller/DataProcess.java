package xeanuts.io.sonar.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xeanuts.io.sonar.dto.RecordData;
import xeanuts.io.sonar.dto.RentalData;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class DataProcess {
    
    @GetMapping("/record/room")
    @ResponseBody
    public RecordData getRoomInfo(@RequestParam String room) {
        return null;
    }
    
    @GetMapping("/record/rental")
    @ResponseBody
    public List<RecordData> listRentalRecord(@RequestParam String room) {
        return null;
    }
    

    @PostMapping("/record/room")
    @ResponseBody
    public String recordRoom(@RequestBody String entity) {

        return entity;
    }

    @PostMapping("/record/rental")
    @ResponseBody
    public String recordRental(@RequestBody String entity) {
        
        return entity;
    }
    
    @PostMapping("/record/batchRental")
    public String recordBatchRental(@RequestBody List<RecordData> listData) {
        //TODO: process POST request
        
        return null;
    }
    

    @PutMapping("room/{room}")
    public String updateRoomInfo(@PathVariable String room, @RequestBody RentalData entity) {
        //TODO: process PUT request
        
        return null;
    }
    @PutMapping("record/{record}")
    public String updateRecordInfo(@PathVariable String record, @RequestBody RecordData entity) {
        //TODO: process PUT request
        
        return null;
    }

    @DeleteMapping("record/{record}")
    public String deleteRecord(@PathVariable String record) {
        return null;
    }
}
