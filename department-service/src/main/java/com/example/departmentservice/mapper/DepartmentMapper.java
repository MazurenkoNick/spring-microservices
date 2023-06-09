package com.example.departmentservice.mapper;

import com.example.departmentservice.dto.DepartmentDto;
import com.example.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDto departmentToDto(Department department);

    @Mapping(target = "id", ignore = true)
    Department dtoToDepartment(DepartmentDto departmentDto);
}
