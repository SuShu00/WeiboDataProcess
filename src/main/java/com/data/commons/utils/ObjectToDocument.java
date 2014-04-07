package com.data.commons.utils;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import com.data.model.UserModel;
import com.data.model.WeiboModel;

/**
 * Document转换类，用于生成Document对象
 * @author Shu
 */
public class ObjectToDocument {
	
	/**
	 * 把WeiboModel对象和UserModel对象转换成一个Document类型
	 * 
	 * @param weiboModel
	 * @param userModel
	 * @return
	 */
	public static Document ObjectToDocument(WeiboModel weiboModel,
			UserModel userModel) {
		Document doc = new Document();
		doc.add(new StringField("id", String.valueOf(userModel.getId()),
				Field.Store.YES));
		doc.add(new StringField("screen_name", userModel.getScreen_name(),
				Field.Store.YES));
		doc.add(new StringField("name", userModel.getName(), Field.Store.YES));
		doc.add(new StringField("province", String.valueOf(userModel
				.getProvince()), Field.Store.YES));
		doc.add(new StringField("city", String.valueOf(userModel.getCity()),
				Field.Store.YES));
		doc.add(new TextField("location", userModel.getLocation(),
				Field.Store.YES));
		doc.add(new TextField("description", userModel.getDescription(),
				Field.Store.YES));
		doc.add(new StringField("url", userModel.getUrl(), Field.Store.YES));
		doc.add(new StringField("profile_url", userModel.getProfile_url(),
				Field.Store.YES));
		doc.add(new StringField("profile_image_url", userModel
				.getProfile_image_url(), Field.Store.YES));
		doc.add(new StringField("domain", userModel.getDomain(),
				Field.Store.YES));
		doc.add(new StringField("gender", userModel.getGender(),
				Field.Store.YES));
		doc.add(new StringField("followers_count", String.valueOf(userModel
				.getFollowers_count()), Field.Store.YES));
		doc.add(new StringField("friends_count", String.valueOf(userModel
				.getFriends_count()), Field.Store.YES));
		doc.add(new StringField("statuses_countr", String.valueOf(userModel
				.getStatuses_count()), Field.Store.YES));
		doc.add(new StringField("favourites_count", String.valueOf(userModel
				.getFavourites_count()), Field.Store.YES));
		doc.add(new StringField("created_at", userModel.getCreated_at(),
				Field.Store.YES));
		doc.add(new StringField("following", String.valueOf(userModel
				.isFollowing()), Field.Store.YES));
		doc.add(new StringField("verified", String.valueOf(userModel
				.isVerified()), Field.Store.YES));
		doc.add(new StringField("verified_type", String.valueOf(userModel
				.getVerified_type()), Field.Store.YES));
		doc.add(new StringField("allow_all_actMsg", String.valueOf(userModel
				.isAllow_all_actMsg()), Field.Store.YES));
		doc.add(new StringField("allow_all_comment", String.valueOf(userModel
				.isAllow_all_comment()), Field.Store.YES));
		doc.add(new StringField("follow_me", String.valueOf(userModel
				.isFollow_me()), Field.Store.YES));
		doc.add(new StringField("geo_enable", String.valueOf(userModel
				.isGeo_enable()), Field.Store.YES));
		doc.add(new StringField("avatar_large", userModel.getAvatar_large(),
				Field.Store.YES));
		doc.add(new StringField("online_status", String.valueOf(userModel
				.getOnline_status()), Field.Store.YES));
		doc.add(new StringField("bi_followers_count", String.valueOf(userModel
				.getBi_followers_count()), Field.Store.YES));
		doc.add(new StringField("lang", userModel.getLang(), Field.Store.YES));
		doc.add(new TextField("verified_reason",
				userModel.getVerified_reason(), Field.Store.YES));
		doc.add(new TextField("tags", userModel.getTags(), Field.Store.YES));
		doc.add(new TextField("friendsIds", userModel.getFriendsIds(),
				Field.Store.YES));
		doc.add(new TextField("followersIds", userModel.getFollowersIds(),
				Field.Store.YES));
		doc.add(new StringField("weiboId", String.valueOf(weiboModel
				.getWeiboId()), Field.Store.YES));
		doc.add(new StringField("weibo_created_at", weiboModel.getCreated_at(),
				Field.Store.YES));
		doc.add(new StringField("id", String.valueOf(weiboModel.getId()),
				Field.Store.YES));
		doc.add(new StringField("mid", weiboModel.getMid(), Field.Store.YES));
		doc.add(new StringField("retweeted_status_id", String
				.valueOf(weiboModel.getRetweeted_status_id()), Field.Store.YES));
		doc.add(new TextField("text", String.valueOf(weiboModel.getText()),
				Field.Store.YES));
		doc.add(new StringField("source",
				String.valueOf(weiboModel.getSource()), Field.Store.YES));
		doc.add(new StringField("favorited", String.valueOf(weiboModel
				.isFavorited()), Field.Store.YES));
		doc.add(new StringField("truncated", String.valueOf(weiboModel
				.isTruncated()), Field.Store.YES));
		doc.add(new StringField("in_reply_to_status_id", String
				.valueOf(weiboModel.getIn_reply_to_status_id()),
				Field.Store.YES));
		doc.add(new StringField("in_reply_to_user_id", String
				.valueOf(weiboModel.getIn_reply_to_user_id()), Field.Store.YES));
		doc.add(new StringField("in_reply_to_screen_name", String
				.valueOf(weiboModel.getIn_reply_to_screen_name()),
				Field.Store.YES));
		doc.add(new StringField("thumbnail_pic", String.valueOf(weiboModel
				.getThumbnail_pic()), Field.Store.YES));
		doc.add(new StringField("bmiddle_pic", String.valueOf(weiboModel
				.getBmiddle_pic()), Field.Store.YES));
		doc.add(new StringField("original_pic", String.valueOf(weiboModel
				.getOriginal_pic()), Field.Store.YES));
		doc.add(new StringField("geo", String.valueOf(weiboModel.getGeo()),
				Field.Store.YES));
		doc.add(new StringField("pic_urls", String.valueOf(weiboModel
				.getPic_urls()), Field.Store.YES));
		doc.add(new StringField("reposts_count", String.valueOf(weiboModel
				.getReposts_count()), Field.Store.YES));
		doc.add(new StringField("comments_count", String.valueOf(weiboModel
				.getComments_count()), Field.Store.YES));
		doc.add(new StringField("attitudes_count", String.valueOf(weiboModel
				.getAttitudes_count()), Field.Store.YES));
		doc.add(new StringField("mlevel",
				String.valueOf(weiboModel.getMlevel()), Field.Store.YES));
		doc.add(new StringField("visible", String.valueOf(weiboModel
				.getVisible()), Field.Store.YES));
		doc.add(new StringField("uid", String.valueOf(weiboModel.getUid()),
				Field.Store.YES));
		return doc;
	}

