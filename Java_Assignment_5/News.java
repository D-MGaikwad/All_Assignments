package company;

public class News {

	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	
	public News(int newsid,String postedByUser,String commentByUser,String comment) {
		super();
		this.newsId=newsid;
		this.postedByUser=postedByUser;
		this.commentByUser=commentByUser;
 		this.comment=comment;  
 		
}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [News_Id=" + newsId + ", Posted_By_User=" + postedByUser + ", Comment_By_User=" + commentByUser
				+ ", Comment=" + comment + "]";
	}
	
	
}
