package net.skhu.subject.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SubjectRead {
	private Integer id;
	private String name;
	private String department;
	private String professor;
	private Integer capacity;
}
