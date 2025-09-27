package beans;
import java.time.LocalDate;
import java.util.Objects;

import beans.User;
import enums.ReportStatus;

public class Report {
	private int id;
	private String reason;
	private LocalDate reportDate;
	private int complainantId;
	private int defendantId;
	private ReportStatus status;
	private boolean deleted;
	
	public Report() {
		super();
	}

	public Report(int id, String reason, LocalDate reportDate, int complainantId, int defendantId, ReportStatus status,
			boolean deleted) {
		super();
		this.id = id;
		this.reason = reason;
		this.reportDate = reportDate;
		this.complainantId = complainantId;
		this.defendantId = defendantId;
		this.status = status;
		this.deleted = deleted;
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

	public LocalDate getReportDate() {
		return reportDate;
	}

	public void setReportDate(LocalDate reportDate) {
		this.reportDate = reportDate;
	}

	public int getComplainantId() {
		return complainantId;
	}

	public void setComplainantId(int complainantId) {
		this.complainantId = complainantId;
	}

	public int getDefendantId() {
		return defendantId;
	}

	public void setDefendantId(int defendantId) {
		this.defendantId = defendantId;
	}

	public ReportStatus getStatus() {
		return status;
	}

	public void setStatus(ReportStatus status) {
		this.status = status;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(complainantId, defendantId, deleted, id, reason, reportDate, status);
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
		return complainantId == other.complainantId && defendantId == other.defendantId && deleted == other.deleted
				&& id == other.id && Objects.equals(reason, other.reason)
				&& Objects.equals(reportDate, other.reportDate) && status == other.status;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", reason=" + reason + ", reportDate=" + reportDate + ", complainantId="
				+ complainantId + ", defendantId=" + defendantId + ", status=" + status + ", deleted=" + deleted + "]";
	}


}
