
package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Procession;

@Repository
public interface ProcessionRepository extends JpaRepository<Procession, Integer> {

	@Query("select a from Procession a where a.brotherhood.id=?1")
	public List<Procession> findByBrotherhood(int id);
}