	/**
	 * 把WeiboModel对象转换成Document对象
	 * 
	 * @param weiboModel
	 * @return
	 */
	public static Document ObjectToDocument(WeiboModel weiboModel) {
		Document doc = new Document();
		doc.add(new StringField("weiboId", String.valueOf(weiboModel
				.getWeiboId()), Field.Store.YES));
		doc.add(new StringField("weibo_created_at", weiboModel.getCreated_at(),
				Field.Store.YES));
		doc.add(new StringField("id", String.valueOf(weiboModel.getId()),
				Field.Store.YES));
		doc.add(new StringField("mid", weiboModel.getMid(), Field.Store.YES));
		doc.add(new StringField("retweeted_status_id", String
				.valueOf(weiboModel.getRetweeted_status_id()), Field.Store.YES));
		doc.add(new TextField("text", String.valueOf(weiboModel.getText()),
				Field.Store.YES));
		doc.add(new StringField("source",
				String.valueOf(weiboModel.getSource()), Field.Store.YES));
		doc.add(new StringField("favorited", String.valueOf(weiboModel
				.isFavorited()), Field.Store.YES));
		doc.add(new StringField("truncated", String.valueOf(weiboModel
				.isTruncated()), Field.Store.YES));
		doc.add(new StringField("in_reply_to_status_id", String
				.valueOf(weiboModel.getIn_reply_to_status_id()),
				Field.Store.YES));
		doc.add(new StringField("in_reply_to_user_id", String
				.valueOf(weiboModel.getIn_reply_to_user_id()), Field.Store.YES));
		doc.add(new StringField("in_reply_to_screen_name", String
				.valueOf(weiboModel.getIn_reply_to_screen_name()),
				Field.Store.YES));
		doc.add(new StringField("thumbnail_pic", String.valueOf(weiboModel
				.getThumbnail_pic()), Field.Store.YES));
		doc.add(new StringField("bmiddle_pic", String.valueOf(weiboModel
				.getBmiddle_pic()), Field.Store.YES));
		doc.add(new StringField("original_pic", String.valueOf(weiboModel
				.getOriginal_pic()), Field.Store.YES));
		doc.add(new StringField("geo", String.valueOf(weiboModel.getGeo()),
				Field.Store.YES));
		doc.add(new StringField("pic_urls", String.valueOf(weiboModel
				.getPic_urls()), Field.Store.YES));
		doc.add(new StringField("reposts_count", String.valueOf(weiboModel
				.getReposts_count()), Field.Store.YES));
		doc.add(new StringField("comments_count", String.valueOf(weiboModel
				.getComments_count()), Field.Store.YES));
		doc.add(new StringField("attitudes_count", String.valueOf(weiboModel
				.getAttitudes_count()), Field.Store.YES));
		doc.add(new StringField("mlevel",
				String.valueOf(weiboModel.getMlevel()), Field.Store.YES));
		doc.add(new StringField("visible", String.valueOf(weiboModel
				.getVisible()), Field.Store.YES));
		doc.add(new StringField("uid", String.valueOf(weiboModel.getUid()),
				Field.Store.YES));
		return doc;
	}

