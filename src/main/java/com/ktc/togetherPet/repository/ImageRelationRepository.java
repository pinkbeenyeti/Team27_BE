package com.ktc.togetherPet.repository;

import com.ktc.togetherPet.model.entity.ImageRelation.ImageEntityType;
import com.ktc.togetherPet.model.entity.ImageRelation.ImageRelation;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRelationRepository extends JpaRepository<ImageRelation, Long> {

    Optional<ImageRelation> findByImageEntityTypeAndEntityId(ImageEntityType imageEntityType, Long entityId);
}
