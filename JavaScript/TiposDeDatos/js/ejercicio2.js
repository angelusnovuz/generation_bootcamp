const angel = {

	// ATRIBUTOS
	nombreCompleto: {
		nombre:"Angel",
		apellido: "Lopez"
	},
	edad : 23,
	pasatiempos: ["cine", "correr", "dibujar"]
}

const Alexander = {
    nombreCompleto: {
        nombre: "Alexander tovar",
        apellido: "martinez"
    },
    edad: 24,
    pasatiempos: ["descanzar","dibujar","plantas"]
}

const luis = {
	nombreCompleto: {
		nombre: "Luis",
		apellido: "Jimenez",
	},
	edad: 30,
	pasatiempos: ["leer", "guitarra", "ajedrez"]
}


const Arantxa = { 
    nombreCompleto: {
    	nombre: "Arantxa", 
    	apellido: "Perez"
    },
    edad: 26,
    pasatiempos: ["caminar", "patinar", "musica"]
}


const gabriel = {
    nombreCompleto: {
        nombre: "ganriel",
        apellido: "gonzalez"
    },
    edad: 20,
    pasatiempos: ["jugar","salir","correr"]
}


const Donovan = {
    nombreCompleto: {
        nombre: "Donovan",
        apellido: "Martinez"
    },
    edad: 24,
    pasatiempos: ["futbol","Lectura","anime"]
}

const santiago = {
    nombreCompleto: {
    	nombre:"carlos",
	    apellido:"cruz",
    },
    edad: 29,
    pasatiempos: ["futbol", "estudiar", "anime"],    
}


const cohorte12 = [angel, Alexander, luis, Arantxa, gabriel, Donovan, santiago]
console.log(cohorte12);

for (let i = 0; i < cohorte12.length; i++) {
	if(cohorte12[i].pasatiempos.includes("leer");
		console.log(cohorte12[i].pasatiempos.nombreCompleto.nombre);

}