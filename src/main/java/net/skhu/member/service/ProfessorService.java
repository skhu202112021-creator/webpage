package net.skhu.member.service;

import net.skhu.member.entity.Professor;

public interface ProfessorService {
	void save(String name, String department, String loginId, String loginPw);
	Professor find(String loginId, String loginPw);
}
