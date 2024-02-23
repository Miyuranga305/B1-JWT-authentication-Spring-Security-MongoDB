package com.example.project_02.repo;

import com.example.project_02.entity.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends MongoRepository<Admin, Integer> {
    public Admin findAdminByUsername(String username);
    public Admin findAdminByEmailAndPassword(String email, String password);

}
