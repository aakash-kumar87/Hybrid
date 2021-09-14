set projectLocation=C:\Users\aakas\eclipse-workspace\lifecycle_framework
cd %projectLocation%
set classpath=%projectLocation%\target\classes;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testNG.xml
pause