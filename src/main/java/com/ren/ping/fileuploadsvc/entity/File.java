package com.ren.ping.fileuploadsvc.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="file_name")
    private String fileName;
    @Column(name="file_size")
    private long size;
    @Column(name="processed_date" ,insertable = false, updatable = false)
    private LocalDateTime processedDate;

    @Column(name="uploaded_by")
    private String uploadedBy;

    public File() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public LocalDateTime getProcessedDate() {
        return processedDate;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", size=" + size +
                ", processedDate=" + processedDate +
                '}';
    }
}
