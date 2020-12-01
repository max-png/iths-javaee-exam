# JavaEE-exam

## Java Enterprise examination
Examinationen för kursen Java Enterprise är en arbetsuppgift som löses individuellt eller i
par (men inte fler) på egen vald tid och plats.

Redovisning sker skriftligt med inskickade uppgifter via mail ulf@bilting.se samt vid muntligt
redovisningtillfälle. Båda redovisningarna krävs för betyget G.

Den skriftliga redovisningen sker med inskickade java-filer i ett zip-arkiv samt en ca en halv
A4-sida som kortfattat beskriver designbeslut, arkitektur, teknikval och övergripande
kodstruktur.

Vid den muntliga redovisningen skall programmet kunna köras och all kod och tester skall
kunna beskrivas och motiveras.
Har uppgiften gjorts i par skall båda kunna redovisa och beskriva all kod.

Deadline är kursslut, fredag 22 jan 2020.

## Uppgiften
Bygg en webshop från scratch utan att använda något färdigt web-shop-ramverk.

Det finns möjlighet att välja en annan uppgift som examination om man så skulle vilja.
Den skall då ha en motsvarande komplexitet och använda motsvarande teknik som behövs
för en webshop. En beskrivning av uppgiften skall upprättas och godkännas av examinator
innan arbetet påbörjas.

## Minimala funktionella krav
Kunden skall mötas av en login-sida där hen kan registrera sig som ny kund eller logga in som
tidigare registrerad.

Efter inloggning skall kunden bli föreslagen kategorier av varor, samt en sökfunktion på
produktnamn.

En produktlista skall presenteras och kunden skall kunna lägga varor i sin varukorg och då
ange antalet exemplar av varan.

Varukorgen skall kunna uppdateras med ändring av antal respektive borttagning av en viss
vara. Varukorgen skall visa totalsumman av alla varors pris.

När kunden har fyllt varukorgen skall den kunna checkas ut och kunden skall få en
bekräftelsesida som visar den lagda ordern. Denna order har också lagrats i databasen så
webshoppens lagerpersonal kan börja expediera den.

Webshoppens personal skall ha en egen fast administratörsinloggning via vilken de skall
kunna se websidor för oexpedierade order, expedierade order, markera en order som
expedierad samt lägga till nya produkter i produktregistret.
Dessa administratörstjänster skall också finnas tillgängliga som ett REST-interface.

Tester skall finnas för nyckelkomponenter, t ex varukorg. De behöver inte vara heltäckande,
utan bara några stycken. Det viktigaste är att komponenten i fråga är testbar.

Mängden info i kund-, produkt-, varukorg- och order-objekt etc. behöver inte vara så utförlig
som i en realistisk webshop.

Saker som borde finnas i en riktig webshop men som inte behöver implementeras i denna
uppgift: betalning, säkerhet, snygga websidor med lull-lull. Är du osäker på något mer, fråga!

## Icke-funktionella krav
* Webshopen skall byggas med Java Enterprise-teknologi
* Koden skall vara noggrant separerad i traditionella skikt för utseende, controllers,
tjänster, modell/business-objekt, datalagring etc.
* Datalagringen skall använda JPA, Spring Data rekommenderas
* Dynamiska websidor får genereras med valfri teknik, SpringMVC/Thymeleaf
rekommenderas.
* REST får använda valfri teknik, Spring REST rekommenderas.
* Applikationen får implementeras i valfri enterprise-miljö, Spring Boot
rekommenderas.
* Det är inte förbjudet att använda Javascript-teknologi, men eftersom kursen är Java
Enterprise, är det klokt att fokusera på server-side JavaEE-teknologi.

## Betyg
För ovanstående slutfört och redovisat arbete ges betyget G.
För betyget VG implementeras ett eget valt och av examinator i förväg(!)
godkänt tillägg till ovanstående. Detta tillägg skall utnyttja någon ytterligare Java-enterprise
teknologi som inte redan finns med i G-delen, t ex email-sändning av orderbekräftelse,
säkerhetsbaserad påloggning för administrativ personal, eller liknande. Redovisning sker på
samma sätt för både G och VG.
