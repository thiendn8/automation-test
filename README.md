# mbank-automation-test
To run the mbank-automation-test:
# setup environment
- jdk 1.8
- checkout code on master of mbank-automation-test
- update again ROOT_URL_APP with change hostname. (http://[hostname]/mbank/userMainservlet?PROGRAM_ID=LOGIN&mode=GLOBAL_NAVI&kojin_id=) in sys-customer-config.properties
- run app : http://[hostname]/mbank/userMainservlet?PROGRAM_ID=LOGIN&mode=GLOBAL_NAVI&kojin_id=
- now begin run each test case selenium

# You can the direction url save screen shot reseult in sys-customer-config.properties.
# automation-test
