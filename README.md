#  Tarea de generar una API para gestionar los usuarios y el acceso a la aplicacion. Se define para la capa de datos la siguiente estrucutra:



Name	Data Type	Length/Precision	Not Null
id	int	*	Yes
first_name	varchar	*	Yes
last_name	varchar	*	Yes
date_birth	*	*	Yes
address	*	*	Yes
token	*	*	Not
password	*	120	yes
mobile_phone	varchar	*	yes
email	varchar	*	yes


Teniendo en cuenta la tabla anterior usted debe desarrollar los siguentes endpoints:
Algunos endpoints marcados con (security) deben estar protegidos por un token de acceso.


# End-point: Login 
#Method: POST  
/api/v1/users/login

Headers
Content-Type	Value
Content-Type	application/json
Body (raw)



## End-point: GetUsers
Method: GET
/api/v1/users

Headers
Content-Type	Value
Content-Type	application/json



## End-point: GetUser
Method: GET
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json




## End-point: CreateUser
Method: POST
(security) /api/v1/users

Headers
Content-Type	Value
Content-Type	application/json
Body (raw)



## End-point: GetUser
Method: GET
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json




# End-point: UpdateUser
Method: PUT
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json
Body (raw)



## End-point: DeleteUser
Method: DELETE
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json



## ✨¡Gracias! ¡Buena suerte!
