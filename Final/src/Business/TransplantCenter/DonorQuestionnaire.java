/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TransplantCenter;

/**
 *
 * @author Aissw
 */
public class DonorQuestionnaire {
    private Boolean ageLessThanEighty;
    private Boolean longTermMedication;
    private Boolean recentSurgery;
    private Boolean cancerPositive;
    private Boolean morbidObesityPositive;
    private Boolean HIVPositive;
    private Boolean diabetesPositive;

    public Boolean getAgeLessThanEighty() {
        return ageLessThanEighty;
    }

    public void setAgeLessThanEighty(Boolean ageLessThanEighty) {
        this.ageLessThanEighty = ageLessThanEighty;
    }

    public Boolean getLongTermMedication() {
        return longTermMedication;
    }

    public void setLongTermMedication(Boolean longTermMedication) {
        this.longTermMedication = longTermMedication;
    }

    public Boolean getRecentSurgery() {
        return recentSurgery;
    }

    public void setRecentSurgery(Boolean recentSurgery) {
        this.recentSurgery = recentSurgery;
    }

    public Boolean getCancerPositive() {
        return cancerPositive;
    }

    public void setCancerPositive(Boolean cancerPositive) {
        this.cancerPositive = cancerPositive;
    }

    public Boolean getMorbidObesityPositive() {
        return morbidObesityPositive;
    }

    public void setMorbidObesityPositive(Boolean morbidObesityPositive) {
        this.morbidObesityPositive = morbidObesityPositive;
    }

    public Boolean getHIVPositive() {
        return HIVPositive;
    }

    public void setHIVPositive(Boolean HIVPositive) {
        this.HIVPositive = HIVPositive;
    }

    public Boolean getDiabetesPositive() {
        return diabetesPositive;
    }

    public void setDiabetesPositive(Boolean diabetesPositive) {
        this.diabetesPositive = diabetesPositive;
    }
    
    
}
