package net.skhu.member.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "professors")
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 50, nullable = false)
	private String department;
	
	@Column(length = 50, nullable = false, unique = true)
	private String loginId;
	
	@Column(length = 100, nullable = false)
	private String loginPw;
	
	@Column(nullable = false, updatable = false)
	@CreationTimestamp
	private LocalDateTime created;
	
	public Professor() {
	}
	
	public Professor(String name, String department, String loginId, String loginPw) {
		this.name = name;
		this.department = department;
		this.loginId = loginId;
		this.loginPw = loginPw;
	}
}

