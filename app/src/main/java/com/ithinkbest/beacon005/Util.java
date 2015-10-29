package com.ithinkbest.beacon005;

import android.util.Log;

import java.nio.ByteBuffer;

/**
 * Created by mark on 2015/10/29.
 */
public class Util {
  public static byte[] get2Bytes (int val){

      ByteBuffer b = ByteBuffer.allocate(4);
//b.order(ByteOrder.BIG_ENDIAN); // optional, the initial order of a byte buffer is always BIG_ENDIAN.
      b.putInt(val);

      byte[] result = b.array();

      byte[] c= {0,0};
      c[0]=result[2];
      c[1]=result[3];


      return c;
  }
//    private byte[] convertHexStringToByte(String str) {
//
//        if (null == str) {
//            return null;
//        }
//
//        int originalLength = str.length();
//        String newStr = str.toUpperCase();
//
//        if (0 != originalLength % 2) {
//            newStr = "0" + str.toUpperCase();
//        }
//
//        if (IS_DEBUG)
//            Log.d(TAG, "convertHexStringToByte() : Original input string = " + str + " New = " + newStr);
//
//        char[] charBuffer = newStr.toCharArray();
//        int length = charBuffer.length;
//
//        if (IS_DEBUG) Log.d(TAG, "convertHexStringToByte() : charBuffer size = " + length);
//
//        byte[] byteBuffer = new byte[length >> 1];
//        length = byteBuffer.length;
//
//        if (IS_DEBUG) Log.d(TAG, "convertHexStringToByte() : byteBuffer size = " + length);
//
//        for (int i = 0; i < length; i++) {
//            int lV = STRING_HEX_NUM.indexOf((int) charBuffer[i * 2]);
//            int rV = STRING_HEX_NUM.indexOf((int) charBuffer[i * 2 + 1]);
//
//            if (IS_DEBUG) Log.d(TAG, "lV = " + lV + " rV = " + rV);
//
//            byteBuffer[i] = (byte) (((lV << 4) & 0x00F0) | (rV & 0x000F));
//        }
//        return byteBuffer;
//    }


}
