package com.simonblund.dahapp.controllers;


import com.simonblund.dahapp.data.DataProcessingRecordMapper;
import com.simonblund.dahapp.models.DataProcessingRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DprController {
    private DataProcessingRecordMapper dataProcessingRecordMapper;

    public DprController(DataProcessingRecordMapper dataProcessingRecordMapper) {
        this.dataProcessingRecordMapper = dataProcessingRecordMapper;
    }

    @GetMapping("/api/v1/dpr/all")
    public List<DataProcessingRecord> getAll(){
        return dataProcessingRecordMapper.getAll();
    }

    @GetMapping("/api/v1/dpr/all/list")
    public List<DataProcessingRecord> getAllOnlyNameId(){
        return dataProcessingRecordMapper.getAllOnlyNameId();
    }
}
