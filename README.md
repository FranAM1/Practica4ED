# Practica 4 Entornos <br><br> Francisco José Almansa Martínez | Gabriel Tomás Vidal

Para esta práctica hemos reutilizado las clases que creamos en la practica 3 y hemos realizado una serie de cambios para practicar comandos git, utilizando versionado semántico.

## Pasos de inicializacion del proyecto
- Para comenzar, inicializamos el proyecto en git con el siguientes comandos.
~~~
git innit
git branch -M main
git remote add origin https://github.com/FranAM1/Practica4ED
~~~
![image](https://user-images.githubusercontent.com/91600940/158676076-5b57be02-b8ae-40f4-80c8-8883008f335e.png) <br>
![image](https://user-images.githubusercontent.com/91600940/158677067-8d4adb7c-2cdd-4d15-9bcb-1b64d6264b17.png)

Como se puede ver en la rama main, intentamos crear el README por comando pero luego nos percatamos nos ocasionaba error de compatibilidad a la hora de hacer ciertas tareas, y al final lo acabamos añadiendo de forma manual en github.

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



## Creación y uso de la rama secundaria para hacer cambios
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
![image](https://user-images.githubusercontent.com/91600940/158681198-4e0143e5-300c-4256-b5e6-38bfbd2e0dd0.png)




