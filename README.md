##PruebaTecnica
<h3>Acerca de la prueba</h3> 
el proposito de este projecto es de consumir las apis para este caso se creo la entidad empresa para asi obtener el listado de los 3 ultimos registros de la empresa
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

<h2>Herramientas pruebas</h2>
Postman : para probar las apis.

prueba agregar empresa:
![agregar empresa](https://github.com/richixws/PruebaTecnica/assets/62392714/a1f19fe7-c5b9-4054-ba37-bdce7d8cfccb)

prueba  obtener los 3 ultimos registros:
![registro](https://github.com/richixws/PruebaTecnica/assets/62392714/ad5fe393-0fb3-4179-9135-d7f29260a225)







