Scurta descriere a rezolvarii: 
	Am creat cate o clasa pentru fiecare tip de comanda.
		nu am reusit sa creez si o interfata care sa fie implementata de cele 3 clase ( cele 3 tipuri de comenzi),
		deoarece, chiar daca clasele au aceeasi metoda action(), aceasta returneaza altceva in fiecare clasa..
		Am adaugat in plus comanda SumCommand, care daca gaseste codul 3 , calculeaza media aritmetica a urmatoarelor 3 numere.
	
	Am creat o clasa Action, care primeste un array ca si parametru. Array ce contine elementele din fisieruld de input.
		Daca in array gasim comanda 1, construim un obiect de tipul ReadCommand
		daca in array gasim comanda 2 , construim un obiect de tipul ReverseCommand, 
		iar daca in array gasim comanda 3, construim un obiect de tipul SumCommand...
		pentru fiecare obiect construit apelam metoda action(), respectiva obiectului, care ne da 
		comportamentul comnezii.
		
	In clasa Main () am construi o lista de tip ArrayList care imi tine elemente in fisierul de input
		si un obiect de tipul Actions care imi parcurge array ul si executa comanda implicita.
	