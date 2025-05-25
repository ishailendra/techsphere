package boilerplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EmployeeMapperTest {

	@Test
	public void testMapEmployeeToEmployeeDto() {
	    //given
	    Employee employee = new Employee("John Doe", "john@mail.com", "Sales");
	 
	    //when
	    EmployeeDTO employeeDTO = EmployeeMapper.INSTANCE.employeetoEmployeeDto(employee);
	 
	    //then
	    assertNotNull(employeeDTO);
	    assertEquals("John Doe", employeeDTO.getEmployeeName());
	    assertEquals("john@mail.com", employeeDTO.getEmail());
	    assertEquals("Sales", employeeDTO.getDept());
	}
}
