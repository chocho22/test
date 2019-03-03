package study190301;

public class BoardInfoVO {
	private Integer num;
	private String title;
	private String content;
	private String credat;
	private String cretim;
	private Integer cnt;
	private String isactive;
	
	@Override
	public String toString() {
		return "BoardInfoVO [num=" + num + ", title=" + title + ", content=" + content + ", credat=" + credat
				+ ", cretim=" + cretim + ", cnt=" + cnt + ", isactive=" + isactive + "]";
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCredat() {
		return credat;
	}
	public void setCredat(String credat) {
		this.credat = credat;
	}
	public String getCretim() {
		return cretim;
	}
	public void setCretim(String cretim) {
		this.cretim = cretim;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
}
