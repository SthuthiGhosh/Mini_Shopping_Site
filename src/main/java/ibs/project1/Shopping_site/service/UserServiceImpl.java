package ibs.project1.Shopping_site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibs.project1.Shopping_site.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 *Method for Fetching wallet balance by providing user id
	 */
	@Override
	public int fetchWalletBalanceByUserId(int userId) {

		return userRepository.findById(userId);
	}

}
