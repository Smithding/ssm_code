package com.itheima.ssm.entity;

public class SUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.phoneCheckCode
     *
     * @mbggenerated
     */
    private String phonecheckcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.checkCode
     *
     * @mbggenerated
     */
    private String checkcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.uid
     *
     * @return the value of s_user.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.uid
     *
     * @param uid the value for s_user.uid
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.username
     *
     * @return the value of s_user.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.username
     *
     * @param username the value for s_user.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.nickname
     *
     * @return the value of s_user.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.nickname
     *
     * @param nickname the value for s_user.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.password
     *
     * @return the value of s_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.password
     *
     * @param password the value for s_user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.phoneCheckCode
     *
     * @return the value of s_user.phoneCheckCode
     *
     * @mbggenerated
     */
    public String getPhonecheckcode() {
        return phonecheckcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.phoneCheckCode
     *
     * @param phonecheckcode the value for s_user.phoneCheckCode
     *
     * @mbggenerated
     */
    public void setPhonecheckcode(String phonecheckcode) {
        this.phonecheckcode = phonecheckcode == null ? null : phonecheckcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.checkCode
     *
     * @return the value of s_user.checkCode
     *
     * @mbggenerated
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.checkCode
     *
     * @param checkcode the value for s_user.checkCode
     *
     * @mbggenerated
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode == null ? null : checkcode.trim();
    }
}