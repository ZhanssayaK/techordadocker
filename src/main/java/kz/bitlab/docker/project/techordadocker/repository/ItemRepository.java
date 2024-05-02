package kz.bitlab.docker.project.techordadocker.repository;

import kz.bitlab.docker.project.techordadocker.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

}
