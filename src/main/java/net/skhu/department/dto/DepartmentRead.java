package net.skhu.department.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DepartmentRead {
	private Integer id;
	private String name;
}
