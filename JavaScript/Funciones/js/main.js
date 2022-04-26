function saludar(nombre, apellido){
	// let nombre = "Angel";
	// console.log(`Hola mi nombre es:`, nombre);
	// console.log(`Hola mi nombre es:${nombre?"Angel":"Desconcido"}`);
	return `Mi nombre es ${nombre} ${apellido} `;
}

saludar('Pedro', 'Rojas');


document.write('<h1>Esto es un h1</h1>');
console.log('<h1>Esto es un h1</h1>');


let funcionSaludar = saludar('Pedro', 'Rojas');
console.log(funcionSaludar);
console.log(saludar('Pedro', 'Rojas'));

// FUNCION DECLARADA

function suma ( a, b){
	return a+b;
}

console.log(suma(10, 20));

// FUNCIONES EXPRESADAS | FUNCION EXPRESION
const resta = function(a, b){
	return a - b;
}

console.log(resta(30, 10));

// callback: funcion que se utiliza como parametro
// Hoisting se pueden llamar las funcioes antes de crearlas, solo para funciones declaradas


// FUNCION FLECHA

const mult = (a, b) => {
	return a*b;
}
const multiplicacion = (a, b) => a * b;

console.log(mult(5, 8));

