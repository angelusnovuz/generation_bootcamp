// escribe un ciclo anidado que imprima el siguiente patron
/*

*
* * 
* *
* * * 
* * * *
* * * * *

*/

for (let i = 0; i < 5; i++){
    for (let j = 0; j < i; j++) {
        document.write('*')
        console.log('\n')
        
    }
    document.write('<br>')
}


/*
Ejercicio 1 //Escribe un loop que haga lo siguiente: //Repetidamente imprime el valor de la variable xValue, disminuyendo por 0.5 su valor cada iteración. //El ciclo se mantendrá mientras que el valor de xValue sesitivo. 
*/


let a = 15

for (let i = 10; i > 0; i--) {
    a = a - 0.5
    console.log(a);
}

// Ejercicio 2 //Imprime todos los números impares entre 1 y 100 


for (let i = 0; i < 100; i++) {
    if (i % 2 != 0) {
        console.log(i)
        i++;
    }
}

/*
Ejercicio 3 //Escribe un ciclo while que imprima de 1 a n dentro de corchetes cuadrados //Por ejemplo: si n = 6 imprime [1] [2] [3] [4] [5] [6] 
*/


/*
Ejercicio 4 //Escribe un ciclo que calcule la suma de los numeros positivos entre 1 y n //ejemplo: n = 5 sum = 15 //por que (1 + 2 + 3 + 4 +5 ) 

*/

let n = 5;
let suma = 0;

for (let i = 0; index <= n; i++) {
    suma = suma + i
    
}

console.log(suma);