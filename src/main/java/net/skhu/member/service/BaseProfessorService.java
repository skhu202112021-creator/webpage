package net.skhu.member.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.skhu.member.entity.Professor;
import net.skhu.member.repository.ProfessorRepository;

@Service
@RequiredArgsConstructor
public class BaseProfessorService implements ProfessorService{
	private final ProfessorRepository professorRepository;
	
	@Override
	public void save(String name, String department, String loginId, String loginPw) {
		professorRepository.save(new Professor(name, department, loginId, loginPw));
	}
	
	@Override
	public Professor find(String loginId, String loginPw) {
		Optional<Professor> ProfessorOptional = professorRepository.findByLoginIdAndLoginPw(loginId, loginPw);
		
		return ProfessorOptional.orElse(null);
	}
}
