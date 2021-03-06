package com.mongohua.etl;


import com.mongohua.etl.schd.job.SqoopJob;
import com.mongohua.etl.utils.Md5Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("([\\S|\\s]+\\s*--password,\\s+)([^\\s]+\\s+)([\\S|\\s]+)");
        Matcher m =  p.matcher("[/usr/bin/sqoop, import, --connect, jdbc:mysql://10.36.1.58:3306/etl?tinyInt1isBit=false, --username, root, --password, dzwang**, --table, t_user, --target-dir, /user/dw/extract/t_user/2018092710, --fields-terminated-by, \\001, --compress, --hive-drop-import-delims, --where, 1=1, -m, 1]");
        System.out.println(m.matches());
        System.out.println(m.group(1));
        System.out.println(m.group(2));
        System.out.println(m.group(3));

        p = Pattern.compile("[\\S|\\s]+");
        System.out.println(p.matcher("12 2:2s").matches());

        System.out.println(Md5Utils.encode("hello",1).toUpperCase());
    }
}
