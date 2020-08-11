package main;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Iterator;

import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.bcpg.HashAlgorithmTags;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.bcpg.sig.Features;
import org.bouncycastle.bcpg.sig.KeyFlags;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.openpgp.PGPEncryptedData;
import org.bouncycastle.openpgp.PGPKeyPair;
import org.bouncycastle.openpgp.PGPPublicKeyRing;
import org.bouncycastle.openpgp.PGPKeyRingGenerator;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPSecretKeyRing;
import org.bouncycastle.openpgp.PGPSignature;
import org.bouncycastle.openpgp.PGPSignatureSubpacketGenerator;
import org.bouncycastle.openpgp.operator.PBESecretKeyEncryptor;
import org.bouncycastle.openpgp.operator.PGPDigestCalculator;
import org.bouncycastle.openpgp.operator.bc.BcPBESecretKeyEncryptorBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPGPContentSignerBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPGPDigestCalculatorProvider;
import org.bouncycastle.openpgp.operator.bc.BcPGPKeyPair;

public class Main
{
    public static void main(String args[])
        throws Exception
    {
    	
    	int row = 4;
    	int col = 3;
    	int cnt = 0;
    	
    	int trazeni_broj[] = {5,3,7,1,2,6};
    	int num_length = 6;
    	Numbers num[] = new Numbers[12];
    	
    	
    	num[0] = new Numbers();
    	num[0].next1 = 4;
    	num[0].next2 = 6;
    	
    	
    	num[1] = new Numbers();
    	num[1].next1 = 8;
    	num[1].next2 = 6;

    	num[2] = new Numbers();
    	num[2].next1 = 9;
    	num[2].next2 = 7;

    	num[3] = new Numbers();
    	num[3].next1 = 8;
    	num[3].next2 = 4;

    	num[4] = new Numbers();
    	num[4].next1 = 3;
    	num[4].next2 = 9;

    	num[5] = new Numbers();
    	num[5].next1 = -1;
    	num[5].next2 = -2;

    	num[6] = new Numbers();
    	num[6].next1 = 7;
    	num[6].next2 = 1;

    	num[7] = new Numbers();
    	num[7].next1 = -2;
    	num[7].next2 = 6;

    	num[8] = new Numbers();
    	num[8].next1 = 1;
    	num[8].next2 = 3;
	
    	num[9] = new Numbers();
    	num[9].next1 = -1;
    	num[9].next2 = 2;

    	num[10] = new Numbers();
    	num[10].next1 = 5;
    	num[10].next2 = 9;
    	
    	num[11] = new Numbers();
    	num[11].next1 = 5;
    	num[11].next2 = 7;

    	
    	
    	
    	int head = 0;
    	int pocetak = 3;
    	
    	
    	int next = pocetak;
    	
    	
    	while(num_length > 0)
    	{	
    		if(next==trazeni_broj[head])
    		{	
    			num_length--;
    			head++;
    			System.out.println(next);
    			next = num[next].next1;
    		}
    		else
    		{
    			if(next == num[next].next2)
    				next = num[next].next2;
    			else
    				next = num[next].next1;
    		}
    			
    		System.out.println(next);
    	}
    	
    	
    }
}


