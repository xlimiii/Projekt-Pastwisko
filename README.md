# Projekt-Pastwisko
Simple project for course Scripting Languages (Python + Batch)

Projekt powstał na bazie zadania 4 z konkursu “Algorytmion 2013”. Oto treść tego zadania: 

Rolnik ma pastwisko w kształcie koła o promieniu 1 m. Na okręgu tego koła przywiązuje kozę, której łańcuch ma długość r<1 m. 
Napisz program wyznaczający długość łańcucha, aby koza miała możliwość wygryzienia trawy z połowy pastwiska. 
Zadanie to można rozwiązać eksperymentalnie: przy ustalonym promieniu r, wylosować dostatecznie dużo (przykładowo n) punktów 
należących do tego pastwiska. Następnie zliczyć ile spośród tych punktów trafia w „wygryziony” obszar (przykładowo m). 
Ilość punktów trafionych w ten obszar do ilości wszystkich punktów ma się tak, jak pole tego obszaru do pola całego obszaru. 
Z tej zależności da się znaleźć (pośrednio lub w przybliżony sposób) wartość r. 

Po konsultacji z autorem zadania okazało się, że wersja zadania dostępna na stronie konkursu jest błędna i w treści nie powinno być
warunku ograniczającego długość łańcucha kozy do maksymalnie 1 m, ponieważ ten warunek sprawia, że zadanie jest niemożliwe do rozwiązania.  

Sposób rozwiązania problemu  

Program rozwiązuje zadany problem metodą eksperymentalną, poprzez losowanie punktów z terenu pola rolnika 
i sprawdzaniu, ile z tych punktów należy do pastwiska kozy, jeśli ta będzie miała łańcuch o długości 1m, później 1.01m, 1.02m, itd. 
aż do momentu, kiedy koza będzie w stanie zjeść trawę z połowy pola rolnika (kiedy 50% punktów z pola rolnika będzie należało do pastwiska 
kozy). 

Funkcjonalność:
* program pobiera dane wejścowe, czyli liczbę punktów do losowania z plików tekstowych(batch)
* losuje punkty, sprawdza czy należą do obszaru koła (python)
* wykonuje obliczenia i na końcu zwraca wynik: na konsolę, do plików tekstowych oraz zapisuje je w tabeli w pliku .html (python)
* wyświetla informacje o programie (batch)
* wykonuje backup plików .html (batch)

SCREENSHOTY:

![menu](https://user-images.githubusercontent.com/47063149/77654024-c2984200-6f70-11ea-86d8-166e401905b5.JPG)
![program](https://user-images.githubusercontent.com/47063149/77654044-cc21aa00-6f70-11ea-9493-b626dc901cf9.JPG)
![backup](https://user-images.githubusercontent.com/47063149/77654057-d348b800-6f70-11ea-8a5c-7044a16139cc.JPG)
![strona](https://user-images.githubusercontent.com/47063149/77654070-db085c80-6f70-11ea-9416-4ad553f83ce3.jpg)



Program posiada też swoją wersję w języku Java w postaci aplikacji okienkowej. 


Funkcjonalność wersji w języku Java:
* program pobiera dane (liczbę punktów do wylosowania) od użytkownika
* program sprawdza poprawność wprowadzonych danych
* wykonuje obliczenia i na końcu zwraca wynik w okienku aplikacji
* wyświetla informacje o programie 


SCREENSHOTY:

![java1](https://user-images.githubusercontent.com/47063149/77656591-620b0400-6f74-11ea-8e09-20bf89b69925.JPG)
![java2](https://user-images.githubusercontent.com/47063149/77656628-73541080-6f74-11ea-8fcf-dfcd8d40d726.JPG)
![java3](https://user-images.githubusercontent.com/47063149/77656669-81099600-6f74-11ea-9090-335f8caaf497.JPG)
![java4](https://user-images.githubusercontent.com/47063149/77656671-81a22c80-6f74-11ea-8628-152a15589163.JPG)

