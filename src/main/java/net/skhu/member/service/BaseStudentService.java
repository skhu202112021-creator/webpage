package net.skhu.member.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.skhu.member.entity.Student;
import net.skhu.member.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class BaseStudentService implements StudentService{
	private final StudentRepository studentRepository;
	
	@Override
	public void save(String name, String department, String loginId, String loginPw) {
		studentRepository.save(new Student(name, department, loginId, loginPw));
	}
	
	@Override
	public Student find(String loginId, String loginPw) {
		Optional<Student> studentOptional = studentRepository.findByLoginIdAndLoginPw(loginId, loginPw);
		
		return studentOptional.orElse(null);
	}
}
