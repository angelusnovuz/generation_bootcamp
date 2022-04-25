

window.addEventListener('load', function(){
	this.alert('Seha terminado de cargar la pagina')
})


function saludar(){
	alert('Hola');
}

// MANEJADOR DE EVENTOS SEMANTICOS
const botonSemantico = document.getElementById('evento-semantico');
botonSemantico.onclick = saludar;

botonSemantico.onclick = function (evento){
	// alert('Hola desde un manejador de eventos semanticos')
	console.log(evento.target)
}

// MANEJADOR DE EVENTOS MULTIPLES
const botonMultiple = document.getElementById('evento-multiple');

// Se pueden ejecutar varias funciones para un elemeto al mismo tiempo
botonMultiple.addEventListener('click', function(){
	alert("Hola desde manejador multiple")
})

botonMultiple.addEventListener('click', function(e){
	console.log(e.target);
})

