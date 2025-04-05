clases tentativas: Cliente (nombre, apellido, correo, numero, estado civil, ciudad) crear nuevo cliente, borrar cliente. todos clientes en json file
dispositivo(marca, memoria ram, memoria storage, procesador, modelo, año fabricación, precio, stock)
agregar nuevo dispositivo, borrar dispositivo, descontar stock de dispositivo. todo dispositivo vigente en json file
tienda(dirección, catalogo dispositivos, tipo dispositivo lista(?)) cada tienda registrada en json file
agregar dispositivo a catalogo, quitar de catalogo
compra(lista dispositivos, cliente, fecha compra) (debe descontar de catalogo) "boleta" como archivo json
notas sobre dispositivos: 
-computadores: especificar tarjeta de video, fuente de poder, chasis, pantalla asociada (marca, modelo, año)
-notebooks: resolución pantalla, tipo teclado, batería (mAh)
-tablets: resolución pantalla, lista accesorios(lapiz, funda, etc)
-tabla de especificaciones, información detallada de cada dispositivo + cada característica(?)

funcionalidades mencionadas en actividad: 
- agregar cliente y dispositivos con respectivas validaciones (y gestión de datos)
- modificar dirección de tienda electrónica (+ gestión datos)
- realizar ventas de dispositivos a cliente especifico
-bucar dispositivo tecnológico por marca, modelo o tipo, obtener información de dispositivo tecnológico

cada funcionalidad: asociada a clase asociada con gestión de datos. en todo momento, mantener archivo con información (.csv, txt, json)
