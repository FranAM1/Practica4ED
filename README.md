# Practica 4 Entornos <br><br> Francisco José Almansa Martínez | Gabriel Tomás Vidal

Para esta práctica hemos reutilizado las clases que creamos en la practica 3 y hemos realizado una serie de cambios para practicar comandos git, utilizando versionado semántico.

# Índice
1. [Pasos de inicializacion del proyecto](#pasos-de-inicializacion-del-proyecto)
2. [Creación y uso de la rama secundaria para hacer cambios](#creación-y-uso-de-la-rama-secundaria-para-hacer-cambios)
3. [Primer merge](#primer-merge)
4. [Segundo merge](#segundo-merge)
5. [Diagrama de las versiones](#diagrama-de-las-versiones)



# Pasos de inicializacion del proyecto
- Para comenzar, inicializamos el proyecto en git con el siguientes comandos (El repositorio lo creamos manualmente desde la pagina de GitHub).
~~~
git innit
git branch -M main
git remote add origin https://github.com/FranAM1/Practica4ED
~~~
![image](https://user-images.githubusercontent.com/91600940/158676076-5b57be02-b8ae-40f4-80c8-8883008f335e.png) <br>
![image](https://user-images.githubusercontent.com/91600940/158677067-8d4adb7c-2cdd-4d15-9bcb-1b64d6264b17.png)

Como se puede ver en el primer push la rama main, intentamos crear el README por comando pero luego nos percatamos nos ocasionaba error de compatibilidad a la hora de hacer ciertas tareas, y al final lo acabamos añadiendo de forma manual en github.

- Como en la carpeta ya teniamos el proyecto de java, hicimos uso de los siguientes comandos para hacer nuestro primer push del proyecto.
~~~
git add .
git commit -m <descripción>
git push
~~~
![image](https://user-images.githubusercontent.com/91600940/158677714-79b6bf10-b36b-4d2f-8dbf-64d18fa10a54.png) <br>
![image](https://user-images.githubusercontent.com/91600940/158677831-14ffa02a-1c75-4a17-8b2e-080108dac6c5.png)



- Tambien creamos nuestra primera tag haciendo referencia a la primera version del proyecto con el siguiente comando.
~~~
git tag <version> -m <descripción>
~~~
![image](https://user-images.githubusercontent.com/91600940/158678691-15db1e0e-e14b-452f-8082-b3e072bd9c40.png)

- Por último, hacemos un push tanto del commit como del tag para así tener todo el proyecto inicializado correctamente.

![image](https://user-images.githubusercontent.com/91600940/158679293-39499727-ff41-488d-8c7d-4817adcc4449.png)



# Creación y uso de la rama secundaria para hacer cambios
- Para crear esta nueva rama, a la cual hemos llamado development, hemos utilizado el siguiente comando.
~~~
git branch development
~~~
![image](https://user-images.githubusercontent.com/91600940/158680306-2c329a99-5b38-4f36-a17a-42af71bd2cb0.png)

Así pues, podemos observar mediante el coamando ```git branch``` las diferentes ramas que tenemos y como nos encontramos actualmente en la rama main.

- Para cambiar entre las diferentes ramas utilizamos el siguiente comando.
~~~
git checkout <nombre de la rama>
~~~
![image](https://user-images.githubusercontent.com/91600940/158901438-c406f42c-3105-4d6d-96fc-3f84e6053d0c.png)

Una vez en la rama developments, asi como en el resto del proyecto, fuimos haciendo diferentes cambios siguiendo el mismo orden de
~~~
git add .
git commit -m <descripción>
git push
~~~

# Primer merge
En este primer merge, eliminamos la interfaz sonido e hicimos todos los cambios necesarios en las clases que la implementaban.

- Para realizar el merge correctamente nos situamos nuevamente en la rama main utilizando el comando ```git checkout main```. <br>
Estando en la rama principal utilizar el comando ```git merge development```, de esta forma se nos creará el commit con los cambios que hicimos en la rama development, y simplemente se finalizaría con un ```push```.<br><br>
![image](https://user-images.githubusercontent.com/91600940/158902970-f1bc1800-da47-4608-b233-faf12c785c1f.png)

# Segundo merge
Para este segundo merge hicimos cambios de nombres tanto en clases como atributos.
- Clase ~~Mascota~~ Animal
- Atributo ~~colegio~~ escuela

Los pasos para ir actualizando el repositorio fueron exactamente iguales que todo lo anteriormente comentado.

# Diagrama de las versiones




