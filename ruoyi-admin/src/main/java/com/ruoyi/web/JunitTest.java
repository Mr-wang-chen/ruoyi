package com.ruoyi.web;
import com.ruoyi.RuoYiApplication;

import org.aopalliance.aop.Advice;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.junit.Test;


public class JunitTest {
    @Test
    public void testEncrypt() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");          // 加密的算法，这个算法是默认的
        config.setPassword("lyh");                        // 加密的密钥
        standardPBEStringEncryptor.setConfig(config);
        String Enpassword = "Chen@0905";
        String EnpasswordText = standardPBEStringEncryptor.encrypt(Enpassword);
        System.out.println("密码:"+EnpasswordText);
    }


}
