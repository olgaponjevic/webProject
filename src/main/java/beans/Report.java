package beans;
import java.util.Objects;

import beans.User;
import enums.ReportStatus;

public class Report {
	private int id;
	private String reason;
	private String reportDate;
	private Integer complainantId;
	private User complainant;
	private Integer defendantId;
	private User defendant;
	private ReportStatus status;
	
	public Report() {
		super();
	}

	public Report(int id, String reason, String reportDate, Integer complainantId, User complainant,
			Integer defendantId, User defendant, ReportStatus status) {
		super();
		this.id = id;
		this.reason = reason;
		this.reportDate = reportDate;
		this.complainantId = complainantId;
		this.complainant = complainant;
		this.defendantId = defendantId;
		this.defendant = defendant;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public Integer getComplainantId() {
		return complainantId;
	}

	public void setComplainantId(Integer complainantId) {
		this.complainantId = complainantId;
	}

	public User getComplainant() {
		return complainant;
	}

	public void setComplainant(User complainant) {
		this.complainant = complainant;
	}

	public Integer getDefendantId() {
		return defendantId;
	}

	public void setDefendantId(Integer defendantId) {
		this.defendantId = defendantId;
	}

	public User getDefendant() {
		return defendant;
	}

	public void setDefendant(User defendant) {
		this.defendant = defendant;
	}

	public ReportStatus getStatus() {
		return status;
	}

	public void setStatus(ReportStatus status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(complainant, complainantId, defendant, defendantId, id, reason, reportDate, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		return Objects.equals(complainant, other.complainant) && Objects.equals(complainantId, other.complainantId)
				&& Objects.equals(defendant, other.defendant) && Objects.equals(defendantId, other.defendantId)
				&& id == other.id && Objects.equals(reason, other.reason)
				&& Objects.equals(reportDate, other.reportDate) && status == other.status;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", reason=" + reason + ", reportDate=" + reportDate + ", complainantId="
				+ complainantId + ", complainant=" + complainant + ", defendantId=" + defendantId + ", defendant="
				+ defendant + ", status=" + status + "]";
	}
	
	

}
