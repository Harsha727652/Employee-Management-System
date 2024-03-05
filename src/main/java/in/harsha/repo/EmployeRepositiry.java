package in.harsha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.harsha.entity.Employe;
@Repository
public interface EmployeRepositiry extends JpaRepository<Employe,Long> {

}
