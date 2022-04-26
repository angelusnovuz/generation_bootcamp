let fechaNac = prompt("Ingrese su fecha: aaaa/mm/dd")
fechaNac = new Date(fechaNac);
console.log(typeof (fechaNac));

let now  = new Date();

let edad = new Date (now - fechaNac);
alert(edad.year)



// let fechaUsuario = document.querySelector("#fechaUsuario");
// let fechaAhora = new Date();
// console.log(fechaAhora);