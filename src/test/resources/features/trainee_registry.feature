# language: pl
Funkcja: Rejestr trenerów

  Scenariusz: Dodawanie nowego trenera
    Jeżeli jestem "menadżerem"
    Gdy gdy dodam nowego trenera z danymi:
      | imie | nazwisko | umowa                          | specjalnosci              |
      | Jan  | Kowalski | 50 PLN / h, B2B, do 25-12-2018 | koszykowka, rehabilitacja |
    Wtedy nowy trener powinien pojawić się na liście
    Oraz nowy trener powinien pojawić się w kalendarzu dostępności
    Ale dostępność trenera jest w przedziale od teraz do "25-12-2018"

  Scenariusz: Modyfikacja danych trenera
    Jeżeli jestem "menadżerem"
    Wtedy mogę modyfikować wszystie dane trenera
    Ale nie mogę modyfikować umowy trenera

  Scenariusz: Przypomnienie o wygasającej umowie trenera
    Jeżeli jestem "menadżerem"
    Oraz w rejestrze istnieje trener, którego umowa kończy się "25-10-2018"
    Wtedy otrzymam przypomnienie w dniu "25-09-2018"

  Scenariusz: Ocena trenera przez klienta siłowni
    Jeżeli jestem "klientem siłowni"
    Oraz trener ma średnią ocenę 3.5 wystawioną przez 3 klientów
    Gdy dodam ocenę 5 z komentarzem "Świetny trener"
    Wtedy ocena trenera powinna być 3.9
    Oraz dodana ocena powinna być pierwsza na liście
