package my.com.medisys.prac.mybfun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.medisys.prac.mybfun.entity.Nationality;
import my.com.medisys.prac.mybfun.mapper.NationalityMapper;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
@Service
public class NationalityServiceImpl implements NationalityService{

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(NationalityServiceImpl.class);

    @Autowired
    NationalityMapper mapper;

    @Override
    public List<Nationality> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Nationality selectByNationalityCode(String nationalityCode) {
        return mapper.selectByNationalityCode(nationalityCode);
    }

}
