# kata for softeam.


# Welcome to this application test guide 

             ENVIRONMENT
 
 1- java 8 or higher
 2- maven: 3.8.*

# 			 TESTING

# this application can be interracted with via WS calls

by default we have only one clinet and only one account

CLIENT: ID = adtr-uikj456-tred, firstName=jhon,lastName=doe,age = 30, address=Paris
ACCOUNT IBAN = FR270000222233334444A00, clientID = adtr-uikj456-tred, creationDate= '2023-05-23'


# Webserves exposed by this application

1: account details : http://localhost:8080/clients/adtr-uikj456-tred

2: account details : http://localhost:8080/clients/adtr-uikj456-tred/accounts/FR270000222233334444A00/history

3: withdrawal  : http://localhost:8080/clients/adtr-uikj456-tred/accounts/FR270000222233334444A00/withdraw?amount=200

4: saving : http://localhost:8080/clients/adtr-uikj456-tred/accounts/FR270000222233334444A00/save?amount=2000&label=adding
