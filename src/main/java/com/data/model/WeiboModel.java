package com.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weibo")
public class WeiboModel {
	
	/**
	 *微博信息数据模型
	 */
	private int weiboId;
	private String created_at;                              //status创建时间
	private long id;                                   //status id
	private String mid;                                  //微博MID
	private long retweeted_status_id;					//转发微博的微博id
	private String idstr;                                  //保留字段，请勿使用                     
	private String text;                                 //微博内容
	private String source;                               //微博来源
	private boolean favorited;                           //是否已收藏
	private boolean truncated;
	private String in_reply_to_status_id;                      //回复ID
	private String in_reply_to_user_id;                        //回复人ID
	private String in_reply_to_screen_name;                  //回复人昵称
	private String thumbnail_pic;                         //微博内容中的图片的缩略地址
	private String bmiddle_pic;                           //中型图片
	private String original_pic;                          //原始图片
	private String geo;                                  //地理信息，保存经纬度，没有时不返回此字段
	private String pic_urls;							//微博配图地址。多图时返回多图链接。无配图返回“[]”
	private int reposts_count;                            //转发数
	private int comments_count;                           //评论数
	private int attitudes_count;							//表态数
	private int mlevel;
	private String visible;							//微博的可见性及指定可见分组信息。该object中type取值，0：普通微博，1：私密微博，3：指定分组微博，4：密友微博；list_id为分组的组号
	private long uid;								//用户id
	
	@Id
	@GeneratedValue
	public int getWeiboId() {
		return weiboId;
	}
	public void setWeiboId(int weiboId) {
		this.weiboId = weiboId;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public long getRetweeted_status_id() {
		return retweeted_status_id;
	}
	public void setRetweeted_status_id(long retweeted_status_id) {
		this.retweeted_status_id = retweeted_status_id;
	}
	public String getIdstr() {
		return idstr;
	}
	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public boolean isFavorited() {
		return favorited;
	}
	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}
	public boolean isTruncated() {
		return truncated;
	}
	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}
	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}
	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}
	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}
	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}
	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}
	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}
	public String getThumbnail_pic() {
		return thumbnail_pic;
	}
	public void setThumbnail_pic(String thumbnail_pic) {
		this.thumbnail_pic = thumbnail_pic;
	}
	public String getBmiddle_pic() {
		return bmiddle_pic;
	}
	public void setBmiddle_pic(String bmiddle_pic) {
		this.bmiddle_pic = bmiddle_pic;
	}
	public String getOriginal_pic() {
		return original_pic;
	}
	public void setOriginal_pic(String original_pic) {
		this.original_pic = original_pic;
	}
	public String getGeo() {
		return geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}
	public String getPic_urls() {
		return pic_urls;
	}
	public void setPic_urls(String pic_urls) {
		this.pic_urls = pic_urls;
	}
	public int getReposts_count() {
		return reposts_count;
	}
	public void setReposts_count(int reposts_count) {
		this.reposts_count = reposts_count;
	}
	public int getComments_count() {
		return comments_count;
	}
	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}
	public int getAttitudes_count() {
		return attitudes_count;
	}
	public void setAttitudes_count(int attitudes_count) {
		this.attitudes_count = attitudes_count;
	}
	public int getMlevel() {
		return mlevel;
	}
	public void setMlevel(int mlevel) {
		this.mlevel = mlevel;
	}
	public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String toString() {
		return "WeiboModel ["
				+ (created_at != null ? "created_at=" + created_at + ", " : "")
				+ "id="
				+ id
				+ ", "
				+ (mid != null ? "mid=" + mid + ", " : "")
				+ (idstr != null ? "idstr=" + idstr + ", " : "")
				+ (text != null ? "text=" + text + ", " : "")
				+ (source != null ? "source=" + source + ", " : "")
				+ "favorited="
				+ favorited
				+ ", truncated="
				+ truncated
				+ ", "
				+ (in_reply_to_status_id != null ? "in_reply_to_status_id="
						+ in_reply_to_status_id + ", " : "")
				+ (in_reply_to_user_id != null ? "in_reply_to_user_id="
						+ in_reply_to_user_id + ", " : "")
				+ (in_reply_to_screen_name != null ? "in_reply_to_screen_name="
						+ in_reply_to_screen_name + ", " : "")
				+ (thumbnail_pic != null ? "thumbnail_pic=" + thumbnail_pic
						+ ", " : "")
				+ (bmiddle_pic != null ? "bmiddle_pic=" + bmiddle_pic + ", "
						: "")
				+ (original_pic != null ? "original_pic=" + original_pic + ", "
						: "") + (geo != null ? "geo=" + geo + ", " : "")
				+ (pic_urls != null ? "pic_urls=" + pic_urls + ", " : "")
				+ "reposts_count=" + reposts_count + ", comments_count="
				+ comments_count + ", attitudes_count=" + attitudes_count
				+ ", mlevel=" + mlevel + ", "
				+ (visible != null ? "visible=" + visible + ", " : "") + "uid="
				+ uid + "]";
	}

}
