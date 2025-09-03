package beans;
import java.util.Objects;

import beans.User;

public class Review {
	private int id;
	private Integer rate;
	private String comment;
	private String reviewDate;
	private Integer userId;
	private User user;
	
	public Review() {
		super();
	}

	public Review(int id, Integer rate, String comment, String reviewDate, Integer userId, User user) {
		super();
		this.id = id;
		this.rate = rate;
		this.comment = comment;
		this.reviewDate = reviewDate;
		this.userId = userId;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, id, rate, reviewDate, user, userId);
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
		return Objects.equals(comment, other.comment) && id == other.id && Objects.equals(rate, other.rate)
				&& Objects.equals(reviewDate, other.reviewDate) && Objects.equals(user, other.user)
				&& Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", rate=" + rate + ", comment=" + comment + ", reviewDate=" + reviewDate
				+ ", userId=" + userId + ", user=" + user + "]";
	}
	

}
