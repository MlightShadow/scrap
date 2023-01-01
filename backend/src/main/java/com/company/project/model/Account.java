package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Account {
    /**
     * Identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    @Column(name = "sha_pass_hash")
    private String shaPassHash;

    private String v;

    private String s;

    private String email;

    @Column(name = "reg_mail")
    private String regMail;

    private Date joindate;

    @Column(name = "last_ip")
    private String lastIp;

    @Column(name = "last_attempt_ip")
    private String lastAttemptIp;

    @Column(name = "failed_logins")
    private Integer failedLogins;

    private Byte locked;

    @Column(name = "lock_country")
    private String lockCountry;

    @Column(name = "last_login")
    private Date lastLogin;

    private Byte online;

    private Byte expansion;

    private Long mutetime;

    private String mutereason;

    private String muteby;

    private Byte locale;

    private String os;

    private Integer recruiter;

    private byte[] salt;

    private byte[] verifier;

    @Column(name = "session_key_auth")
    private byte[] sessionKeyAuth;

    @Column(name = "session_key_bnet")
    private byte[] sessionKeyBnet;

    @Column(name = "totp_secret")
    private byte[] totpSecret;

    /**
     * 获取Identifier
     *
     * @return id - Identifier
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置Identifier
     *
     * @param id Identifier
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return sha_pass_hash
     */
    public String getShaPassHash() {
        return shaPassHash;
    }

    /**
     * @param shaPassHash
     */
    public void setShaPassHash(String shaPassHash) {
        this.shaPassHash = shaPassHash;
    }

    /**
     * @return v
     */
    public String getV() {
        return v;
    }

    /**
     * @param v
     */
    public void setV(String v) {
        this.v = v;
    }

    /**
     * @return s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s
     */
    public void setS(String s) {
        this.s = s;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return reg_mail
     */
    public String getRegMail() {
        return regMail;
    }

    /**
     * @param regMail
     */
    public void setRegMail(String regMail) {
        this.regMail = regMail;
    }

    /**
     * @return joindate
     */
    public Date getJoindate() {
        return joindate;
    }

    /**
     * @param joindate
     */
    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    /**
     * @return last_ip
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * @param lastIp
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    /**
     * @return last_attempt_ip
     */
    public String getLastAttemptIp() {
        return lastAttemptIp;
    }

    /**
     * @param lastAttemptIp
     */
    public void setLastAttemptIp(String lastAttemptIp) {
        this.lastAttemptIp = lastAttemptIp;
    }

    /**
     * @return failed_logins
     */
    public Integer getFailedLogins() {
        return failedLogins;
    }

    /**
     * @param failedLogins
     */
    public void setFailedLogins(Integer failedLogins) {
        this.failedLogins = failedLogins;
    }

    /**
     * @return locked
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * @param locked
     */
    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    /**
     * @return lock_country
     */
    public String getLockCountry() {
        return lockCountry;
    }

    /**
     * @param lockCountry
     */
    public void setLockCountry(String lockCountry) {
        this.lockCountry = lockCountry;
    }

    /**
     * @return last_login
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return online
     */
    public Byte getOnline() {
        return online;
    }

    /**
     * @param online
     */
    public void setOnline(Byte online) {
        this.online = online;
    }

    /**
     * @return expansion
     */
    public Byte getExpansion() {
        return expansion;
    }

    /**
     * @param expansion
     */
    public void setExpansion(Byte expansion) {
        this.expansion = expansion;
    }

    /**
     * @return mutetime
     */
    public Long getMutetime() {
        return mutetime;
    }

    /**
     * @param mutetime
     */
    public void setMutetime(Long mutetime) {
        this.mutetime = mutetime;
    }

    /**
     * @return mutereason
     */
    public String getMutereason() {
        return mutereason;
    }

    /**
     * @param mutereason
     */
    public void setMutereason(String mutereason) {
        this.mutereason = mutereason;
    }

    /**
     * @return muteby
     */
    public String getMuteby() {
        return muteby;
    }

    /**
     * @param muteby
     */
    public void setMuteby(String muteby) {
        this.muteby = muteby;
    }

    /**
     * @return locale
     */
    public Byte getLocale() {
        return locale;
    }

    /**
     * @param locale
     */
    public void setLocale(Byte locale) {
        this.locale = locale;
    }

    /**
     * @return os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * @return recruiter
     */
    public Integer getRecruiter() {
        return recruiter;
    }

    /**
     * @param recruiter
     */
    public void setRecruiter(Integer recruiter) {
        this.recruiter = recruiter;
    }

    /**
     * @return salt
     */
    public byte[] getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    /**
     * @return verifier
     */
    public byte[] getVerifier() {
        return verifier;
    }

    /**
     * @param verifier
     */
    public void setVerifier(byte[] verifier) {
        this.verifier = verifier;
    }

    /**
     * @return session_key_auth
     */
    public byte[] getSessionKeyAuth() {
        return sessionKeyAuth;
    }

    /**
     * @param sessionKeyAuth
     */
    public void setSessionKeyAuth(byte[] sessionKeyAuth) {
        this.sessionKeyAuth = sessionKeyAuth;
    }

    /**
     * @return session_key_bnet
     */
    public byte[] getSessionKeyBnet() {
        return sessionKeyBnet;
    }

    /**
     * @param sessionKeyBnet
     */
    public void setSessionKeyBnet(byte[] sessionKeyBnet) {
        this.sessionKeyBnet = sessionKeyBnet;
    }

    /**
     * @return totp_secret
     */
    public byte[] getTotpSecret() {
        return totpSecret;
    }

    /**
     * @param totpSecret
     */
    public void setTotpSecret(byte[] totpSecret) {
        this.totpSecret = totpSecret;
    }
}