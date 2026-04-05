package net.skhu.subject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import net.skhu.subject.dto.SubjectRead;

@Getter
@Entity
@Table(name = "subjects")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 50, nullable = false)
	private String department;
	
	@Column(length = 50, nullable = false)
	private String professor;
	
	@Column(length = 3, nullable = false)
	private Integer capacity;
	
	public SubjectRead toRead() {
		return SubjectRead.builder()
			.id(id)
			.name(name)
			.department(department)
			.professor(professor)
			.capacity(capacity)
			.build();
	}
}
