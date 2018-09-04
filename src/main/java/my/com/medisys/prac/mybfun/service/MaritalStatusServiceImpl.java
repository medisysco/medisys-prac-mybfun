package my.com.medisys.prac.mybfun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.medisys.prac.mybfun.entity.MaritalStatus;
import my.com.medisys.prac.mybfun.mapper.MaritalStatusMapper;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
@Service
public class MaritalStatusServiceImpl implements MaritalStatusService{

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(MaritalStatusServiceImpl.class);

    @Autowired
    MaritalStatusMapper mapper;

    @Override
    public List<MaritalStatus> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public MaritalStatus selectByMaritalStatusCode(String maritalStatusCode) {
        return mapper.selectByMaritalStatusCode(maritalStatusCode);
    }

}
