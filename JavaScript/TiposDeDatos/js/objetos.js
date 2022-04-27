const nombre = new String("Angel");

const persona = new Object();

persona.nombre = "Angel";
persona.apellido = "Lopez";
persona.edad = "24";

console.log(persona);

const nuevaPersona = {

	// ATRIBUTOS
	nombreCompleto: {
	nombre:"Angel",
	apellido: "Lopez"
	},
	edad : 23,
	pasatiempo: ["cine", "correr", ""],
	tieneTrabajo: false,

	// METODOS
	saludar: function(){
		console.log("Hola");
	},
	sumar: function(a, b){
		console.log(`El resultado de la suma es ${a+b}`);
	}
}

// ATRIBUTO
console.log(nuevaPersona.edad);
console.log(nuevaPersona.pasatiempo[2]);
// METODO
nuevaPersona.saludar();
nuevaPersona.sumar(2, 2);

// CAMBIAR VALOR
nuevaPersona.edad = 25
console.log(nuevaPersona.edad);

// AGREGAR NUEVO METOSO
nuevaPersona.colorFav = "Amarillo";
console.log(nuevaPersona.colorFav);

// EL METODO NOS DICE SI TIENE CIERTA PROPIEDAD - true - false
nuevaPersona.hasOwnProperty("edad");


console.log(Object.keys(nuevaPersona));
console.log(Object.values(nuevaPersona));


