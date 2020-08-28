Mai intai, tinand cont ca terenurile pot avea mai multe forme, am creat o interfata Shape ce este implementata de fiecare tip de teren in parte
	si care contine metoda calculateArea() ce va fi implementata de clasele mostenite
	Apoi am creat cate o clasa pentru fiecare tip de teren ( cerc, dreptunghi ( care daca are laturile egale este un patrat) si triunghi) 
		si am calculat aria pentru fiecare in parte, in functie de laturile figurillor sau de raza, in cazul cercului.
	
Apoi am creat o clasa pentru proprietar ( Owner ) care implementeaza interfata Person, unde se gasesc metodele:
	calculateTotalAreas() -> prima metoda calculeaza pt fiecare propriatar metri patrati total, adica daca are mai multe terenuri calculam aria pt fiecare si apoi aria totala

    calculateTotalTexes() -> a doua metoda calculeaza taxa totala in functie de metrii patrati calculati la prima metoda , cu taxa stabilita ( acel tax)

    printTotalRate() -> iar a 3 a metoda doar afiseaza numele prop , suprafata si cat are de platit

Iar in clasa Main() am facut testele.