	/**
	 * 把UserModel对象转换成Document对象
	 * 
	 * @param userModel
	 * @return
	 */
	public static Document ObjectToDocument(UserModel userModel) {
		Document doc = new Document();
		doc.add(new StringField("id", String.valueOf(userModel.getId()),
				Field.Store.YES));
		doc.add(new StringField("screen_name", userModel.getScreen_name(),
				Field.Store.YES));
		doc.add(new StringField("name", userModel.getName(), Field.Store.YES));
		doc.add(new StringField("province", String.valueOf(userModel
				.getProvince()), Field.Store.YES));
		doc.add(new StringField("city", String.valueOf(userModel.getCity()),
				Field.Store.YES));
		doc.add(new TextField("location", userModel.getLocation(),
				Field.Store.YES));
		doc.add(new TextField("description", userModel.getDescription(),
				Field.Store.YES));
		doc.add(new StringField("url", userModel.getUrl(), Field.Store.YES));
		doc.add(new StringField("profile_url", userModel.getProfile_url(),
				Field.Store.YES));
		doc.add(new StringField("profile_image_url", userModel
				.getProfile_image_url(), Field.Store.YES));
		doc.add(new StringField("domain", userModel.getDomain(),
				Field.Store.YES));
		doc.add(new StringField("gender", userModel.getGender(),
				Field.Store.YES));
		doc.add(new StringField("followers_count", String.valueOf(userModel
				.getFollowers_count()), Field.Store.YES));
		doc.add(new StringField("friends_count", String.valueOf(userModel
				.getFriends_count()), Field.Store.YES));
		doc.add(new StringField("statuses_countr", String.valueOf(userModel
				.getStatuses_count()), Field.Store.YES));
		doc.add(new StringField("favourites_count", String.valueOf(userModel
				.getFavourites_count()), Field.Store.YES));
		doc.add(new StringField("created_at", userModel.getCreated_at(),
				Field.Store.YES));
		doc.add(new StringField("following", String.valueOf(userModel
				.isFollowing()), Field.Store.YES));
		doc.add(new StringField("verified", String.valueOf(userModel
				.isVerified()), Field.Store.YES));
		doc.add(new StringField("verified_type", String.valueOf(userModel
				.getVerified_type()), Field.Store.YES));
		doc.add(new StringField("allow_all_actMsg", String.valueOf(userModel
				.isAllow_all_actMsg()), Field.Store.YES));
		doc.add(new StringField("allow_all_comment", String.valueOf(userModel
				.isAllow_all_comment()), Field.Store.YES));
		doc.add(new StringField("follow_me", String.valueOf(userModel
				.isFollow_me()), Field.Store.YES));
		doc.add(new StringField("geo_enable", String.valueOf(userModel
				.isGeo_enable()), Field.Store.YES));
		doc.add(new StringField("avatar_large", userModel.getAvatar_large(),
				Field.Store.YES));
		doc.add(new StringField("online_status", String.valueOf(userModel
				.getOnline_status()), Field.Store.YES));
		doc.add(new StringField("bi_followers_count", String.valueOf(userModel
				.getBi_followers_count()), Field.Store.YES));
		doc.add(new StringField("lang", userModel.getLang(), Field.Store.YES));
		doc.add(new TextField("verified_reason",
				userModel.getVerified_reason(), Field.Store.YES));
		doc.add(new TextField("tags", userModel.getTags(), Field.Store.YES));
		doc.add(new TextField("friendsIds", userModel.getFriendsIds(),
				Field.Store.YES));
		doc.add(new TextField("followersIds", userModel.getFollowersIds(),
				Field.Store.YES));
		return doc;
	}
}
