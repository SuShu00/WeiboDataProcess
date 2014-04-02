package com.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserModel {
	/**
	 * 用户数据
	 */
	private long id;							//用户UID
	private String idstr;                      //字符串型用户UID
	private String screen_name;            //微博昵称
	private String name;                  //友好显示名称，如Bill Gates,名称中间的空格正常显示(此特性暂不支持)
	private int province;                 //省份编码（参考省份编码表）
	private int city;                     //城市编码（参考城市编码表）
	private String location;              //地址
	private String description;           //个人描述
	private String url;                   //用户博客地址
	private String profile_url;			//用户的微博统一URL地址
	private String profile_image_url;       //自定义图像
	private String domain;            //用户个性化域名
	private String gender;                //性别,m--男，f--女,n--未知
	private int followers_count;           //粉丝数
	private int friends_count;             //关注数
	private int statuses_count;            //微博数
	private int favourites_count;          //收藏数
	private String created_at;               //创建时间
	private boolean following;            //保留字段,是否已关注(此特性暂不支持)
	private boolean verified;             //加V标示，是否微博认证用户
	private int verified_type;             //认证类型
	private boolean allow_all_actMsg;       //是否允许所有人给我发私信
	private boolean allow_all_comment;      //是否允许所有人对我的微博进行评论
	private boolean follow_me;             //此用户是否关注我
	private boolean geo_enable;				//此用户是否允许获取地理位置
	private String avatar_large;           //大头像地址
	private int online_status;             //用户在线状态
	private int bi_followers_count;         //互粉数
	private String remark;                //备注信息，在查询用户关系时提供此字段。
	private String lang;                  //用户语言版本
	private String verified_reason;		  //认证原因
	private String weihao;				  //微號
	private String statusId;			
	private String tags;					//用户标签
	private String friendsIds;
	private String followersIds;
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdstr() {
		return idstr;
	}
	public void setIdstr(String idstr) {
		this.idstr = idstr;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getProfile_url() {
		return profile_url;
	}
	public void setProfile_url(String profile_url) {
		this.profile_url = profile_url;
	}
	public String getProfile_image_url() {
		return profile_image_url;
	}
	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getFollowers_count() {
		return followers_count;
	}
	public void setFollowers_count(int followers_count) {
		this.followers_count = followers_count;
	}
	public int getFriends_count() {
		return friends_count;
	}
	public void setFriends_count(int friends_count) {
		this.friends_count = friends_count;
	}
	public int getStatuses_count() {
		return statuses_count;
	}
	public void setStatuses_count(int statuses_count) {
		this.statuses_count = statuses_count;
	}
	public int getFavourites_count() {
		return favourites_count;
	}
	public void setFavourites_count(int favourites_count) {
		this.favourites_count = favourites_count;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public boolean isFollowing() {
		return following;
	}
	public void setFollowing(boolean following) {
		this.following = following;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public int getVerified_type() {
		return verified_type;
	}
	public void setVerified_type(int verified_type) {
		this.verified_type = verified_type;
	}
	public boolean isAllow_all_actMsg() {
		return allow_all_actMsg;
	}
	public void setAllow_all_actMsg(boolean allow_all_actMsg) {
		this.allow_all_actMsg = allow_all_actMsg;
	}
	public boolean isAllow_all_comment() {
		return allow_all_comment;
	}
	public void setAllow_all_comment(boolean allow_all_comment) {
		this.allow_all_comment = allow_all_comment;
	}
	public boolean isFollow_me() {
		return follow_me;
	}
	public void setFollow_me(boolean follow_me) {
		this.follow_me = follow_me;
	}
	public boolean isGeo_enable() {
		return geo_enable;
	}
	public void setGeo_enable(boolean geo_enable) {
		this.geo_enable = geo_enable;
	}
	public String getAvatar_large() {
		return avatar_large;
	}
	public void setAvatar_large(String avatar_large) {
		this.avatar_large = avatar_large;
	}
	public int getOnline_status() {
		return online_status;
	}
	public void setOnline_status(int online_status) {
		this.online_status = online_status;
	}
	public int getBi_followers_count() {
		return bi_followers_count;
	}
	public void setBi_followers_count(int bi_followers_count) {
		this.bi_followers_count = bi_followers_count;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getVerified_reason() {
		return verified_reason;
	}
	public void setVerified_reason(String verified_reason) {
		this.verified_reason = verified_reason;
	}
	public String getWeihao() {
		return weihao;
	}
	public void setWeihao(String weihao) {
		this.weihao = weihao;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getFriendsIds() {
		return friendsIds;
	}
	public void setFriendsIds(String friendsIds) {
		this.friendsIds = friendsIds;
	}
	public String getFollowersIds() {
		return followersIds;
	}
	public void setFollowersIds(String followersIds) {
		this.followersIds = followersIds;
	}
	@Override
	public String toString() {
		return "User [id="
				+ id
				+ ", "
				+ (idstr != null ? "idstr=" + idstr + ", " : "")
				+ (screen_name != null ? "screen_name=" + screen_name + ", "
						: "")
				+ (name != null ? "name=" + name + ", " : "")
				+ "province="
				+ province
				+ ", city="
				+ city
				+ ", "
				+ (location != null ? "location=" + location + ", " : "")
				+ (description != null ? "description=" + description + ", "
						: "")
				+ (url != null ? "url=" + url + ", " : "")
				+ (profile_url != null ? "profile_url=" + profile_url + ", "
						: "")
				+ (profile_image_url != null ? "profile_image_url="
						+ profile_image_url + ", " : "")
				+ (domain != null ? "domain=" + domain + ", " : "")
				+ (gender != null ? "gender=" + gender + ", " : "")
				+ "followers_count="
				+ followers_count
				+ ", friends_count="
				+ friends_count
				+ ", statuses_count="
				+ statuses_count
				+ ", favourites_count="
				+ favourites_count
				+ ", "
				+ (created_at != null ? "created_at=" + created_at + ", " : "")
				+ "following="
				+ following
				+ ", verified="
				+ verified
				+ ", verified_type="
				+ verified_type
				+ ", allow_all_actMsg="
				+ allow_all_actMsg
				+ ", allow_all_comment="
				+ allow_all_comment
				+ ", follow_me="
				+ follow_me
				+ ", geo_enable="
				+ geo_enable
				+ ", "
				+ (avatar_large != null ? "avatar_large=" + avatar_large + ", "
						: "")
				+ "online_status="
				+ online_status
				+ ", bi_followers_count="
				+ bi_followers_count
				+ ", "
				+ (remark != null ? "remark=" + remark + ", " : "")
				+ (lang != null ? "lang=" + lang + ", " : "")
				+ (verified_reason != null ? "verified_reason="
						+ verified_reason + ", " : "")
				+ (weihao != null ? "weihao=" + weihao + ", " : "")
				+ (statusId != null ? "statusId=" + statusId : "")
				+ "tags="
				+ tags + "]";
	}

}
