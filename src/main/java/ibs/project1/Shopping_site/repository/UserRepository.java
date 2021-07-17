package ibs.project1.Shopping_site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ibs.project1.Shopping_site.entity.UserEntity;

/**
 * userRepository interface implementing jpaRepository
 * @author 91940
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	/**
	 * method for fetching walletMoney for a particular user
	 * @param userId
	 * @return
	 */
	@Query("Select walletmoney From UserEntity where userId=?1")
	int findById(int userId);
}
