package com.Asccend.engine.Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.hibernate.query.NativeQuery;
import org.json.JSONArray;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Asccend.engine.Models.CARDP_ACCP_CUSTP;
import com.Asccend.engine.Models.CXHST;
import com.Asccend.engine.Models.HistorySCNMORDP;
import com.Asccend.engine.Models.MORDP_MOBL;
import com.Asccend.engine.Models.SCMCTDTP;
import com.Asccend.engine.Models.SCMMEMOP;
import com.Asccend.engine.Models.SCNMORDP;
import com.Asccend.engine.Models.SCNMORDP_NEW;
import com.Asccend.engine.Models.SCNMORDP_ReqBody;
import com.Asccend.engine.Models.SCNTFINP;
import com.Asccend.engine.Repositories.CARDP_ACCP_CUSTP_Repository;
import com.Asccend.engine.Repositories.CXHST_Repository;
import com.Asccend.engine.Repositories.MORDP_MOBL_Repository;
import com.Asccend.engine.Repositories.SCMCTDTP_Repository;
import com.Asccend.engine.Repositories.SCMMEMOP_Repository;
import com.Asccend.engine.Repositories.SCNMORDP_Repository;
import com.Asccend.engine.Repositories.SCNTFIN_Repository;
import com.Asccend.engine.Services.JdbcQueryService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class APIMainController {

    @Autowired
    public SCNMORDP_Repository scnmordp_Repository;

    @Autowired
    public CARDP_ACCP_CUSTP_Repository cardp_repo;

    @Autowired
    public CXHST_Repository cxhst_repo;

    @Autowired
    public MORDP_MOBL_Repository mordp_mobl_repo;

    @Autowired
    public SCMCTDTP_Repository scmctdtp_repo;

    @Autowired
    public SCNTFIN_Repository scntfin_Repository;

    @Autowired
    public SCMMEMOP_Repository scmmemop_Repository;

    @Autowired
    private EntityManager entityManager;

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

    @GetMapping("/newSCNMORDP")
    public ResponseEntity newSCNMORDP() {
        Query query = entityManager.createNativeQuery("SELECT TOP 3 * FROM SCNMORDP", HistorySCNMORDP.class);
        List<HistorySCNMORDP> historySCNMORDP = query.getResultList();
        return new ResponseEntity(historySCNMORDP, null, 200);
    }

    @GetMapping("/findTop1")
    public ResponseEntity<Map> findTop1() {
        Map hasil = new HashMap<>();
        try {
            SCMCTDTP scmctdtp = this.scmctdtp_repo.findTopOne();
            CARDP_ACCP_CUSTP card = this.cardp_repo.findTopOne();
            CXHST cxhst = this.cxhst_repo.findTopOne();
            MORDP_MOBL mordp_MOBL = this.mordp_mobl_repo.findTopOne();
            hasil.put("SCMCTDTP", scmctdtp);
            hasil.put("CARDP_ACCP_CUSTP", card);
            hasil.put("CXHST", cxhst);
            hasil.put("MORDP_MOBL", mordp_MOBL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Map>(hasil, null, 200);

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/findSCMMEMOP")
    public ResponseEntity<Map> findScmmemop(@RequestParam(required = true) String memoKey,
            @RequestParam(required = true) String memoType, @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer size) {
        Map hasil = new HashMap<>();
        List<Map<String, Object>> result = jdbcTemplate.queryForList(
                "select * from ASCCEND_UAT.dbo.SCMMEMOP s1_0 where s1_0.MEMO_KEY='" + memoKey + "' and s1_0.MEMO_TYPE='"
                        + memoType + "' order by s1_0.MEMO_CREATE_DATE desc OFFSET " + page * size + " ROWS FETCH NEXT "
                        + size + " ROWS ONLY");

        hasil.put("RC", "00");
        hasil.put("RD", "OK");
        hasil.put("DATA", result);
        return new ResponseEntity<Map>(hasil, null, 200);
    }

    @GetMapping("/findSCMCTDTP")
    public ResponseEntity<Map> findScmctdtp(@RequestParam(required = false) String accnum,
            @RequestParam(required = false) String ccnum, @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer size) {
        Map hasil = new HashMap<>();
        PageRequest pageRequest = PageRequest.of(page, size);
        List<SCMCTDTP> scmctdtpList;
        if (accnum != null && ccnum != null) {
            scmctdtpList = this.scmctdtp_repo.findAllByCardNumAndAccNum(ccnum, accnum, pageRequest).toList();
        } else if (accnum == null && ccnum != null) {
            scmctdtpList = this.scmctdtp_repo.findAllByCardNum(ccnum, pageRequest).toList();
        } else if (accnum != null && ccnum == null) {
            scmctdtpList = this.scmctdtp_repo.findAllByAccNum(accnum, pageRequest).toList();
        } else {
            hasil.put("rc", "EX-00");
            hasil.put("rd", "Bad Param");
            return new ResponseEntity<Map>(hasil, null, 200);
        }
        try {

            System.out.println("size = " + scmctdtpList.size());
            JSONArray jsonArray = new JSONArray();
            for (SCMCTDTP scmctdtp : scmctdtpList) {
                jsonArray.put(scmctdtp.createJSON(scmctdtp));

            }
            hasil.put("rc", "00");
            hasil.put("rd", "OK");
            hasil.put("data", new JSONArray(jsonArray.toString().replaceAll("\\s", " ")).toList());
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        return new ResponseEntity<Map>(hasil, null, 200);
    }

    @GetMapping("/findCARDP")
    public ResponseEntity<Map> findCardp(@RequestParam(required = false) String accnum,
            @RequestParam(required = false) String ccnum, @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer size) {
        Map hasil = new HashMap<>();
        PageRequest pageRequest = PageRequest.of(page, size);
        List<CARDP_ACCP_CUSTP> scmctdtpList;
        if (accnum != null && ccnum != null) {
            scmctdtpList = this.cardp_repo.findAllByCardNumAndAccNum(ccnum, accnum, pageRequest).toList();
        } else if (accnum == null && ccnum != null) {
            scmctdtpList = this.cardp_repo.findAllByCardNum(ccnum, pageRequest).toList();
        } else if (accnum != null && ccnum == null) {
            scmctdtpList = this.cardp_repo.findAllByAccNum(accnum, pageRequest).toList();
        } else {
            hasil.put("rc", "EX-00");
            hasil.put("rd", "Bad Param");
            return new ResponseEntity<Map>(hasil, null, 200);
        }
        try {

            // System.out.println("size = " + scmctdtpList.size());
            JSONArray jsonArray = new JSONArray();
            for (CARDP_ACCP_CUSTP cardp_ACCP_CUSTP : scmctdtpList) {
                jsonArray.put(cardp_ACCP_CUSTP.createJSON(cardp_ACCP_CUSTP));
            }
            hasil.put("rc", "00");
            hasil.put("rd", "OK");
            hasil.put("data", new JSONArray(jsonArray.toString().replaceAll("\\s", " ")).toList());
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        return new ResponseEntity<Map>(hasil, null, 200);
    }

    @GetMapping("/findCXHST")
    public ResponseEntity<Map> findCxhst(@RequestParam(required = true) String ccnum,
            @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer size) {
        Map hasil = new HashMap<>();
        PageRequest pageRequest = PageRequest.of(page, size);
        List<CXHST> scmctdtpList;
        if (ccnum != null) {
            scmctdtpList = this.cxhst_repo.findAllByCardNum(ccnum, pageRequest).toList();
        } else {
            hasil.put("rc", "EX-00");
            hasil.put("rd", "Bad Param");
            return new ResponseEntity<Map>(hasil, null, 200);
        }
        try {

            System.out.println("size = " + scmctdtpList.size());
            JSONArray jsonArray = new JSONArray(scmctdtpList);
            hasil.put("rc", "00");
            hasil.put("rd", "OK");
            hasil.put("data", new JSONArray(jsonArray.toString().replaceAll("\\s", " ")).toList());
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        return new ResponseEntity<Map>(hasil, null, 200);
    }

    @GetMapping("/findMORDP")
    public ResponseEntity<Map> findMORDP(@RequestParam(required = true) String ccnum,
            @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer size) {
        Map hasil = new HashMap<>();
        PageRequest pageRequest = PageRequest.of(page, size);
        List<MORDP_MOBL> scmctdtpList;
        if (ccnum != null) {
            scmctdtpList = this.mordp_mobl_repo.findAllByCardNum(ccnum, pageRequest).toList();
        } else {
            hasil.put("rc", "EX-00");
            hasil.put("rd", "Bad Param");
            return new ResponseEntity<Map>(hasil, null, 200);
        }
        try {

            System.out.println("size = " + scmctdtpList.size());
            JSONArray jsonArray = new JSONArray();
            for (MORDP_MOBL mordp_MOBL : scmctdtpList) {
                jsonArray.put(mordp_MOBL.createJSON(mordp_MOBL));

            }
            hasil.put("rc", "00");
            hasil.put("rd", "OK");
            hasil.put("data", new JSONArray(jsonArray.toString().replaceAll("\\s", " ")).toList());
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        return new ResponseEntity<Map>(hasil, null, 200);
    }

}
