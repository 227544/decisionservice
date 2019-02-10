package claimrules;



public class Declaration implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7560386231368242333L;
	private java.lang.String claimRuleId;
	private java.util.Date ocurrenceDate;
	private java.util.Date reportDate;
	// to review real class
	private java.lang.Integer days;
	private java.lang.String logic;
	private java.lang.Integer reportPeriod;
	private java.lang.String unit;
	private java.lang.Boolean vigencia;
	private java.lang.Integer years;
	private java.util.Date birthdate;

	
	
	public java.lang.String getClaimRuleId() {
		return claimRuleId;
	}
	public void setClaimRuleId(java.lang.String claimRuleId) {
		this.claimRuleId = claimRuleId;
	}
	public java.lang.Integer getDays() {
		return days;
	}
	public void setDays(java.lang.Integer days) {
		this.days = days;
	}
	public java.lang.String getLogic() {
		return logic;
	}
	public void setLogic(java.lang.String logic) {
		this.logic = logic;
	}
	public java.lang.Integer getReportPeriod() {
		return reportPeriod;
	}
	public void setReportPeriod(java.lang.Integer reportPeriod) {
		this.reportPeriod = reportPeriod;
	}
	public java.lang.String getUnit() {
		return unit;
	}
	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}
	public java.lang.Boolean getVigencia() {
		return vigencia;
	}
	public void setVigencia(java.lang.Boolean vigencia) {
		this.vigencia = vigencia;
	}
	public java.lang.Integer getYears() {
		return years;
	}
	public void setYears(java.lang.Integer years) {
		this.years = years;
	}
	public java.util.Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(java.util.Date reportDate) {
		this.reportDate = reportDate;
	}
	public java.util.Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}
	public java.util.Date getOcurrenceDate() {
		return ocurrenceDate;
	}
	public void setOcurrenceDate(java.util.Date ocurrenceDate) {
		this.ocurrenceDate = ocurrenceDate;
	}
	

}
