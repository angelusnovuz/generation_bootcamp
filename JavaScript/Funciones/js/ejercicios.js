// PALINDROMO
function palindromo(palabra) {
	if(palabra < 2 || typeof(palabra) != 'string'){
		console.warn("No ingrestaste un texto válido");
		console.error("No ingrestaste un texto válido");
	}else{
		let check = palabra.split("").reverse().join("");
		if (palabra === check){
			return true
		}else{
			return false
		}
	}
}

console.log(palindromo("kayak"));

// REPERTIR TEXTO
function repetir(palabra, n) {
	return repeat = palabra.repeat(n);
}

console.log(repetir("uno", 5));


// DEVOLVER TEXTO
function cortarPalabra(palabra, inicio, fin){
	return palabra.slice(inicio-1, fin)
}

console.log(cortarPalabra("Hola Mundo", 1,  4));


// FACORIAL DE UN NUMERO
function factorial(n){
	if (n == 0) {
        return 1;
    } else {
        return factorial(n - 1) * n;
    }
}
console.log(factorial(12));
