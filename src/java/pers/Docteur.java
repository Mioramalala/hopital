/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import sal.Salaire;

/**
 *
 * @author itu
 */
public class Docteur {
    private int IDDOC;
    private Salaire IDSALAIRE;
    private String NOMDOC;
    private String PRENOMDOC;
    private String DATES;

    public int getIDDOC() {
        return IDDOC;
    }

    public void setIDDOC(int IDDOC) {
        this.IDDOC = IDDOC;
    }

    public Salaire getIDSALAIRE() {
        return IDSALAIRE;
    }

    public void setIDSALAIRE(Salaire IDSALAIRE) {
        this.IDSALAIRE = IDSALAIRE;
    }

    public String getNOMDOC() {
        return NOMDOC;
    }

    public void setNOMDOC(String NOMDOC) {
        this.NOMDOC = NOMDOC;
    }

    public String getPRENOMDOC() {
        return PRENOMDOC;
    }

    public void setPRENOMDOC(String PRENOMDOC) {
        this.PRENOMDOC = PRENOMDOC;
    }

    public static java.sql.Date convertDate(String dateString){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date sql = null;
            try {

                Date parsed = format.parse(dateString);
                sql = new java.sql.Date(parsed.getTime());
               
                //String datef = formatter.format(date);

            } catch (ParseException e) {
                e.printStackTrace();
            }
             return sql;
        }
    
    public java.sql.Date getDATES() {
        return convertDate(DATES);
    }

    public void setDATE_NAISSANCEDOC(String DATES) {
        this.DATES = DATES;
    }
    
}
