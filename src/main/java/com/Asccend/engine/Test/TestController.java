package com.Asccend.engine.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Asccend.engine.Models.SCNMORDP;
import com.Asccend.engine.Repositories.SCNMORDP_Repository;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    public TestRepository testRepository;

    @Autowired
    SCNMORDP_Repository scnmordp_Repository;

    @GetMapping("/query")
    public ResponseEntity query() {
        List<OrderCustomerDTO> list = this.testRepository.findAllCoba();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
