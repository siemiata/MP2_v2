# MP2_v2
Opis asociacji:
- Asocjacja zwykła:
  + Liczność 1-*, jeden "Owner" może posiadać wiele obiektów klasy "Car"
  + Mamy kontener przechowujący referencje do typu Car po stronie wiele
  + Pojedyncza referencja oraz kontener
- Asocjacja z atrybutem:
  + Relacja pomiędzy Car i Owner za pomocą klasy Order
  + Liczność od Car do Order 1-*
  + Liczność od Owner do Order 1-*
- Asocjacja kwalifikowana:
  +  Atrybut cars w klasie Owner jest mapą, gdzie kluczem jest numer rejestracyjny samochodu
  +  wartością jest obiekt klasy Car
- Asocjacja kompozycja:
  + Istnieje klasa Engine
  + Blokuje samodziele tworzenie prze prywatny konstruktor
  + Tworzymy obiekt przez specialną metodę 
