 starting the project
 below is a sample structure of the project new changes will be
 
KinoMVC/
├── pom.xml                              # Maven Konfiguration
├── Kino_Projekt.db                      # SQLite Datenbank
├── README.md
└── src/main/java/de/kino/
    ├── Main.java                        # Einstiegspunkt
    │
    ├── model/                           # MODEL Layer
    │   ├── JsonHandler.java             # Translates SQL Resultsets into JSON
    │   └── SQLAccess.java               # Acesses the DB with prepared Statemnets/queries etc.
    │
    ├── view/                            # VIEW Layer
    │   ├── MainFrame.java               # Hauptfenster
    │   ├── LoginPanel.java              # Login-Screen
    │   ├── FilmPanel.java               # Filmauswahl
    │   ├── SitzplanPanel.java           # Sitzplatzauswahl
    │   ├── BuchungenPanel.java          # Buchungsverwaltung
    │
    ├── controller/                      # CONTROLLER Layer
    │   └── MainController.java          # Haupt-Controller
    │
    └── database/                        # Datenbankzugriff
        └── DatabaseManager.java