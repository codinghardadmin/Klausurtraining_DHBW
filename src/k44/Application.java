package k44;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String... args) {        
        List<Fach> hauptfaecher = new ArrayList<Fach>();
        
        for (int i = 1; i <= 4; i++) {
        	String hfname = "HF" + i;
        	Fach hauptfach = new HauptFach(hfname);
        	hauptfach.addIdTag(hfname);
        	
        	for (int j = 1; j <= 4; j++) {
        		String ufname = hfname + "UF" + j;
            	Fach unterfach = new UnterFach(ufname);
            	unterfach.addIdTag(ufname);
            	
            	hauptfach.addUnit(unterfach);
            	
            	for (int k = 1; k <= 3; k++) {
            		String kfname = ufname + "KF" + k;
                	Fach kapazitatesfach = new KapazitaetsFach(kfname);
                	kapazitatesfach.addIdTag(kfname);
                	
                	unterfach.addUnit(kapazitatesfach);
            	}
        	}
        	
        	hauptfaecher.add(hauptfach);
        }
        
        Koffer koffer = new Koffer(hauptfaecher);
        
        for (Fach fach : koffer.getFaecher()) {
        	System.out.println("Unterfach 1 des Koffers: ");
        	
        	fach.printStructure();
        	
        	System.out.println();
        	
        	fach.printStaffingInformation();
        	
        	System.out.println();
        	System.out.println();
        }
        
        IKeyType keyn = new KeyN();
        IKeyType keyk = new KeyKAdapter();
        
        koffer.closeKoffer(keyn);
        koffer.openKoffer(keyk);
    }
}