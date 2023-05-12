package com.example.Store.Model;
import jakarta.persistence.*;
import lombok.*;

/**
 * store one CVS record: file data, file version,file name
 */

@Entity
@Table(name="csvrecord")
public  class CSVRecord implements Record{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "file_record")
    private String fileRecord;
    private int version;
    private String name;
    private final char separator=';';

    public CSVRecord( String fileRecord, int version, String name) {
        this.fileRecord = fileRecord;
        this.version = version;
        this.name = name;
    }

    public CSVRecord() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFileRecord(String fileRecord) {
        this.fileRecord = fileRecord;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getFileRecord() {
        return fileRecord;
    }

    public int getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public char getSeparator() {
        return separator;
    }

    @Override
    public CSVRecord clone() throws CloneNotSupportedException {
        CSVRecord file= (CSVRecord) super.clone();
        file.name=new String(name);
        file.fileRecord=new String(fileRecord);
        return  file;
    }

    @Override
    public String toString() {
        return new String(fileRecord + separator+version+separator+name);
    }
}
