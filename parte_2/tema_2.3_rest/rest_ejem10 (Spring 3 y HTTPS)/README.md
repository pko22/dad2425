Comando para generar la doc (asumiendo estar en la raíz del proyecto) (si estás en Windows recomendable ejecutar el comando en Git Bash, ya que no funciona en Powershell):

```sh
mvn verify -Djavax.net.ssl.trustStore=src/main/resources/keystore.jks -Djavax.net.ssl.trustStorePassword=password
```

Nota: Al generar la keystore.jks con keytool, el CN debe ser localhost, por ejemplo:

```sh
keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass password -validity 360 -keysize 2048
```
```
Enter the distinguished name. Provide a single dot (.) to leave a sub-component empty or press ENTER to use the default value in braces.
What is your first and last name?
  [Unknown]:  localhost
What is the name of your organizational unit?
  [Unknown]:  URJC
What is the name of your organization?
  [Unknown]:  URJC
What is the name of your City or Locality?
  [Unknown]:  Madrid
What is the name of your State or Province?
  [Unknown]:  Madrid
What is the two-letter country code for this unit?
  [Unknown]:  ES
Is CN=localhost, OU=URJC, O=URJC, L=Madrid, ST=Madrid, C=ES correct?
  [no]:  yes
```