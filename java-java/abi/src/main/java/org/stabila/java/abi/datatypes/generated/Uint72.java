package org.stabila.java.abi.datatypes.generated;

import java.math.BigInteger;
import org.stabila.java.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.stabila.java.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint72 extends Uint {
    public static final Uint72 DEFAULT = new Uint72(BigInteger.ZERO);

    public Uint72(BigInteger value) {
        super(72, value);
    }

    public Uint72(long value) {
        this(BigInteger.valueOf(value));
    }
}
