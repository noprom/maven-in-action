package com.huntdreams.mvn.account.email;

/**
 * AccountEmailService
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 6/10/16 11:26 PM.
 */
public interface AccountEmailService {

    void sendMail(String to, String subject, String htmlText);
}
