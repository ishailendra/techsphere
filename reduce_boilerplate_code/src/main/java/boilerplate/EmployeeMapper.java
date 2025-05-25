package boilerplate;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper( EmployeeMapper.class ); 
	
	@Mapping(source = "empName", target = "employeeName")
	EmployeeDTO employeetoEmployeeDto(Employee employee);
}
