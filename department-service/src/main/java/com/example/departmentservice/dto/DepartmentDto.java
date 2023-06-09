package com.example.departmentservice.dto;

import com.example.departmentservice.validation.UniqueDepartment;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    @NotBlank(message="Can't be null")
    private String departmentName;

    private String departmentDescription;

    @NotBlank(message="Can't be null")
    @UniqueDepartment
    private String departmentCode;
}
