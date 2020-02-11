package k44;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Fach {
    protected int indentDepth = 0;
    protected String unitName;
    protected Fach parentUnit;
    protected List<Fach> units;
    protected List<String> idTags;

    public Fach(String unitName) {
        this.unitName = unitName;
        this.units = new ArrayList<>();
        this.idTags = new ArrayList<>();
    }

    public abstract void printStaffingInformation();

    public void addUnit(Fach administrativeUnit) {
        units.add(administrativeUnit);
    }

    public final boolean isComposite() {
        return !units.isEmpty();
    }

    public final ListIterator<Fach> listUnits() {
        return units.listIterator();
    }

    protected String indent(int depth) {
        StringBuilder stringBuilder = new StringBuilder();

        do {
            stringBuilder.append("+ ");
        } while (depth-- > 0);

        return stringBuilder.toString();
    }

    public final void printStructure() {
        System.out.println(indent(indentDepth) + unitName +
                (isComposite() ? " (node)" : " (leaf)"));
        for (Fach area : units) {
            area.indentDepth = indentDepth + 1;
            area.printStructure();
        }
    }

    public String getSuperiorUnit() {
        String parent;

        if (parentUnit == null)
            parent = "--- top level unit";
        else
            parent = this.parentUnit.unitName;

        return parent;
    }

    public void addIdTag(String idTag) {
        idTags.add(idTag);
    }

    public void printTags() {
        System.out.print("[" + idTags + "]");
        if (parentUnit != null)
            parentUnit.printTags();
    }
}