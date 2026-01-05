package com.suraj;
import java.lang.StringBuffer;
public class StringBufferEx {
        public static void main(String[] args)
        {
            StringBuffer sb = new StringBuffer();
            sb.append("Suraj");
            sb.append(" ");
            sb.append("Gupta");
            String message = sb.toString();
            System.out.println(message);
        }

}
