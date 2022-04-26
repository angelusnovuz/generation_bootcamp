
function invertir(palabra) {
	if (palabra < 2 || typeof(palabra) != 'string'){
		console.warn("No ingrestaste un texto válido");
		console.error("No ingrestaste un texto válido");
	}else{
		return palabra.split("").reverse().join("");
	}   
}

console.log(invertir('Invertir una cadena'));