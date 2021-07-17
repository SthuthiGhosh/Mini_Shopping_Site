package ibs.project1.Shopping_site.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	int fetchWalletBalanceByUserId(int userId);
}
