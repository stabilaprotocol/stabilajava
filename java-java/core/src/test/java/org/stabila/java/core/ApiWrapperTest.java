package org.stabila.java.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.stabila.java.abi.FunctionEncoder;
import org.stabila.java.abi.TypeReference;
import org.stabila.java.abi.datatypes.Address;
import org.stabila.java.abi.datatypes.Bool;
import org.stabila.java.abi.datatypes.Function;
import org.stabila.java.abi.datatypes.generated.Uint256;
import org.stabila.java.api.GrpcAPI.EmptyMessage;
import org.stabila.java.proto.Chain.Transaction;
import org.stabila.java.proto.Contract.TriggerSmartContract;
import org.stabila.java.proto.Response.BlockExtention;
import org.stabila.java.proto.Response.TransactionExtention;
import org.stabila.java.proto.Response.TransactionReturn;

import java.math.BigInteger;
import java.util.Arrays;

import org.bouncycastle.util.encoders.Hex;
import org.junit.jupiter.api.Test;

public class ApiWrapperTest {
    //@Test
    public void testGetNowBlockQuery() {
        ApiWrapper client = ApiWrapper.ofShasta("3333333333333333333333333333333333333333333333333333333333333333");
        BlockExtention block = client.blockingStub.getNowBlock2(EmptyMessage.newBuilder().build());

        System.out.println(block.getBlockHeader());
        assertTrue(block.getBlockHeader().getRawDataOrBuilder().getNumber() > 0);
    }

    //@Test
    public void testSendTrc20Transaction() {
        ApiWrapper client = ApiWrapper.ofNile("3333333333333333333333333333333333333333333333333333333333333333");

        // transfer(address,uint256) returns (bool)
        Function trc20Transfer = new Function("transfer",
            Arrays.asList(new Address("SbXV8Frb3hALjtkApw3UaJRk61URvhvAXb"),
                new Uint256(BigInteger.valueOf(10).multiply(BigInteger.valueOf(10).pow(18)))),
            Arrays.asList(new TypeReference<Bool>() {}));

        String encodedHex = FunctionEncoder.encode(trc20Transfer);

        TriggerSmartContract trigger =
            TriggerSmartContract.newBuilder()
                .setOwnerAddress(ApiWrapper.parseAddress("ShpoHrSbssUwCdKhibizE8cX4HZfJkkaFe"))
                .setContractAddress(ApiWrapper.parseAddress("SbXV8Frb3hALjtkApw3UaJRk61URvhvAXb"))
                .setData(ApiWrapper.parseHex(encodedHex))
                .build();

        System.out.println("trigger:\n" + trigger);

        TransactionExtention txnExt = client.blockingStub.triggerContract(trigger);
        System.out.println("txn id => " + Hex.toHexString(txnExt.getTxid().toByteArray()));

        Transaction signedTxn = client.signTransaction(txnExt);

        System.out.println(signedTxn.toString());
        TransactionReturn ret = client.blockingStub.broadcastTransaction(signedTxn);
        System.out.println("======== Result ========\n" + ret.toString());
    }

    @Test
    public void testGenerateAddress() {
        ApiWrapper.generateAddress();
    }
}
