
package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.BrotherhoodFloat;

@Repository
public interface BrotherhoodFloatRepository extends JpaRepository<BrotherhoodFloat, Integer> {

	@Query("select a from BrotherhoodFloat a where a.owner.id = ?1")
	public List<BrotherhoodFloat> findByBrotherhood(int brotherhoodId);

}
