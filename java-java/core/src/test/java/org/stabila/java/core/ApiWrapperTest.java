package org.stabila.java.core;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.stabila.java.api.GrpcAPI.EmptyMessage;
import org.stabila.java.core.exceptions.IllegalException;
import org.stabila.java.core.key.KeyPair;
import org.stabila.java.proto.Chain;
import org.stabila.java.proto.Response;
import org.stabila.java.proto.Response.BlockExtention;
import org.junit.jupiter.api.Test;

public class ApiWrapperTest {

    @Test
    public void testGenerateAddress() {
        KeyPair keyPair = ApiWrapper.generateAddress();

        System.out.println(keyPair.toPrivateKey());
        System.out.println(keyPair.toBase58CheckAddress());
        System.out.println(keyPair.toHexAddress());
    }

    @Test
    public void testGetNowBlockQuery() {
        KeyPair keyPair = ApiWrapper.generateAddress();
        ApiWrapper client = ApiWrapper.ofMainnet(keyPair.toPrivateKey());
        BlockExtention block = client.blockingStub.getNowBlock2(EmptyMessage.newBuilder().build());

        System.out.println(block.getBlockHeader());
        assertTrue(block.getBlockHeader().getRawDataOrBuilder().getNumber() > 0);
    }

    @Test
    public void testGetBalance() {
        KeyPair keyPair = ApiWrapper.generateAddress();
        ApiWrapper client = ApiWrapper.ofMainnet(keyPair.toPrivateKey());
        long balance = client.getAccountBalance(keyPair.toBase58CheckAddress());
        System.out.println(balance);
        assertTrue(balance == 0);
    }

    //@Test
    public void testTransfer() throws IllegalException {
        KeyPair keyPair1 = ApiWrapper.generateAddress();
        KeyPair keyPair2 = ApiWrapper.generateAddress();
        ApiWrapper client = ApiWrapper.ofMainnet(keyPair1.toPrivateKey());
        Response.TransactionExtention trExt = client.transfer(keyPair1.toBase58CheckAddress(),
                keyPair2.toBase58CheckAddress(), 1000);
        Chain.Transaction transaction = client.signTransaction(trExt);
        client.broadcastTransaction(transaction);
    }
}
