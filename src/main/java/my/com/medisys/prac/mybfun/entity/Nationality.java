package my.com.medisys.prac.mybfun.entity;

import java.io.Serializable;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public class Nationality implements Serializable {

    private static final long serialVersionUID = 237496785266728983L;

    private String nationalityCode;
    private String nationalityName;

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

}
