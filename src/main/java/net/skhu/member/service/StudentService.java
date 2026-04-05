package net.skhu.member.service;

import net.skhu.member.entity.Student;

public interface StudentService {
	void save(String name, String department, String loginId, String loginPw);
	Student find(String loginId, String loginPw);
}
