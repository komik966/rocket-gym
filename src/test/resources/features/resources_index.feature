# language: pl
Funkcja: Rejestr trenerów

  Scenariusz: Dodawanie nowego trenera
    Zakładając że jestem menadżerem
    Gdy gdy spróbuję dodać nowego trenera z danymi:
      | imie | nazwisko | wynagrodzenie za godine | typ umowy | waznosc umowy | specjalnosci              |
      | Jan  | Kowalski | 50                      | B2B       | 25-12-2018    | koszykowka, rehabilitacja |
    Wtedy nowy trener powinien pojawić się na liście
    Oraz nowy trener powinien pojawić się w kalendarzu dostępności
    Ale dostępność trenera jest maksymalnie do "25-12-2018"

  Scenariusz: Przypomnienie o wygasającej umowie trenera
    Zakładając że w rejestrze istnieje trener, którego umowa kończy się "25-10-2018"
    Oraz jestem menadżerem
    Wtedy powinienem otrzymać przypomnienie w dniu "25-09-2018"

