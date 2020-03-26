#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      dominika
#
# Created:     14.01.2020
# Copyright:   (c) dominika 2020
# Licence:     <your licence>
#-------------------------------------------------------------------------------
import random
import datetime
import math
import os
directory = 'input/'
from operator import itemgetter
def main():
    filehtml = open('strona.html', 'w')
    filehtml.write("""<html>\n<style> th td
	.demo {
        text-align: center;
		border:1px solid #C0C0C0;
		border-collapse:collapse;
		padding:5px;
	}
    table.demo {
    margin-left:auto;
    margin-right:auto;
    }
	.demo th {
        text-align: center;
		border:1px solid #C0C0C0;
		padding:5px;
		background:#0FD755;
	}
	.demo td {
        text-align: center;
		border:1px solid #C0C0C0;
		padding:5px;
	}
    .demo caption {
        display: table-caption;
        text-align: center;
        font-size: 50px;
    }
</style>\n<table class="demo"><caption>Pastwisko</caption>\n<tr><th>Liczba wylosowanych punktów</th> <th>Próba 1</th><th>Próba 2</th><th>Próba 3</th><th>Próba 4</th><th>Próba 5</th></tr></thead>""")
    cnt = 0
    j =0
    tablica = [0]*25
    szer = 80
    print("#" * szer)
    print("#  Liczba wylosowanych  | Proba 1  | Proba 2  | Proba 3  | Proba 4  | Proba 5  #")
    print("#        punktow        |          |          |          |          |          #")
    print("#" * szer)
    for filename in os.listdir(directory):
        strFile=str(filename)
        nazwa = "wyjscie_" + strFile
        file = open(nazwa, 'w')
        file.write("################################################################################\n")
        file.write("#  Liczba wylosowanych  | Proba 1  | Proba 2  | Proba 3  | Proba 4  | Proba 5  #\n")
        file.write("#        punktow        |          |          |          |          |          #\n")
        file.write("################################################################################\n")
        for i in range (0,5):
            cnt+=1
            tablica[j] = projekt(filename,cnt)
            j+=1
        filehtml.write("<tr><td>"+str(tablica[j-5][1])+"</td><td>"+str(tablica[j-5][0])+"m"+"</td><td>"+str(tablica[j-4][0])+"m"+"</td><td>"+str(tablica[j-3][0])+"m"+"</td><td>"+str(tablica[j-2][0])+"m"+"</td><td>"+str(tablica[j-1][0])+"m"+"</td></tr>\n")
        print("#        {:7s}        |   {:4s}   |   {:4s}   |   {:4s}   |   {:4s}   |   {:4s}   #".format(str(tablica[j-5][1]),str(tablica[j-5][0]),str(tablica[j-4][0]),str(tablica[j-3][0]),str(tablica[j-2][0]),str(tablica[j-1][0])))
        file.write("#        "+str(tablica[j-5][1])+"         |   "+str(tablica[j-5][0])+"   |   "+str(tablica[j-4][0])+"   |   "+str(tablica[j-3][0])+"   |   "+str(tablica[j-2][0])+"   |   "+str(tablica[j-1][0])+"   |#\n")
        file.write("################################################################################\n\n")
        file.write("""
               @@   @@@@
          %@  @@@@@&,,@@
         @@@@@@@@       @
   @@@@@@@@@@@@@@@@@
       .@@@@@@@@@@@@
        @@@@@@@@@@@@@@/
      /@@@@@@@@@@@@@@@@@@@@@,                                         @@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     *@@@@@@@@@@@@@@@@@@@@@@   @@@@%
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ &@@@.
         @@@ ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          @@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          @@*   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,
           ..    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                    .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                         &@@@@@@@@@(     %@@@@@@@@@@@@@@@@@@@@@@@@@@
                           #@@@@@@@                          %@@@@@
                            @@@@@@@                           %@@@@@
                            @@@@@@@                            @@@@@
                            @@@@@@@                            (@@@@
                            (@@@@@@                            @@@@@
                             @@*@@@                            @@@@@
                             @@@@@@                           @@@@@@
                             @@@@@@@                         @@@@@@
                            @@@@@@@@                       /@@@@@(
                           @@@@@@@#                        @@@#         """)
    file.close()
    print("#" * szer)
    filehtml.write("""</table><picture>
 <center><img src="goat.jpg" alt="Flowers" style="width:50%;"></center>
</picture>
<br>Wykonano działania w dniu """ + str(datetime.datetime.now()))
    filehtml.write("</body></html>\n")
    filehtml.close()

def projekt(file1,cnt):
    file1 = open("input/"+file1)
    dane = file1.read().split('\n')
    krok = float(dane[0])
    total = int(dane[1])
    file1.close()
    promien = 1
    listax = [0]*total
    listay = [0]*total
    procent = 0
    for i in range(0, total):
        listax[i]=2
        listay[i]=2
        while (listax[i]*listax[i] + listay[i]*listay[i] > 1):
            listax[i] = random.randint(-100, 100)/100
            listay[i] = random.randint(-100, 100)/100
    while(procent<=50):
        counter=0
        for j in range(0, total):
            if (listax[j]*listax[j]+(listay[j]-1)*(listay[j]-1)<=promien):
                counter+=1
        procent = counter*100/total
        procent=round(procent,2)
        promien+=krok
    promien-=krok
    promien=round(promien,2)
    tablica = [promien, total]

    return tablica
if __name__ == '__main__':
    main()



