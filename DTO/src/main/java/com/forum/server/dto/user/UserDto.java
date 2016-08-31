package com.forum.server.dto.user;

/**
 * 08.08.16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class UserDto extends ShortUserDto {
    private String name;
    private String mail;
    private Long dateOfBirth;
    private String info;
    private long registrationTime;
    private long lastSession;
    private long messagesCount;
    private long themesCount;

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public Long getDateOfBirth() {
        return dateOfBirth;
    }

    public String getInfo() {
        return info;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public Long getLastSession() {
        return lastSession;
    }

    public long getMessagesCount() {
        return messagesCount;
    }

    public long getThemesCount() {
        return themesCount;
    }

    protected UserDto() {
    }

    private UserDto(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.mail = builder.mail;
        this.dateOfBirth = builder.dateOfBirth;
        this.info = builder.info;
        this.registrationTime = builder.registrationTime;
        this.lastSession = builder.lastSession;
        this.messagesCount = builder.messagesCount;
        this.themesCount = builder.themesCount;
    }



    public static class Builder extends ShortUserDto.Builder{
        private String name;
        private String mail;
        private Long dateOfBirth;
        private String info;
        private long registrationTime;
        private long lastSession;
        private long messagesCount;
        private long themesCount;

        @Override
        public Builder Rights(String rights) {
            super.Rights(rights);
            return this;
        }

        @Override
        public Builder UserId(long UserDtoId) {
            super.UserId(UserDtoId);
            return this;
        }

        @Override
        public Builder NickName(String nickName) {
            super.NickName(nickName);
            return this;
        }

        @Override
        public Builder Rating(long rating) {
            super.Rating(rating);
            return this;
        }

        @Override
        public Builder Avatar(String avatar) {
            super.Avatar(avatar);
            return this;
        }

        @Override
        public Builder Online(boolean isOnline) {
            super.Online(isOnline);
            return this;
        }

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder Mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder DateOfBirth(Long dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder Info(String info) {
            this.info = info;
            return this;
        }

        public Builder RegistrationTime(long registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }

        public Builder LastSession(long lastSession) {
            this.lastSession = lastSession;
            return this;
        }

        public Builder MessagesCount(long messagesCount) {
            this.messagesCount = messagesCount;
            return this;
        }
        public Builder ThemesCount(long themesCount) {
            this.themesCount = themesCount;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }    
}
