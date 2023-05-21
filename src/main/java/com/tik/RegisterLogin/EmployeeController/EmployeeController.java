package com.tik.RegisterLogin.EmployeeController;


import com.tik.RegisterLogin.Dto.EmployeeDTO;
import com.tik.RegisterLogin.Dto.LoginDTO;
import com.tik.RegisterLogin.LoginMesage;
import com.tik.RegisterLogin.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO){
        LoginMesage loginMessage = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }

}
