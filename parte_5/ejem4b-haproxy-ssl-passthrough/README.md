# Ejemplo Haproxy con SSL Passthrough

Este ejemplo levanta un haproxy configurado para hacer ssl passthrough. El puerto 443 de Haproxy se mapea al puerto 9443 de localhost. La conexión es de tipo tcp (actúa como balanceador de nivel 4), de forma que cualquier conexión se pasa tal cual a los servidores configurados en la sección __mybackend__. 

La página de estadísticas (stats) se publica en el puerto 8080 de Haproxy, que se mapea al 9080 de localhost (ver docker-compose). La url es http://localhost:8090/admin?stats.