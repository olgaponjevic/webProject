package beans;
import java.time.LocalDate;
import java.util.Objects;

import beans.User;

public class Review {
	private int id;
	private int rate;
	private String comment;
	private LocalDate reviewDate;
	private int userId;
	private boolean deleted;
	
	public Review() {
		super();
	}

	public Review(int id, int rate, String comment, LocalDate reviewDate, int userId, boolean deleted) {
		super();
		this.id = id;
		this.rate = rate;
		this.comment = comment;
		this.reviewDate = reviewDate;
		this.userId = userId;
		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, deleted, id, rate, reviewDate, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(comment, other.comment) && deleted == other.deleted && id == other.id
				&& rate == other.rate && Objects.equals(reviewDate, other.reviewDate) && userId == other.userId;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", rate=" + rate + ", comment=" + comment + ", reviewDate=" + reviewDate
				+ ", userId=" + userId + ", deleted=" + deleted + "]";
	}


}
