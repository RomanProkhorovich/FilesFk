package com.example.Store;

import com.example.Store.Model.PlainTextRecord;
import com.example.Store.Repos.Repository;

public class TXTController {
    private final Repository<PlainTextRecord> repository;

    public TXTController(Repository<PlainTextRecord >repository) {
        this.repository = repository;
    }
    public PlainTextRecord findById(int id){
        return  repository.findById(id);
    }
    public void save(PlainTextRecord record){
        repository.save(record);
    }
    public void update(PlainTextRecord record){
        repository.update(record);
    }
    public void delete(PlainTextRecord record){
        repository.delete(record);
    }
}
