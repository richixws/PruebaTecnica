##PruebaTecnica
<h3>Acerca de la prueba</h3> 
el proposito de este projecto es de consumir las apis para este caso se creo la empresa asi como el listado de los 3 ultimos registros de la empresa
se tiene los siguientes link:

### request agregar empresa:
* Method: Post:
* http://localhost:8080/api/empleado


### request obtener 3 ultimos registro de empresa:
* Method get :
* http://localhost:8080/api/empresas/registro?limit=3

### se utilizo Basic Authentication la Anotación de nivel de método de Spring Security @PreAuthorize:
#Role Empresa: 
user: empresa
contraseña: 12345

#Role Admin:
user: admin
contraseña: 12345


<h4>spring boot tecnologuias</h4>
* H2
* Spring Boot
* Java
* Spring Jpa
* Spring Security

<h1>Herramientas</h1>
Postman : para probar las apis.



