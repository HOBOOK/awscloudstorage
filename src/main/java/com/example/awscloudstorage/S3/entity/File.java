package com.example.awscloudstorage.S3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value="File")
@NoArgsConstructor
public class File {
    @Id
    private String id;
    private String title;
    private String filePath;

    public File(String id, String title, String filePath){
        this.id = id;
        this.title = title;
        this.filePath = filePath;
    }
}