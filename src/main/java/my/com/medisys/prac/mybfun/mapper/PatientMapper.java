package my.com.medisys.prac.mybfun.mapper;

import java.util.List;

import my.com.medisys.prac.mybfun.entity.Patient;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public interface PatientMapper {
    List<Patient> selectAll();
    List<Patient> selectByPatient(Patient patient);
    Patient selectByPatientNo(Integer patientNo);
    void insert(Patient patient);
    void update(Patient patient);
    void delete(Integer patientNo);
}
