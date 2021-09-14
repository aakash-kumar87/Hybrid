set projectLocation=C:\Users\Aakash\eclipse-workspace\lifecycle-automation
cd %projectLocation%
set classpath=%projectLocation%\target\classes;%projectLocation%\lib\*;
java org.testng.TestNG %projectLocation%\RunConfigurations\UOWRun.xml