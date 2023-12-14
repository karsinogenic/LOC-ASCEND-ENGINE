package com.Asccend.engine.Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Asccend.engine.Models.SCNMORDP;
import com.Asccend.engine.Models.SCNMORDP_NEW;
import com.Asccend.engine.Models.SCNMORDP_ReqBody;
import com.Asccend.engine.Models.SCNTFINP;
import com.Asccend.engine.Repositories.SCNMORDP_Repository;
import com.Asccend.engine.Repositories.SCNTFIN_Repository;

@RestController
@RequestMapping("/api")
public class APIMainController {

    @Autowired
    public SCNMORDP_Repository scnmordp_Repository;

    @Autowired
    public SCNTFIN_Repository scntfin_Repository;

    @PostMapping("/SCNMORDP")
    public ResponseEntity scnmordp(@RequestBody SCNMORDP_ReqBody reqBody) {
        // System.out.println("masook");
        Map respsonse = new HashMap<>();
        if (reqBody.getCardnum() == null) {
            respsonse.put("rc", 400);
            respsonse.put("detail", "Card number harus ada");
            return new ResponseEntity<>(respsonse, HttpStatus.OK);
        }

        List<String> plancode = new ArrayList<>();
        if (reqBody.getPlancode().size() > 0) {
            plancode = reqBody.getPlancode();
        }

        // String[] plancode = { "C060", "LCT2" };
        List<SCNMORDP> list = new ArrayList<SCNMORDP>();
        try {
            list = this.scnmordp_Repository.findByCardNumberNew(reqBody.getCardnum(), plancode);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // List<SCNMORDP> list =
        // this.scnmordp_Repository.findByCardNumber(reqBody.getCardnum(),
        // reqBody.getPlancode());
        List<SCNMORDP_NEW> list_new = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Optional<SCNTFINP> opt = this.scntfin_Repository.findById(list.get(i).getRefId());
            SCNMORDP_NEW scnmordp = new SCNMORDP_NEW();
            scnmordp.setCardNumber(list.get(i).getCardNum());
            if (opt.isPresent()) {
                ModelMapper modelMapper = new ModelMapper();
                scnmordp = modelMapper.map(list.get(i), SCNMORDP_NEW.class);
                scnmordp.setMonthlyBill(opt.get().getMthAmount());
                // System.out.println(scnmordp.getMonthlyBill());
                list_new.add(scnmordp);
            }
        }

        // Optional<SCNTFINP> list1 = this.scntfin_Repository.findByRef();
        respsonse.put("rc", 200);
        respsonse.put("detail", "Success");
        respsonse.put("data", list_new);
        // respsonse.put("data1", list1);
        return new ResponseEntity<>(respsonse, HttpStatus.OK);
    }

}
