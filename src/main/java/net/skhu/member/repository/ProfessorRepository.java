package net.skhu.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.member.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
	Optional<Professor> findByLoginIdAndLoginPw(String loginId, String loginPw);
}
