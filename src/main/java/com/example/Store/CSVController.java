package com.example.Store;

import com.example.Store.Model.CSVRecord;
import com.example.Store.Model.PlainTextRecord;
import com.example.Store.Repos.Repository;

public class CSVController {
    private final Repository<CSVRecord> repository;

    public CSVController(Repository<CSVRecord> repository) {
        this.repository = repository;
    }
    public CSVRecord findById(int id){
        return  repository.findById(id);
    }
    public void save(CSVRecord record){
        repository.save(record);
    }
    public void update(CSVRecord record){
        repository.update(record);
    }
    public void delete(CSVRecord record){
        repository.delete(record);
    }
}

