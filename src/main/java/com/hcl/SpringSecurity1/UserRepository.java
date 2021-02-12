package com.hcl.SpringSecurity1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
	User findByUsername(String Username);
}
