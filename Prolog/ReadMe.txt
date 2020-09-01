--------------------------------------PROLOG--------------------------------------

Prima data am creat o interfata generala pentru toti termenii (constanta , variabila sau predicat), aceasta avand doar o singura metoda ce ne returneaza true daca
	2 termeni au acelasi nume sau false in caz contrat.

Apoi am creat cate o interfata pentru fiecare tip de termen , construind mai departe cate o clasa separat pentru acestia. 
    Clasa Constant implementeaza atat interfata ITerm generala tuturor tipurilor de termeni , cat si pe cea IConstant
		specifica doar acestui tip.
	Clasa Predicate implementeaza ITerm si IPredicate, iar
	Clasa Variable implementeaza ITerm si IVariable. 

Apoi in clasa UnificationResult am implementat metodele specifice unificarii, tinand cont de regulile din Prolog,
	ca mai apoi in clasa Main sa pot sa realizez testele , luand ca si exemple 2 predicate, unul cu termenul de tip constanta,
	iar cel de al doilea cu termenul de tip variabila.
