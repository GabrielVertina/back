package com.javainuse.db;


        import com.javainuse.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User, Long>{

}