package net.skhu.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.member.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	Optional<Student> findByLoginIdAndLoginPw(String loginId, String loginPw);
}
