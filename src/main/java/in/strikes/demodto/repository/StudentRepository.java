package in.strikes.demodto.repository;

import in.strikes.demodto.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    boolean existsByemail(String email);
    List<Student> findByDeletedFalse();
}
