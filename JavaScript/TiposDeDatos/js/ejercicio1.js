
// // NIVEL 
// const anioNacimiento = parseInt(prompt("Ingrese su año de nacimiento: "))
// const anioActual = 2022;
// console.log(`Tienes ${anioActual - anioNacimiento} años`);

// NIVEL 2

// // Opción 1
// function calcularEdad(){
// 	const anioNacimiento = parseInt(document.getElementById('anio').value);
// 	const anioActual = 2022;
// 	console.log(`Tienes ${anioActual - anioNacimiento} años`);
// }

// // Opción 2
// const boton = document.getElementById('calcular');
// boton.addEventListener('click', () => {
// 	const anioNacimiento = parseInt(document.getElementById('anio').value);
// 	const anioActual = 2022;
// 	console.log(`Tienes ${anioActual - anioNacimiento} años`);
// })

const fecha = new Date();
const anio = fecha.getFullYear();
console.log(anio);


const anioActual = 2022; 
const mesActual = 4;
const diaActual = 27;

// NIVEL 3
function mostrarDatos(){
	const nacimiento = document.getElementById('anio').value;
	const nacimientoDividido = nacimiento.split("-");
	const anio = parseInt(nacimientoDividido[0]);
	const mes = parseInt(nacimientoDividido[1]);
	const dia= parseInt(nacimientoDividido[2]);
	
	if(mes <= mesActual && dia <= diaActual  ){
		console.log(`Tienes ${anioActual - anio} años`);
	}else{
		console.log(`Tienes ${anioActual - anio - 1} años`);
	}
}





