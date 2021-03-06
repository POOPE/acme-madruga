/*
 * ActorRepository.java
 * 
 * Copyright (C) 2019 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

	@Query("select a from Attachment a where a.owner.id=?1")
	ArrayList<Attachment> findByOwner(int ownerId);

}
