# Zadatak - ES za pomoć pri izboru sistema za ogrev kuće

Implementirati u Drools Expert okruženju ES za pomoć pri izboru sistema za ogrev kuće.

**Ekspert**: Inženjer toplane

**Korisnik**: Vlasnik nekretnine

**ES menja eksperta**

ES postavlja sledeća pitanja (i očekuje sledeće odgovore): 

1) Kolika je površina kuće u kvadratnim metrima? (unosi se ceo broj)

2) Da li ste osetljivi na hladnoću? (Veoma ; Onako ; Ne)

3) Da li je bitno da cena grejanja bude što niža? (Da ; Ne)

4) Da li kuća ima struju? (Da ; Ne)

5) Da li postoji mogućnost priključenja na gas? (Da ; Ne)

6) Da li postoji mogućnost priključenja na gradsku mrežu grejanja ? (Da ; Ne)

Rešenja koja ES pruža se sastoje iz dva dela. Prvi deo čini tip sistema grejanja (može da bude **centralni** ili **necentralizovan**). Drugi deo čini konkretan sistem i vrsta goriva:

* Necentralizovano grejanje na struju (TA peć, “Norveški” radijatori)

* Necentralizovano grejanje na čvrsta goriva (kamin, peć na čvrsta goriva)

* Centralno grejanje na struju (etažno grejanje)

* Centralno grejanje na gas

* Centralno grejanje na čvrsta goriva (drvo, ugalj)

* Centralno grejanje preko gradske mreže (toplana)

Pravila koja su identifikovana su:

1. Ako je korisnik veoma osetljiv na hladnoću, tip sistema grejanja je centralni.

2. Ako je korisnik onako osetljiv ili nije osetljiv na hladnoću i površina kuće je manja od 50 kvadratnih metara, tip sistema grejanja je necentralizovan.

3. Ako je korisnik onako osetljiv ili nije osetljiv na hladnoću i površina kuće je jednaka ili veća od 50 kvadratnih metara, tip sistema grejanja je centralni.

4. Ako je tip sistema grejanja centralni i nije bitno da cena bude što niža i postoji mogućnost priključenja na gas onda je konkretno rešenje centralno grejanje na gas.

5. Ako je tip sistema grejanja centralni i nije bitno da cena bude što niža i postoji mogućnost priključenja na gradsku mrežu grejanja onda je konkretno rešenje centralno grejanje preko gradske mreže.

6. Ako je tip sistema grejanja centralni i nije bitno da cena bude što niža i kuća ima struju i ne postoji mogućnost priključenja na gas i ne postoji mogućnost priključenja na gradsku mrežu grejanja onda je konkretno rešenje centralno grejanje na struju.

7. Ako je tip sistema grejanja centralni i bitno je da cena bude što niža, onda je konkretno rešenje centralno grejanje na čvrsta goriva (drvo, ugalj).

8. Ako je tip sistema grejanja necentralizovan i kuća ima struju onda je konkretno rešenje necentralizovano grejanje na struju (TA peć, “Norveški” radijatori).

9. Ako je tip sistema grejanja necentralizovan i kuća nema struju onda je konkretno rešenje necentralizovano grejanje na čvrsta goriva (kamin, peć na čvrsta goriva).

ES ne treba da ima GUI, već se **pokreće iz „main“ metode**. Odgovori na pitanja se unose direktno u okviru main metode. Rešenja se ispisuju posle završenog zaključivanja na konzoli tj. ekranu i to ispisom u oviru main metode. Postaviti da je korisnik kao činjenice (odgovore na pitanja) uneo da ima kuću od 49 kvadratnih metara, da je onako osetljiv na hladnoću i da kuća nema struju. Pokrenuti ES i ispisati rešenje na ekranu.