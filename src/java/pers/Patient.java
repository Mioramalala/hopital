/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers;

import java.util.Date;

/**
 *
 * @author itu
 */
public class Patient {
    private int IDPAT;
    private Docteur IDDOC;
    private String NOMPAT;
    private String PRENOMPAT;

    public String getRefPat() {
        return refPat;
    }

    public void setRefPat(String refPat) {
        this.refPat = refPat;
    }
    private Date DATE_NAISSANCE;
    private String PROFESSION;
    private String refPat;

    public int getIDPAT() {
        return IDPAT;
    }

    public void setIDPAT(int IDPAT) {
        this.IDPAT = IDPAT;
    }

    public Docteur getIDDOC() {
        return IDDOC;
    }

    public void setIDDOC(Docteur IDDOC) {
        this.IDDOC = IDDOC;
    }

    public String getNOMPAT() {
        return NOMPAT;
    }

    public void setNOMPAT(String NOMPAT) {
        this.NOMPAT = NOMPAT;
    }

    public String getPRENOMPAT() {
        return PRENOMPAT;
    }

    public void setPRENOMPAT(String PRENOMPAT) {
        this.PRENOMPAT = PRENOMPAT;
    }

    public Date getDATE_NAISSANCE() {
        return DATE_NAISSANCE;
    }

    public void setDATE_NAISSANCE(Date DATE_NAISSANCE) {
        this.DATE_NAISSANCE = DATE_NAISSANCE;
    }

    public String getPROFESSION() {
        return PROFESSION;
    }

    public void setPROFESSION(String PROFESSION) {
        this.PROFESSION = PROFESSION;
    }
    
}
