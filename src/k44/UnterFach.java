package k44;

public class UnterFach extends Fach {
    public UnterFach(String areaName) {
        super(areaName);
    }

    public void printStaffingInformation() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("unit name: ").append(unitName).append("\n");
        stringBuilder.append("superior unit: ").append(getSuperiorUnit());

        for (Fach kapazitatesfach : units)
            kapazitatesfach.printStaffingInformation();

        System.out.println(stringBuilder.toString());
    }
}