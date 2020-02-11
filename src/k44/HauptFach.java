package k44;

public class HauptFach extends Fach {
    public HauptFach(String areaName) {
        super(areaName);
    }

    public void printStaffingInformation() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("unit name: ").append(unitName).append("\n");
        stringBuilder.append("superior unit: ").append(getSuperiorUnit());

        for (Fach unterfach : units)
            unterfach.printStaffingInformation();

        System.out.println(stringBuilder.toString());
    }
}