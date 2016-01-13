package cn.edu.sjzc.cms.model;

import java.util.Date;

public class Article {
	private int id;
	private String title;
	private String source;
	private String author;
	private String content;
	private Date create_time;
	private Date update_time;
	private Date publish_time;
	private Channel channel;
	private boolean is_header_line;
	private boolean is_recommend;
	private int click_score;
	private int msg_count;
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public boolean isIs_header_line() {
		return is_header_line;
	}
	public void setIs_header_line(boolean isHeaderLine) {
		is_header_line = isHeaderLine;
	}
	public boolean isIs_recommend() {
		return is_recommend;
	}
	public void setIs_recommend(boolean isRecommend) {
		is_recommend = isRecommend;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date createTime) {
		create_time = createTime;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date updateTime) {
		update_time = updateTime;
	}
	public Date getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(Date publishTime) {
		publish_time = publishTime;
	}
	public int getClick_score() {
		return click_score;
	}
	public void setClick_score(int clickScore) {
		click_score = clickScore;
	}
	public int getMsg_count() {
		return msg_count;
	}
	public void setMsg_count(int msgCount) {
		msg_count = msgCount;
	}
}
