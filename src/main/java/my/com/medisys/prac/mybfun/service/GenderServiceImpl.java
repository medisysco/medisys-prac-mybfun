package my.com.medisys.prac.mybfun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.medisys.prac.mybfun.entity.Gender;
import my.com.medisys.prac.mybfun.mapper.GenderMapper;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
@Service
public class GenderServiceImpl implements GenderService{

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(GenderServiceImpl.class);

    @Autowired
    GenderMapper mapper;

    @Override
    public List<Gender> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Gender selectByGenderCode(String genderCode) {
        return mapper.selectByGenderCode(genderCode);
    }

}
