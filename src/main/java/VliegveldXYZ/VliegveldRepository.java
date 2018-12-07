package VliegveldXYZ;

import VliegveldXYZ.Vliegveld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VliegveldRepository extends MongoRepository<Vliegveld, String> {

}
