@echo off
:menu
cls
echo  ##############################################################
echo  #                           MENU                             # 
echo  ##############################################################
echo  #                       1. Start                             #
echo  #                       2. Informacje                        #
echo  #                       3. Backup                            #
echo  #                       4. Wyjscie                           #
echo  ##############################################################
set /p select="Wybierz 1/2/3/4:"
IF %select%==1 GOTO opt1
IF %select%==2 GOTO opt2
IF %select%==3 goto opt3
IF %select%==4 goto exit

:opt1
cls
echo Program uruchamia sie...
py pastwisko.py
set /p wybor="Aby wrocic do MENU nacisnij ENTER..."
goto menu
:opt2
cls
echo  ################################################################
echo  #                      PASTWISKO - INFO                        #
echo  ################################################################
echo. #                                                              #
echo  #  Nazwa projektu: Pastwisko                                   #
echo  #  Autor projektu: Dominika Limanowka                          #
echo  #  Tresc projektu pochodzi z konkursu Algorytmion 2013         #
echo. #                                                              #
echo  #  Rolnik ma pastwisko w ksztalcie kola o promieniu 1 m.       #
echo  #  Na okregu tego kola przywiazuje koze.  Napisz program       #
echo  #  wyznaczajacy dlugosc lancucha, aby koza miala mozliwosc     #
echo  #  wygryzienia trawy z polowy pastwiska.                       #
echo. #                                                              #
echo  #  Program rozwiazuje problem rolnika metoda eksperymentalna.  #
echo  #  Losuje dostatecznie duzo punktow z pastwiska rolnika i      #
echo  #  sprawdza ile sposrod nich trafia w obszar, do ktorego ma    #
echo  #  dostep koza, jesli jej lancuch bedzie mial dlugosc 1 metra. #
echo  #  Nastepnie program stopniowo zwieksza dlugosc lancucha do    #
echo  #  momentu, kiedy koza bedzie miala dostep do co najmniej      #
echo  #  polowe pastwiska. Dla kazdego zestawu z inna liczba punktow #
echo  #  do losowania, program powtarza sie 5 razy, aby osiagnac jak #
echo  #  najbardziej wiarygodny wynik. Na koncu, zapisuje wyniki     #
echo  #  (wyliczona dlugosc lancucha) w pliku HTML.                  #
echo. #                                                              #
echo  ################################################################
set /p wybor="Aby wrocic do MENU nacisnij ENTER..."
goto menu
:opt3
cls
echo Backup w trakcie realizacji...
set Day=%Date:~0,2%
set Mth=%Date:~3,2%
set Yr=%Date:~6,4%
set Hour=%Time:~0,2%
if "%hour:~0,1%" == " " set hour=0%hour:~1,1%
set Min=%Time:~3,2%
set name="backup-%date%-%hour%-%min%.html"

mkdir "%cd%\backup\"
xcopy /Y "goat.jpg" %cd%\backup\
echo f | xcopy /Y "strona.html" %cd%\backup\"%name%"

cls
echo  ###################################################
echo  #                       BACKUP                    # 
echo  ###################################################
echo. #                                                 #
echo. #                                                 #
echo  #         Backup zostal wykonany z data           #
echo. #            %name%       #
echo. #                                                 #
echo  ###################################################
set /p wybor="Aby wrocic do MENU nacisnij ENTER..."
goto menu
:exit
echo Wybrales wyjscie
pause