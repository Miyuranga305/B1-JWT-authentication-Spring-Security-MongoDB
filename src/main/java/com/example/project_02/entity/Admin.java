package com.example.project_02.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {


    @Id
    private ObjectId id;
    @Indexed
    private String email;
    private String username;
    private String password;
    private String type;
}
