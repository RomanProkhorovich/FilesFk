package com.example.Store.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="plain_text_record")
public class PlainTextRecord implements Record{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public PlainTextRecord() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public Long getId() {
        return id;
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public String getPath() {
        return path;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public PlainTextRecord( Date accessDate, String path, boolean isPublic) {
        this.accessDate = accessDate;
        this.path = path;
        this.isPublic = isPublic;
    }

    /**
     * field to store date of access to file
     */
    @Column(name="access_date")
    private Date accessDate;
    /**
     * field to store file path on the Internet
     */
    private String path;
    /**
     * field to store file access mode. true-public; false-private
     */
    @Column(name="is_public")
    private boolean isPublic;

    /**
     * @return a copy of this record
     */
    @Override
    public PlainTextRecord clone() throws CloneNotSupportedException {
        PlainTextRecord rec= (PlainTextRecord) super.clone();
        rec.accessDate= (Date) accessDate.clone();
        rec.path=new String(path);
        return  rec;
    }

    @Override
    public String toString() {
        return new String(String.valueOf(accessDate)+" "+path+" "+ String.valueOf(isPublic));
    }
}
