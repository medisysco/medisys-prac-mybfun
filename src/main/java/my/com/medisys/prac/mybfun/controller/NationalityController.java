package my.com.medisys.prac.mybfun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.com.medisys.prac.mybfun.entity.Nationality;
import my.com.medisys.prac.mybfun.service.NationalityService;

@RestController
@RequestMapping(value = "/nationality")
public class NationalityController {

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(NationalityController.class);

    @Autowired
    NationalityService service;

    @GetMapping
    public Map<String, Object> findAll() {
        Map<String, Object> res = new HashMap<String, Object>();
        //List<Nationality> nationalities = service.findAll();
        List<Nationality> nationalities = service.selectAll();
        String message = CollectionUtils.isEmpty(nationalities) ? "No Record Found" : "Records Found";
        res.put("data", nationalities);
        res.put("message", message);
        res.put("success", true);
        return res;
    }

    @GetMapping("/{nationalityCode}")
    public Map<String, Object> findByMaritalStatusCode(@PathVariable("nationalityCode") String nationalityCode) {
        Map<String, Object> res = new HashMap<String, Object>();
        //Nationality nationality = service.findByNationalityCode(nationalityCode);
        Nationality nationality = service.selectByNationalityCode(nationalityCode);
        String message = ObjectUtils.isEmpty(nationality) ? "No Record Found" : "One Record Found";
        res.put("data", nationality);
        res.put("message", message);
        res.put("success", true);
        return res;
    }

}
