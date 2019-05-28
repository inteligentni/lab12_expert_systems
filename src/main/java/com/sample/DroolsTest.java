package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // ucitavanje baze znanja
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	//Pravljenje novog objekta i unos pocetnih cinjenica u taj objekat.
        	SistemGrejanja sg = new SistemGrejanja();
        	sg.setPovrsina(49);
        	sg.setOsetljiviNaHladnocu("Onako");
        	sg.setImaStruju(false);
            
        	//Unos popunjenog objekta u bazu znanja
            kSession.insert(sg);
            
            //Pokretanje ES
            kSession.fireAllRules();
            
            //Ispis resenja na konzoli
            System.out.println(sg);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
