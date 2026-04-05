package net.skhu.account.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountJoinRequest {
	private String name;
	private String department;
	private String loginId;
	private String loginPw;
}
