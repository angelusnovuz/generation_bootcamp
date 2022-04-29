const expresiones = {
	usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	password: /^.{4,12}$/, // 4 a 12 digitos.
	email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	telefono: /^\d{7,14}$/ // 7 a 14 numeros.
}

const formulario = document.querySelector("form");
// console.log(formulario);

const inputs = document.querySelectorAll('input');
// console.log(inputs);

const errorNombre = document.querySelector('#errorNombre');
const errorApellido = document.querySelector('#errorApellido');
const errorEmail = document.querySelector('#errorEmail');
const errorPassword = document.querySelector('#errorPassword');
const errorTelefono = document.querySelector('#errorTelefono');

const statusInf = {
	nombre : false,
	apellido : false,
	email : false,
	password : false,
	telefono : false
}


inputs.forEach((inp) => {
	//console.log(inp);
	inp.addEventListener("keyup", (e)=>{
		// console.log(e.target.name);

		switch (e.target.name) {
			case 'nombre':
				if(expresiones.nombre.test(e.target.value)){
					statusInf.nombre = true;
					errorNombre.textContent = "";
				}else{
					statusInf.nombre = false;
					errorNombre.textContent= "Error";
				}
				break
			case 'apellido':
				if(expresiones.nombre.test(e.target.value)){
					statusInf.apellido = true;
					errorApellido.textContent = "";
				}else{
					statusInf.apellido = false;
					errorApellido.textContent = "Error";
				}
				break
			case 'email':
				if(expresiones.email.test(e.target.value)){
					statusInf.email = true;
					errorEmail.textContent = "";
				}else{
					statusInf.email = false;
					errorEmail.textContent = "Error";
				}
				break
			case 'password':
				if(expresiones.password.test(e.target.value)){
					statusInf.password =true;
					errorPassword.textContent = "";
				}else{
					statusInf.password = false;
					errorPassword.textContent = "Error";
				}
				break
			case 'telefono':
				if(expresiones.telefono.test(e.target.value)){
					statusInf.telefono = true;
					errorTelefono.textContent = "";
				}else{
					statusInf.telefono = false;
					errorTelefono.textContent = "Error";
				}
				break
		}
	})
});


formulario.addEventListener("submit", (e) => {
	// pausar la ejecucuion hasta que termine la funcion
	e.preventDefault();
	// Validar la casilla de terminos
	const check = document.querySelector("#terminos").checked
	// includes busca falso en el arreglo, sino encuantra nos arroja false
	if (!Object.values(statusInf).includes(false) && check == true) {
		console.log("Enviado")
		document.querySelector(".alert-danger").style.display = "none"
		// Guardar las datos del formulario
		const datos = Object.fromEntries( new FormData(e.target) ) 
		console.log(datos) 
		formulario.reset()
	} else{
		console.log("No Enviado")
		document.querySelector(".alert-danger").style.display = "block"
	}
})


