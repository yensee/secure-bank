package com.nc.sb.controllers.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nc.sb.api.v1.model.BankStaffListDTO;
import com.nc.sb.services.BankStaffService;

@Controller
@RequestMapping(BankStaffController.BASE_URL)
public class BankStaffController {
        public static final String BASE_URL = "/api/v1/bankstaff";

    @Autowired
    private final BankStaffService bankStaffService;

    public BankStaffController(BankStaffService bankStaffService){
        this.bankStaffService = bankStaffService;
    }

    public ResponseEntity<BankStaffListDTO> getAllCustomers(){
        return new ResponseEntity<BankStaffListDTO>(new BankStaffListDTO(bankStaffService.getAllBankingStaff()),HttpStatus.OK);
 
    }
}
