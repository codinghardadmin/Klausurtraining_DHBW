package k44;

public class KapazitaetsFach extends Fach {
	
	private Gegenstand gegenstand;
	
    public KapazitaetsFach(String areaName, Gegenstand gegenstand) {
        super(areaName);
        this.gegenstand = gegenstand;
    }
    
    public void setGegenstand(Gegenstand gegenstand) {
    	this.gegenstand = gegenstand;
    }
    
    public Gegenstand getGegenstand() {
    	return gegenstand;
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