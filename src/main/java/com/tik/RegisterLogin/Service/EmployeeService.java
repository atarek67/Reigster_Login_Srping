package com.tik.RegisterLogin.Service;

import com.tik.RegisterLogin.Dto.EmployeeDTO;
import com.tik.RegisterLogin.Dto.LoginDTO;
import com.tik.RegisterLogin.LoginMesage;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);
}
