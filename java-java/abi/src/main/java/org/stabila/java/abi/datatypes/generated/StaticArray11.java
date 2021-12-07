package org.stabila.java.abi.datatypes.generated;

import java.util.List;
import org.stabila.java.abi.datatypes.StaticArray;
import org.stabila.java.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.stabila.java.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray11<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray11(List<T> values) {
        super(11, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray11(T... values) {
        super(11, values);
    }

    public StaticArray11(Class<T> type, List<T> values) {
        super(type, 11, values);
    }

    @SafeVarargs
    public StaticArray11(Class<T> type, T... values) {
        super(type, 11, values);
    }
}
