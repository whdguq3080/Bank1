/**
 * 
 */
package domain;

/**
 * @author Lee Jong-Hyup
 * @date 2018. 12. 27.
 * @dese
 * 
 */
public class ArticleBean {
	private int seq; // 글번호
	private String title,content,writer,redDate;
	
	public int getSeq() {
		return seq;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public String getRedDate() {
		return redDate;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setRedDate(String redDate) {
		this.redDate = redDate;
	}
	@Override
	public String toString() {
		return "ArticleBean [seq=" + seq + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", redDate=" + redDate + ", getSeq()=" + getSeq() + ", getTitle()=" + getTitle() + ", getContent()="
				+ getContent() + ", getWriter()=" + getWriter() + ", getRedDate()=" + getRedDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
