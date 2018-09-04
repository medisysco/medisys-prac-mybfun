package my.com.medisys.prac.mybfun.entity;

import java.io.Serializable;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public class MaritalStatus implements Serializable {

    private static final long serialVersionUID = -2317459317638748639L;

    private String maritalStatusCode;
    private String maritalStatusName;

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getMaritalStatusName() {
        return maritalStatusName;
    }

    public void setMaritalStatusName(String maritalStatusName) {
        this.maritalStatusName = maritalStatusName;
    }

}
