package LibrarySystem;

import java.util.Objects;

public class LendingItem {
    private int numCopiesInLib;

    public LendingItem(int numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    public int getNumCopiesInLib() {
        return numCopiesInLib;
    }

    public void setNumCopiesInLib(int numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LendingItem that = (LendingItem) o;
        return numCopiesInLib == that.numCopiesInLib;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numCopiesInLib);
    }
}
