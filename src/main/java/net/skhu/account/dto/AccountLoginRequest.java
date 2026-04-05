package net.skhu.account.dto;

import lombok.Getter;

@Getter
public class AccountLoginRequest {
	private String loginId;
	private String loginPw;
}
