package rs.ac.uns.ftn.transport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.uns.ftn.transport.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}