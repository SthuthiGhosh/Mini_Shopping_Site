package ibs.project1.Shopping_site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ibs.project1.Shopping_site.service.UserService;

/**
 * controller class for userController
 * @author 91940
 *
 */
@RestController
public class userController {

	/**
	 * Bean created for userService
	 */
	@Autowired
	private UserService userService;
	/**
	 * method for fetching wallet balance using UserId
	 * @param userId
	 * @return wallet balance
	 */
	@GetMapping("/wallet/{id}")
	int fetchWalletBalanceByUserId(@PathVariable("id") int userId) {
		return userService.fetchWalletBalanceByUserId(userId);

	}
}
