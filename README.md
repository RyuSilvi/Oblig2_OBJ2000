

# Sensor Monitor Dashboard – JavaFX

## Introduksjon

Dette prosjektet er et JavaFX-basert dashbord for sensorovervåking, utviklet i forbindelse med emnet Objektorientert programmering 1 (OBJ2000). Systemet simulerer typiske sensorer brukt i smarte hjem, som måler for eksempel temperatur, fuktighet og lys, og viser disse i et live oppdatert GUI. 

***

## Prosjektmål

- Vise en liste eller tabell med simulerte sensorer og avlesninger.
- Oppdatere sensorverdier som svar på brukerhandling (for eksempel ved å trykke på "Oppdater" eller "Start").
- Indikere sensorverdier med visuelle elementer som fremdriftslinjer og farger.
- La brukeren starte og stoppe overvåkingssimuleringen.

***

## Funksjonelle krav

- **JavaFX GUI:** Kun grafisk grensesnitt, ingen konsollbruk.
- **Modulær struktur:**
    - `MainApp`: Applikasjonens inngangspunkt.
    - Kontrollerklasser: Håndterer oppdateringer og brukerhendelser.
    - Layoutklasser: Bygger dashbordet direkte i Java ved bruk av BorderPane, VBox, HBox, GridPane. 
- **Sensor-simulering:**
    - Minst tre sensortyper (f.eks. temperatur, fuktighet, lys).
    - Hver sensor har navn og numerisk verdi (DoubleProperty).
- **Databinding og visning:**
    - Hver sensors verdi bindes til visuelt element (ProgressBar, Label). 
    - GUI-et oppdateres automatisk. 
- **Brukerinteraksjon:**
    - Minst to kontroller: Start/Stopp-knapp og et element for justering av varslingsterskel. 
- **Visuell tilbakemelding:**
    - Endringer i farge/stil når terskler overskrides. 
    - CSS og/eller ikoner for å markere advarsler. 
- **Systematferd:**
    - Starter alltid i pause. 
    - "Oppdater"/"Start" endrer sensoravlesningene, "Stopp" fryser dem. 

***

## Anbefalt prosjektstruktur

```
SensorDashboard/
│
└── src/
    └── dashboard/
        ├── MainApp.java
        ├── Controller.java
        ├── model/
        │   ├── Sensor.java
        │   └── ...
        ├── view/
        │   ├── DashboardLayout.java
        │   └── ...
        └── resources/
            ├── icon_alert.png
            └── ...
```


***

## Videreutviklingsforslag

- Utvide antall sensortyper eller legge til grafisk trendrepresentasjon.
- Bedre støtte for lagring eller eksport av data.
- Tilpasse brukergrensesnittet med mer avansert CSS eller egne ikoner.
- Implementere støtte for dynamisk å legge til/fjerne sensorer i grensesnittet. 

***

## Gruppemedlemmer og ansvarsfordeling

- **UI-Design:** Lager layout og struktur.
- **Logikk:** Koder hendelseslogikk og oppdateringsmekanismer.
- **Modell:** Implementerer modellklasser og databinding.
- **Integrasjon/testing:** Sikrer sammenkobling og stabilitet.

Alle gruppemedlemmer signerer i PDF-dokumentasjonen og beskriver sitt bidrag. 

***

## Kjøring av programmet

1. Last ned ZIP-filen med all kode og ressurser.
2. Åpne prosjektet i en IDE med JavaFX-støtte.
3. Kjør `MainApp.java` for å starte applikasjonen. 

***

Dette prosjektet demonstrerer hvordan JavaFX kan brukes til å bygge et strukturert, dynamisk og responsivt sensor-dashbord med tydelig visuell tilbakemelding og enkel utvidelsesmulighet. 

<div align="center">⁂</div>

