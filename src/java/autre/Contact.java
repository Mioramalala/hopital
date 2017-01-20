/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autre;

/**
 *
 * @author itu
 */
public class Contact {
    private int IDCONT;
    private int IDDOC;
    private String CONTACT;

    public int getIDCONT() {
        return IDCONT;
    }

    public void setIDCONT(int IDCONT) {
        this.IDCONT = IDCONT;
    }

    public int getIDDOC() {
        return IDDOC;
    }

    public void setIDDOC(int IDDOC) {
        this.IDDOC = IDDOC;
    }

    public String getCONTACT() {
        return CONTACT;
    }

    public void setCONTACT(String CONTACT) {
        this.CONTACT = CONTACT;
    }
}
