# POO-P3-G02
Escuela Superior Politécnica del Litoral
Programación Orientada a Objetos
Proyecto Primer Parcial
2022 – 2T, Paralelo 3

Antecedentes
La empresa Tecnicentro RP S.A. que ofrece servicios de mantenimiento preventivo y correctivo a vehículos necesita un sistema que le ayude a administrar su negocio.  La empresa lo ha contratado a ud y a su equipo para desarrollar el sistema que necesita.

Especificaciones
Carga de datos e inicio de sesión
Al iniciar el sistema deberán crearse en memoria listas de objetos para poder utilizar las funcionalidades del programa.  Llame a este proceso inicializarSistema().  En este método deberá crear en las listas respectivas los siguientes objetos:
4 usuarios (1 admin, 1 cobranzas, 2 técnicos)
4 clientes
6 servicios
2 proveedores
4 ordenes (2 para cada usuario técnico (1 personal y 1 Empresarial) con al menos dos servicios cada uno)

A continuación, el programa pedirá iniciar sesión solicitando usuario y contraseña.
Estos datos ingresados serán verificados con la información que contiene las credenciales de los usuarios registrados en el sistema. Si existe alguna coincidencia de nombre de usuario y contraseña el usuario tiene acceso al sistema y se le presenta las opciones de acuerdo a su perfil. Caso contrario, se le presenta un mensaje de error.

El sistema debe soportar los tipos de usuario: admin, cobranzas y técnico.  Para este proyecto se tendrán los siguientes usuarios:

usuario, contraseña,nombre,nivel
admin1,12345678,Administrador,admin
alopez,al123456,Alvaro Lopez,tecnico
mcastro,mc123456,Maria Castro,cobranzas
mbarcos,mb123456,Mario Barcos,tecnico


Menú admin
Para el usuario nivel admin el menú será el siguiente:
Administrar Clientes
Administrar Proveedores
Administrar servicios

Opción 1 - Administrar Clientes
Al ingresar a esta opción se muestra un listado con la información de los clientes:
Código, Nombre , Dirección, Teléfono, Tipo de Cliente
Código, Nombre , Dirección, Teléfono, Tipo de Cliente

A continuación se le presentará las opciones
Agregar Cliente
Regresar al menú principal

Para agregar un cliente solicitará Nombre. Dirección, Teléfono, Tipo de Cliente, el código será generado automáticamente en base al último código de cliente existente. Los clientes pueden ser tipo Personal o Empresarial.   El nuevo registro será ingresado en la lista de clientes de su sistema

*Luego de la creación deberá mostrar nuevamente el submenú de opciones de clientes

Opción 2 - Administrar Proveedores
Al ingresar a esta opción se muestra un listado con la información de los proveedores:
Código, Nombre , Dirección, Teléfono
Código, Nombre , Dirección, Teléfono

A continuación se le presentará las opciones
Agregar Proveedor
Regresar al menú principal

Para agregar un proveedor solicitará Nombre. Dirección, Teléfono, el código será generado automáticamente en base al último código de proveedor existente.  El nuevo registro será ingresado  en la lista de proveedores de su sistema


*Luego de la creación deberá mostrar nuevamente el submenú de opciones de proveedores

Opción 3 - Administrar Servicios
Al ingresar a esta opción se muestra un listado con la información de los servicios:
Código, Nombre , Precio
Código, Nombre , Precio

A continuación se le presentará las opciones
Agregar Servicio
Editar Servicio
Regresar al menú

Para agregar un servicio solicitará Nombre. Precio, el código será generado automáticamente en base al último código de servicio existente. El nuevo registro será ingresado   en la lista de servicios de su sistema
Si desea editar deberá solicitar el código del servicio y a continuación mostrar para cambiar el precio(Este será el único campo que se podrá editar). 

*Luego de la creación o edición deberá mostrar nuevamente el submenú de opciones de servicios.

Menú técnico
Para el usuario nivel técnico el menú será el siguiente:
Generar orden de servicios
Reportar falta de insumos
Salir

Opción 1 - Generar orden de servicios
En la orden de servicios se especifica los servicios que se realizaron a un cliente.  Los datos que debe ingresar son:
Código del cliente
Fecha servicio
Tipo de vehículo (1- automóvil, 2 motocicletas, 3- bus)
#Placa de vehículo
Y a continuación se deben ingresar los servicios.  Se mantendrá pidiendo el código del servicio y cantidad hasta que escriba -1 en el código
Luego de esto se presentará el valor a pagar.

El nuevo registro será ingresado   en la lista de órdenes de su sistema


Opción 2 - Reportar falta de insumos
En esta opción el técnico podrá reportar que alguno de los implementos de trabajo se ha quedado sin stock.  En esta opción el técnico debe escribir lo que desea reportar.
Descripción:

Luego de que termine de escribir se confirmará si desea enviar la novedad. Luego de la confirmación positiva se enviará un correo a la persona responsable.  Este email estará configurado como una constante en el código de su aplicación.
 
Menú cobranzas
Generar facturas a empresas
Reporte de ingresos por servicios
Reporte de atenciones por técnico

Opción 1- Generar facturas a empresas
En esta opción se generarán las facturas mensuales para los clientes de tipo empresarial.  Además del costo de los servicios, los clientes empresariales pagan $50 cada mes, ya que tienen prioridad para ser atendidos.

En esta opción se solicitará el código de la empresa, año y mes para generar la factura.  Con estos datos deberán leer las órdenes de servicios para esa empresa, en el mes especificado y mostrar la información de los servicios facturados y el total a pagar. Ejemplo de salida

Empresa: Grupo HG S.A
Periodo de facturación: Octubre 2022
Detalle de servicios:
#Placa	Fecha		Tipo		Servicio 		Cantidad 	Total
GST-0984	04-04		Automóvil	Cambio de aceite 	    1		20.00
GNW-087	09-04		Bus		Cambio de filtro	     1		15.00
.
.
Total a pagar: 450.00


Opción 2- Reporte de ingresos por servicios
Al ingresar a esta opción se mostrará cuánto se ha recaudado por cada servicio durante un mes.  El usuario deberá ingresar  el año y mes que desea consultar.  A continuación se mostrará cuánto se recaudó por servicio.

Servicio                                    	Total
alineación				2000
balanceo				2000
cambio de aceite motor		1000
cambio filtro aceite			1000


Opción 3. Reporte de atenciones por técnico
Al ingresar a esta opción se mostrará cuánto cada técnico ha recaudado por servicios realizados.  El usuario deberá ingresar  el año y mes que desea consultar.  A continuación se mostrará cuánto recaudó cada técnico.

Técnico                                    	Total
Alvaro López				2000
Mario Barcos				1500
