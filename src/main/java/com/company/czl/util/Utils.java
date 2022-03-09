package com.company.czl.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * company: 
 * user: chenzuoli
 * date: 2018/11/7 19:47
 * description:
 */
public class Utils {
    private static Logger logger = LoggerFactory.getLogger(Utils.class);
    public static void closeFileStream(InputStream is, Reader br, OutputStream os, Writer bw) {
        try {
            if (is != null) {
                is.close();
            }
            if (br != null) {
                br.close();
            }
            if (os != null){
                os.close();
            }
            if (bw != null){
                bw.close();
            }
        } catch (IOException e) {
            logger.error("close stream io exception!", e);
        }
    }
}
