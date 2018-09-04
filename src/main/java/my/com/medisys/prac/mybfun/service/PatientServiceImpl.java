package my.com.medisys.prac.mybfun.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import my.com.medisys.prac.mybfun.entity.Patient;
import my.com.medisys.prac.mybfun.mapper.PatientMapper;

@Service
public class PatientServiceImpl implements PatientService {

    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(PatientServiceImpl.class);

    @Autowired
    PatientMapper mapper;

    @Override
    public List<Patient> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public List<Patient> selectByPatient(Patient patient) {
        return mapper.selectByPatient(patient);
    }

    @Override
    public Patient selectByPatientNo(int patientNo) {
        return mapper.selectByPatientNo(patientNo);
    }

    @Override
    public Patient insert(Patient patient) {
        mapper.insert(patient);
        return patient;
    }

    @Override
    public Patient update(int patientNo, Patient patient) {
        Patient exist = mapper.selectByPatientNo(patientNo);
        if (!ObjectUtils.isEmpty(exist)) {
            exist.setBirthDate(patient.getBirthDate());
            exist.setFathersName(patient.getFathersName());
            exist.setFirstName(patient.getFirstName());
            exist.setGenderCode(patient.getGenderCode());
            exist.setLastName(patient.getLastName());
            exist.setMaritalStatusCode(patient.getMaritalStatusCode());
            exist.setMothersName(patient.getMothersName());
            exist.setNationalityCode(patient.getNationalityCode());
            exist.setPhoneNumber(patient.getPhoneNumber());
            mapper.update(exist);
        }
        return exist;
    }

    @Override
    public Patient delete(int patientNo) {
        Patient patient = mapper.selectByPatientNo(patientNo);
        if (!ObjectUtils.isEmpty(patient)) {
            mapper.delete(patientNo);
        }
        return patient;
    }

}
