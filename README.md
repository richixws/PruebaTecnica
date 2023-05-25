# PruebaTecnica

### request agregar empleado:
method: Post: http://localhost:8080/api/empleado
{
    "ruc":"20605100016",
    "razonSocial":"RVM MAQUINARIAS S.A.C.",
    "direccion":"Jr Sucre 350",
    "estado": true
},
{
    "ruc":"0547825781",
    "razonSocial":"DMG DRILLING E.I.R.L.",
    "direccion":"Jr Huallaga 280",
    "estado": true
},


### request obtener 3 ultimos registro de empleado:
method: Get: http://localhost:8080/api/empresas/registro?limit=3


