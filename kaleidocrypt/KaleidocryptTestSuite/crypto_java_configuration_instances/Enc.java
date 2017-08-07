package Crypto;


import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class Enc{			
	public byte[]  encrypt(byte[] data,SecretKey key) throws InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException{
		return performEncryption(data,key,"AES/GCM/PKCS10Padding");
	}
	
	private byte[]  performEncryption(byte[] data,SecretKey key,String encryptPassingArgument) throws InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException
		{
		  byte[] ivb=new byte[16];
		  SecureRandom.getInstanceStrong().nextBytes(ivb);
		  IvParameterSpec iv=new IvParameterSpec(ivb);
		  Cipher c=Cipher.getInstance(encryptPassingArgument);
		  c.init(Cipher.ENCRYPT_MODE,key,iv);
		  byte[] res=c.doFinal(data);
		  byte[] ret=new byte[res.length + ivb.length];
		  System.arraycopy(ivb,0,ret,0,ivb.length);
		  System.arraycopy(res,0,ret,ivb.length,ret.length);
		  return ret;
		}
}
