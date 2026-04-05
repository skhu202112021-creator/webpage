package net.skhu.account.helper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.skhu.account.dto.AccountJoinRequest;
import net.skhu.account.dto.AccountLoginRequest;

public interface AccountHelper {
	void join(AccountJoinRequest joinReq);
	
	String login(AccountLoginRequest loginReq, HttpServletRequest req, HttpServletResponse res);
	
	Integer getMemberId(HttpServletRequest req);
	
	boolean isLoggedIn(HttpServletRequest req);
	
	void logout(HttpServletRequest req, HttpServletResponse res);
}
