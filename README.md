# Modelado y Simulación

## Euler

1. En la carpeta /jars podemos encontrar el archivo *euler-1.jar*
2. Descargar el mismo, y ejecutarlo desde una linea de comando **cmd** utilizando el comando **java -jar euler-1.jar**
3. Se ejecutará el servidor interno de Spring Boot, y expondrá una API Rest que podrá ser utilizada en las siguietes rutas:
   - **Euler**: http://localhost:8090/euler
   - **Euler mejorado**: http://localhost:8090/eulerMejorado
4. La API esperará recibir los siguientes parámetros: **inicio**, **fin**, **x0**, **fx0**, **intervalos** y **funcion**. La función posee las variables *x* e *y*, y se entiende que F(x0) = fx0
5. La API devolverá una respuesta con los puntos necesarios para gráficar el resultado, y, a su vez, graficará en una ventana de Java los mismos.

### Ejemplo de json enviado a la API
```
{
	"inicio": 0,
	"fin": 1,
	"x0": 0,
	"fx0": 0,
	"intervalos": 500,
	"funcion": "2x+6y"
}
```
  
