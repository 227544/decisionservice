package claimrules;

public class DecisionResponse implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4173672257360768028L;
	private static java.lang.Void messagesList;
	private java.lang.Integer claimValidationStatus;
	private java.lang.String claimValidationName;
	private java.lang.String claimRejectedReason;


	public static java.lang.Void getMessagesList() {
		return messagesList;
	}

	public void setMessagesList(java.lang.Void messagesList) {
		DecisionResponse.messagesList = messagesList;
	}

	public java.lang.Integer getClaimValidationStatus() {
		return claimValidationStatus;
	}

	public void setClaimValidationStatus(java.lang.Integer claimValidationStatus) {
		this.claimValidationStatus = claimValidationStatus;
	}

	public java.lang.String getClaimValidationName() {
		return claimValidationName;
	}

	public void setClaimValidationName(java.lang.String claimValidationName) {
		this.claimValidationName = claimValidationName;
	}

	public java.lang.String getClaimRejectedReason() {
		return claimRejectedReason;
	}

	public void setClaimRejectedReason(java.lang.String claimRejectedReason) {
		this.claimRejectedReason = claimRejectedReason;
	}

}
