package my.com.medisys.prac.mybfun.service;

import java.util.List;

import my.com.medisys.prac.mybfun.entity.Patient;

public interface PatientService {
    List<Patient> selectAll();
    List<Patient> selectByPatient(Patient patient);
    Patient selectByPatientNo(int patientNo);
    Patient insert(Patient patient);
    Patient update(int patientNo, Patient patient);
    Patient delete(int patientNo);
}
