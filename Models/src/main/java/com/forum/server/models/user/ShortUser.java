package com.forum.server.models.user;

/**
 * 15.08.16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class ShortUser {
    private long userId;
    private String nickName;
    private Long rating;
    private String rights;

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getRights() {
        return rights;
    }

    public ShortUser setRating(Long rating) {
        this.rating = rating;
        return this;
    }

    public ShortUser setOnline(boolean online) {
        isOnline = online;
        return this;
    }

    private String avatar;
    private boolean isOnline;

    public long getUserId() {
        return userId;
    }

    public String getNickName() {
        return nickName;
    }

    public Long getRating() {
        return rating;
    }

    public String getAvatar() {
        return avatar;
    }

    public boolean isOnline() {
        return isOnline;
    }

    protected ShortUser() {}

    protected ShortUser(Builder builder) {
        this.userId = builder.userId;
        this.nickName = builder.nickName;
        this.rating = builder.rating;
        this.avatar = builder.avatar;
        this.isOnline = builder.isOnline;
        this.rights = builder.rights;
    }

    public static class Builder {
        private long userId;
        private String nickName;
        private Long rating;
        private String avatar;
        private boolean isOnline;
        private String rights;

        public Builder Rights(String rights) {
            this.rights = rights;
            return this;
        }

        public Builder UserId(long userId) {
            this.userId = userId;
            return this;
        }

        public Builder NickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder Rating(Long rating) {
            this.rating = rating;
            return this;
        }

        public Builder Avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder IsOnline(boolean isOnline) {
            this.isOnline = isOnline;
            return this;
        }

        public  ShortUser build() {
            return new ShortUser(this);
        }
    }
}
