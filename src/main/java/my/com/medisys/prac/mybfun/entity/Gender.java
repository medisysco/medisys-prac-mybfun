package my.com.medisys.prac.mybfun.entity;

import java.io.Serializable;

/**
 * @author    Medisys<devs@medisys.com.my>
 * @version   0.0.00.GA
 * @since     0.0.00.GA
 */
public class Gender implements Serializable {

    private static final long serialVersionUID = -5447498767683263429L;

    private String genderCode;
    private String genderName;

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

}
