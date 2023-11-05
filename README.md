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

{
  "mobile_phone": "prueba",
  "password": "prueba"
}
Response 200 OK
{
    "user": {
        "id": 53,
        "first_name": "prueba",
        "last_name": "prueba",
        "session_active": true,
        "date_birth": "1988-03-17",
        "email": "prueba@yopmail.com",
        "mobile_phone": "020202",
        "password": "$2b$12$HGSW3f6EKIE8zf7JP.gGUeoagaYNnC.6NQAg6k8zHQO.rDBph8Wsq",
        "address": "cl 50 b sur"
    },
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJtb2JpbGVfcGhvbmUiOiIwMjAyMDIiLCJlbWFpbCI6InBydWViYW9uYm9kYXJkaW5nNzAwQHlvcG1haWwuY29tIiwiZXhwIjoxNjMxODkxODM5fQ.26sWIpQk3HsMeLNWK1_sVbDyUbE8nNKUp5s3xjF0Uog",
    "token_type": "bearer"
}


## End-point: GetUsers
Method: GET
/api/v1/users

Headers
Content-Type	Value
Content-Type	application/json
Response 200 OK

[
    {
        "id": 1,
        "first_name": "test",
        "last_name": "test",
        "date_birth": "1996-05-10",
        "mobile_phone": "213212656",
        "email": "test@gmail.com",
        "address": null,
        "city_id": null,
        "session_active": true
    },{
        "id": 1,
        "first_name": "test",
        "last_name": "test",
        "date_birth": "1996-05-10",
        "mobile_phone": "213212656",
        "email": "test@gmail.com",
        "address": null,
        "city_id": null,
        "session_active": true
    },{
        "id": 1,
        "first_name": "test",
        "last_name": "test",
        "date_birth": "1996-05-10",
        "mobile_phone": "213212656",
        "email": "test@gmail.com",
        "address": null,
        "city_id": null,
        "session_active": true
    }
]

## End-point: GetUser
Method: GET
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json
Response 200 OK

{
    "id": 2,
    "document_type_id": null,
    "document_number": null,
    "first_name": null,
    "last_name": null,
    "date_birth": null,
    "mobile_phone": "5654654",
    "email": "test",
    "address": null,
    "city_id": null,
    "session_active": true
}

## End-point: CreateUser
Method: POST
(security) /api/v1/users

Headers
Content-Type	Value
Content-Type	application/json
Body (raw)

{
  "first_name": "string",
  "last_name": "string",
  "date_birth": "2021-09-17",
  "mobile_phone": "string",
  "email": "user@example.com",
  "password": "string",
  "address": "stringst"
}
Response 200 OK
{
  "first_name": "string",
  "last_name": "string",
  "date_birth": "2021-09-17",
  "mobile_phone": "string",
  "email": "user@example.com",
  "password": "string",
  "address": "stringst"
}

## End-point: GetUser
Method: GET
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json
Response 200 OK

{
    "id": 2,
    "document_type_id": null,
    "document_number": null,
    "first_name": null,
    "last_name": null,
    "date_birth": null,
    "mobile_phone": "5654654",
    "email": "test",
    "address": null,
    "city_id": null,
    "session_active": true
}


# End-point: UpdateUser
Method: PUT
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json
Body (raw)


{
  "first_name": "string",
  "last_name": "string",
  "date_birth": "2021-09-17",
  "mobile_phone": "string",
  "email": "user@example.com",
  "password": "string",
  "address": "stringst"
}
Response 200 OK
{
  "first_name": "string",
  "last_name": "string",
  "date_birth": "2021-09-17",
  "mobile_phone": "string",
  "email": "user@example.com",
  "password": "string",
  "address": "stringst"
}

## End-point: DeleteUser
Method: DELETE
(security) /api/v1/users/{id_user}

Headers
Content-Type	Value
Content-Type	application/json
Response 200 OK

{
  "first_name": "string",
  "last_name": "string",
  "date_birth": "2021-09-17",
  "mobile_phone": "string",
  "email": "user@example.com",
  "password": "string",
  "address": "stringst"
}

## ✨¡Gracias! ¡Buena suerte!
